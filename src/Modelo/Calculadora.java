/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Util.Pila;

/**
 *
 * @author Gabriel Jaimes
 */
public class Calculadora {

    public Calculadora() {
    }

    public boolean esOperador(String c) {
        return (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("(") || c.equals(")"));
    }

    public int getPrioridad(String info) {
        switch (info) {
            case "+":
            case "-":
                return 0;
            case "*":
            case "/":
                return 1;
            case "(":
            case ")":
                return 2;
            default:
                return 0;
        }
    }
    public String[] posfijo(String e) {
        String VectorString[] = this.dividir(casteoArrayChar(e.toCharArray()));
        String solucion[] = new String[VectorString.length];
        Pila pilaXD = new Pila();
        int i = 0;
        int x = 0;
        while (i < solucion.length) {
            //if (VectorString[i].equals("")) {
            //} else {
                if (!this.esOperador(VectorString[i])) {
                    solucion[x] = VectorString[i];
                    x++;
                } else {
                    if (pilaXD.esVacia()) {
                        pilaXD.apilar(VectorString[i]);
                    } else {
                        if (VectorString[i].equals(")")) {
                            String aux = (String) pilaXD.desapilar();
                            while (!aux.equals("(")) {
                                solucion[x] = aux;
                                x++;

                                aux = (String) pilaXD.desapilar();
                            }
                        } else {
                            String ultimo = (String) pilaXD.desapilar();
                            if (!ultimo.equals("(") && this.getPrioridad(ultimo) >= this.getPrioridad(VectorString[i])) {
                                solucion[x] = ultimo;
                                x++;
                            } else {
                                if (this.esOperador(VectorString[i])) {
                                    pilaXD.apilar(ultimo);
                                }
                            }
                            if (this.esOperador(VectorString[i])) {
                                pilaXD.apilar(VectorString[i]);
                            }
                        }
                    }
                }
            //}
            i++;

        }
        while (pilaXD.getTamanio() > 0) {

            solucion[x] = (String) pilaXD.desapilar();
            x++;
        }
        return solucion;
    }

    //El metodo de la clase String toCharArray() me devuelve es un arreglo de char, datos primitivos,
    //por lo cual no puedo acceder al toString de la clase Character
    private Character[] casteoArrayChar(char x[]){
        Character c[] = new Character[x.length];
        for(Integer i=0; i<x.length; i++){
            c[i] = x[i];
        }
        return c;
    }
    
    public String[] prefija(String e) {
        String VectorString[] = this.dividir(casteoArrayChar(e.toCharArray()));
        String solucion[] = new String[VectorString.length];
        Pila pilaXD = new Pila();
        int i = 0;
        int x = solucion.length-1;
        while (i < solucion.length) {
            //if (VectorString[i].equals("")) {
            //} else {
                if (!this.esOperador(VectorString[i])) {
                    solucion[x] = VectorString[i];
                    x--;
                } else {
                    if (pilaXD.esVacia()) {
                        pilaXD.apilar(VectorString[i]);
                    } else {
                        if (VectorString[i].equals(")")) {
                            String aux = (String) pilaXD.desapilar();
                            while (!aux.equals("(")) {
                                solucion[x] = aux;
                                x--;
                                aux = (String) pilaXD.desapilar();
                            }
                        } else {
                            String ultimo = (String) pilaXD.desapilar();
                            if (!ultimo.equals("(") && this.getPrioridad(ultimo) >= this.getPrioridad(VectorString[i])) {
                                solucion[x] = ultimo;
                                x--;
                            } else {
                                if (this.esOperador(VectorString[i])) {
                                    pilaXD.apilar(ultimo);
                                }
                            }
                            if (this.esOperador(VectorString[i])) {
                                pilaXD.apilar(VectorString[i]);
                            }
                        }
                    }
                }
            //}
            i++;

        }
        while (pilaXD.getTamanio() > 0) {

            solucion[x] = (String) pilaXD.desapilar();
            x--;
        }
        return solucion;
    }
 
    //Problema de un numero de mas de dos digitos resuelto y aplicacion de tokens
    public String[] dividir(Character[] txt) {
        String numeros = "";
        String resultado = "";
        for (int i = 0; i < txt.length; i++) {
            if (this.esOperador(txt[i].toString())) {
               resultado += numeros +","+ txt[i]+",";
               numeros = "";//reset
            }else{
                numeros += txt[i];
            }
        }
        resultado += numeros;
        return resultado.split(",");

    }
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        String tmp = "";
        for(String t : c.dividir(new Character[]{'1','1','+','2'})){
            tmp += t;
        }
        System.out.println(tmp);
    }
    //Reduci codigo
    public Double resultadoOperaciones(String[] notacion) {
        Pila<Double> rta = new Pila<>();
        Double op1, op2;
        for (int i = 0; i < notacion.length; i++) {
            if (!this.esOperador(notacion[i])) {
                rta.apilar(Double.parseDouble(notacion[i]));
            } else if (!notacion[i].equals(",")) {
                op2 = Double.parseDouble(rta.desapilar().toString());
                op1 = Double.parseDouble(rta.desapilar().toString());
                switch (notacion[i]) {
                    case "+":
                        rta.apilar(op1 + op2);
                        break;
                    case "*":
                        rta.apilar(op1 * op2);
                        break;
                    case "-":
                        rta.apilar(op1 - op2);
                        break;
                    case "/":
                        rta.apilar(op1 / op2);
                        break;
                }
            }
        }
        return rta.desapilar();
    }
}
