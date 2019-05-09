/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Control;
import javax.swing.JOptionPane;

public class ViewCalculadora extends javax.swing.JFrame {

    Control ctrl;
    private int con = 0;

    public ViewCalculadora() {
        initComponents();
        ctrl = new Control();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jlDivision = new javax.swing.JLabel();
        jlMultiplicacion = new javax.swing.JLabel();
        jlMenos = new javax.swing.JLabel();
        jlMas = new javax.swing.JLabel();
        jlResultado = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jl9 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jl5 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl0 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jl7 = new javax.swing.JLabel();
        bORARUNCARACTEr = new javax.swing.JLabel();
        bORARTODo = new javax.swing.JLabel();
        jlParentisisAbre1 = new javax.swing.JLabel();
        jlParentisisCierra2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculadora"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jlDivision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDivision.setText("/");
        jlDivision.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jlDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlDivisionMouseClicked(evt);
            }
        });

        jlMultiplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMultiplicacion.setText("*");
        jlMultiplicacion.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jlMultiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMultiplicacionMouseClicked(evt);
            }
        });

        jlMenos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenos.setText("-");
        jlMenos.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jlMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenosMouseClicked(evt);
            }
        });

        jlMas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMas.setText("+");
        jlMas.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jlMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMasMouseClicked(evt);
            }
        });

        jlResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlResultado.setText("=");
        jlResultado.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jlResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlResultadoMouseClicked(evt);
            }
        });

        jl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3.setText("3");
        jl3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl3MouseClicked(evt);
            }
        });

        jl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl6.setText("6");
        jl6.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl6MouseClicked(evt);
            }
        });

        jl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl9.setText("9");
        jl9.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl9MouseClicked(evt);
            }
        });

        jl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl8.setText("8");
        jl8.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl8MouseClicked(evt);
            }
        });

        jl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl5.setText("5");
        jl5.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl5MouseClicked(evt);
            }
        });

        jl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2.setText("2");
        jl2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl2MouseClicked(evt);
            }
        });

        jl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl0.setText("0");
        jl0.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl0MouseClicked(evt);
            }
        });

        jl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl1.setText("1");
        jl1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl1MouseClicked(evt);
            }
        });

        jl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl4.setText("4");
        jl4.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl4MouseClicked(evt);
            }
        });

        jl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl7.setText("7");
        jl7.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl7MouseClicked(evt);
            }
        });

        bORARUNCARACTEr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bORARUNCARACTEr.setText("C");
        bORARUNCARACTEr.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        bORARUNCARACTEr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bORARUNCARACTErMouseClicked(evt);
            }
        });

        bORARTODo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bORARTODo.setText("CE");
        bORARTODo.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        bORARTODo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bORARTODoMouseClicked(evt);
            }
        });

        jlParentisisAbre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlParentisisAbre1.setText("(");
        jlParentisisAbre1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jlParentisisAbre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlParentisisAbre1MouseClicked(evt);
            }
        });

        jlParentisisCierra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlParentisisCierra2.setText(")");
        jlParentisisCierra2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jlParentisisCierra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlParentisisCierra2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMultiplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bORARTODo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bORARUNCARACTEr, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlParentisisCierra2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlParentisisAbre1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDivision)
                    .addComponent(jl9)
                    .addComponent(jl8)
                    .addComponent(jl7)
                    .addComponent(jlParentisisAbre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMultiplicacion)
                    .addComponent(jl6)
                    .addComponent(jl5)
                    .addComponent(jl4)
                    .addComponent(jlParentisisCierra2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMenos)
                    .addComponent(jl3)
                    .addComponent(jl2)
                    .addComponent(jl1)
                    .addComponent(bORARUNCARACTEr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMas)
                    .addComponent(jl0)
                    .addComponent(jlResultado)
                    .addComponent(bORARTODo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlResultadoMouseClicked
    jTextArea1.setText(ctrl.posFijoPrefijo(jTextArea1.getText()));
//         jTextArea1.setText(ctrl.prefija(jTextArea1.getText()));
       
    }//GEN-LAST:event_jlResultadoMouseClicked

    private void jl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl7MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl7.getText());
    }//GEN-LAST:event_jl7MouseClicked

    private void jl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl8MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl8.getText());
    }//GEN-LAST:event_jl8MouseClicked

    private void jl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl9MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl9.getText());
    }//GEN-LAST:event_jl9MouseClicked

    private void jlDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDivisionMouseClicked
        jTextArea1.setText(jTextArea1.getText() + jlDivision.getText());
    }//GEN-LAST:event_jlDivisionMouseClicked

    private void jl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl4MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl4.getText());
    }//GEN-LAST:event_jl4MouseClicked

    private void jl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl5MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl5.getText());
    }//GEN-LAST:event_jl5MouseClicked

    private void jl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl6MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl6.getText());
    }//GEN-LAST:event_jl6MouseClicked

    private void jlMultiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMultiplicacionMouseClicked
        jTextArea1.setText(jTextArea1.getText() + jlMultiplicacion.getText());
    }//GEN-LAST:event_jlMultiplicacionMouseClicked

    private void jl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl1MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl1.getText());
    }//GEN-LAST:event_jl1MouseClicked

    private void jl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl2MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl2.getText());
    }//GEN-LAST:event_jl2MouseClicked

    private void jl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl3MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl3.getText());
    }//GEN-LAST:event_jl3MouseClicked

    private void jlMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenosMouseClicked
        jTextArea1.setText(jTextArea1.getText() + jlMenos.getText());
    }//GEN-LAST:event_jlMenosMouseClicked

    private void jl0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl0MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jl0.getText());
    }//GEN-LAST:event_jl0MouseClicked

    private void jlMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMasMouseClicked
        jTextArea1.setText(jTextArea1.getText() + jlMas.getText());
    }//GEN-LAST:event_jlMasMouseClicked

    private void bORARUNCARACTErMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bORARUNCARACTErMouseClicked
        String cadena;
        cadena = jTextArea1.getText();
        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            jTextArea1.setText(cadena);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_bORARUNCARACTErMouseClicked

    private void bORARTODoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bORARTODoMouseClicked
        jTextArea1.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_bORARTODoMouseClicked

    private void jlParentisisAbre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlParentisisAbre1MouseClicked
        jTextArea1.setText(jTextArea1.getText() + jlParentisisAbre1.getText());
// TODO add your handling code here:
    }//GEN-LAST:event_jlParentisisAbre1MouseClicked

    private void jlParentisisCierra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlParentisisCierra2MouseClicked
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + jlParentisisCierra2.getText());
    }//GEN-LAST:event_jlParentisisCierra2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bORARTODo;
    private javax.swing.JLabel bORARUNCARACTEr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jl0;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    private javax.swing.JLabel jlDivision;
    private javax.swing.JLabel jlMas;
    private javax.swing.JLabel jlMenos;
    private javax.swing.JLabel jlMultiplicacion;
    private javax.swing.JLabel jlParentisisAbre1;
    private javax.swing.JLabel jlParentisisCierra2;
    private javax.swing.JLabel jlResultado;
    // End of variables declaration//GEN-END:variables
}
