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

    private String posFija(String notacion) {
        String[] resultado = calculadora.posfijo(notacion);
        String info = "";
        try{
            for (int i = 0; i < resultado.length; i++) {
                if (resultado[i] == null) {
                    break;
                }
                if (i == 0) {
                    info += resultado[i];
                }
                if (i != 0) {
                    info += "" + resultado[i];
                }
            }
            info += "\n";
            info += "Resultado: " + calculadora.resultadoOperaciones(resultado)+"\n";
        }catch (Exception e){
        
        }
        
        return info;
    }
    
      public String prefija(String notacion) {
        String[] resultado = calculadora.prefija(notacion);
        String info = "";
        try {
            for (int i = 0; i < resultado.length; i++) {
                if (resultado[i] == null) {
                    break;
                }
                if (i == 0) {
                    info += resultado[i];
                }
                if (i != 0) {
                    info += "" + resultado[i];
                }
            }
            info += "\n";
            info += "Resultado: " + calculadora.resultadoOperaciones(resultado)+"\n" ;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "vuelva a escribir la expresion aritmetica");
        }

        return info;
    }


    public String posFijoPrefijo(String notacion){
    String info="";
    
        try {
             info = posFija(notacion);
             info += prefija(notacion);
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "vuelva a escribir la expresion aritmetica");
        }
    return info;
    }

public String parentisis(String datos, int con) {

        String info = null;
        try {
            if (con % 2 == 0) {
                info = datos + "(";
                con++;
                System.out.println(con);
            } else {
                info = datos + ")";
                con = 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return info;
    }

}
