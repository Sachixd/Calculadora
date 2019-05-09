/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Jaimes
 */
public class Control {

    Calculadora calculadora;

    public Control() {
        calculadora = new Calculadora();
    }
    
    //Reduci codigo
    private String posFija(String notacion) {
        return toStringArray(calculadora.posfijo(notacion));
    }
    
    //Reduci codigo x2 xd
      public String prefija(String notacion) {
        return toStringArray(calculadora.prefija(notacion));
    }
    
    private String toStringArray(String x[]){
        String tmp = "";
        for(String t : x){
            tmp += t;
        }
        return tmp+"\n";
    }

    public String posFijoPrefijo(String notacion){
    String info="";
    
        try {
             info = posFija(notacion)+prefija(notacion)+"Resultado: "+calculadora.resultadoOperaciones(calculadora.posfijo(notacion));
        } catch (Exception e) {
            System.out.println(e.getMessage());
              JOptionPane.showMessageDialog(null, "vuelva a escribir la expresion aritmetica");
        }
    return info;
    }
}
