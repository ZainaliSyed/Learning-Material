/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author Goswami
 */
public class calculatorNewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form calculatorNewJFrame
     */
    String value1;
    String op;
    public calculatorNewJFrame() {
        initComponents();
       setSize(530,325);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        textfield = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        reminder = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        subtraction = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(textfield);
        textfield.setBounds(10, 10, 500, 62);

        jRadioButton1.setText("Degrees");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(10, 80, 69, 23);

        jRadioButton2.setText("Radians");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(90, 80, 70, 23);

        jRadioButton3.setText("Grads");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(170, 80, 60, 23);

        jButton3.setText("In");
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 110, 50, 30);
        getContentPane().add(jButton9);
        jButton9.setBounds(10, 110, 50, 30);

        jButton10.setText("(");
        getContentPane().add(jButton10);
        jButton10.setBounds(160, 110, 50, 30);

        jButton11.setText("Inv");
        getContentPane().add(jButton11);
        jButton11.setBounds(60, 110, 50, 30);

        jButton5.setText(")");
        getContentPane().add(jButton5);
        jButton5.setBounds(210, 110, 50, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton6.setText("cos");
        getContentPane().add(jButton6);
        jButton6.setBounds(110, 170, 50, 30);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton12.setText("dms");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(10, 170, 50, 30);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton13.setText("x2");
        getContentPane().add(jButton13);
        jButton13.setBounds(160, 170, 50, 30);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton14.setText("cosh");
        getContentPane().add(jButton14);
        jButton14.setBounds(60, 170, 50, 30);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(jButton15);
        jButton15.setBounds(210, 170, 50, 30);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton16.setText("n!");
        getContentPane().add(jButton16);
        jButton16.setBounds(210, 140, 50, 30);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton17.setText("x2");
        getContentPane().add(jButton17);
        jButton17.setBounds(160, 140, 50, 30);

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton18.setText("sin");
        getContentPane().add(jButton18);
        jButton18.setBounds(110, 140, 50, 30);

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton19.setText("sinh");
        getContentPane().add(jButton19);
        jButton19.setBounds(60, 140, 50, 30);

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton20.setText("Int");
        getContentPane().add(jButton20);
        jButton20.setBounds(10, 140, 50, 30);

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton21.setText("tan");
        getContentPane().add(jButton21);
        jButton21.setBounds(110, 200, 50, 30);

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton22.setText("dms");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(10, 200, 50, 30);

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton23.setText("x2");
        getContentPane().add(jButton23);
        jButton23.setBounds(160, 200, 50, 30);

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton24.setText("tanh");
        getContentPane().add(jButton24);
        jButton24.setBounds(60, 200, 50, 30);

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(jButton25);
        jButton25.setBounds(210, 200, 50, 30);

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton26.setText("Mod");
        getContentPane().add(jButton26);
        jButton26.setBounds(110, 230, 50, 30);

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton27.setText("F-E");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27);
        jButton27.setBounds(10, 230, 50, 30);

        jButton28.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton28.setText("log");
        getContentPane().add(jButton28);
        jButton28.setBounds(160, 230, 50, 30);

        jButton29.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton29.setText("Exp");
        getContentPane().add(jButton29);
        jButton29.setBounds(60, 230, 50, 30);

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(jButton30);
        jButton30.setBounds(210, 230, 50, 30);

        jButton31.setText("In");
        getContentPane().add(jButton31);
        jButton31.setBounds(360, 80, 50, 30);
        getContentPane().add(jButton32);
        jButton32.setBounds(260, 80, 50, 30);

        jButton33.setText("(");
        getContentPane().add(jButton33);
        jButton33.setBounds(410, 80, 50, 30);

        jButton34.setText("Inv");
        getContentPane().add(jButton34);
        jButton34.setBounds(310, 80, 50, 30);

        jButton35.setText(")");
        getContentPane().add(jButton35);
        jButton35.setBounds(460, 80, 50, 30);

        jButton36.setText("C");
        getContentPane().add(jButton36);
        jButton36.setBounds(360, 110, 50, 30);
        getContentPane().add(jButton37);
        jButton37.setBounds(260, 110, 50, 30);

        jButton38.setText("-+");
        getContentPane().add(jButton38);
        jButton38.setBounds(410, 110, 50, 30);

        jButton39.setText("CE");
        getContentPane().add(jButton39);
        jButton39.setBounds(310, 110, 50, 30);
        getContentPane().add(jButton40);
        jButton40.setBounds(460, 110, 50, 30);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(360, 140, 50, 30);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(260, 140, 50, 30);

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        getContentPane().add(divide);
        divide.setBounds(410, 140, 50, 30);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(310, 140, 50, 30);

        reminder.setText("%");
        reminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderActionPerformed(evt);
            }
        });
        getContentPane().add(reminder);
        reminder.setBounds(460, 140, 50, 30);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(360, 170, 50, 30);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(260, 170, 50, 30);

        multiplication.setText("x");
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationActionPerformed(evt);
            }
        });
        getContentPane().add(multiplication);
        multiplication.setBounds(410, 170, 50, 30);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(310, 170, 50, 30);

        jButton50.setText("1/x");
        getContentPane().add(jButton50);
        jButton50.setBounds(460, 170, 50, 30);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(360, 200, 50, 30);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(260, 200, 50, 30);

        subtraction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subtraction.setText("-");
        subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionActionPerformed(evt);
            }
        });
        getContentPane().add(subtraction);
        subtraction.setBounds(410, 200, 50, 30);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(310, 200, 50, 30);

        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        getContentPane().add(equal);
        equal.setBounds(460, 200, 50, 60);

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        getContentPane().add(plus);
        plus.setBounds(360, 230, 50, 30);

        zero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero);
        zero.setBounds(260, 230, 100, 30);

        jButton58.setText(".");
        getContentPane().add(jButton58);
        jButton58.setBounds(410, 230, 50, 30);

        jMenu1.setText("view");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("help");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(btn1==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"1");
        
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if(btn2==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"2");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(btn3==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"3");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(btn4==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"4");
    }//GEN-LAST:event_btn4ActionPerformed
    }
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
         if(btn5==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"5");
         }                             
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
         if(btn6==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"6");
         }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
         if(btn7==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"7");
       }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
         if(btn8==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"8");
         }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if(btn9==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"9");
        }
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        if(zero==evt.getSource()){
        String s=textfield.getText();
        textfield.setText(s+"0");
        }
    }//GEN-LAST:event_zeroActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        // TODO add your handling code here:
        if(divide==evt.getSource())
         { value1=textfield.getText();
         op="/";
        textfield.setText("");
        }
    }//GEN-LAST:event_divideActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed
        // TODO add your handling code here:
        if(multiplication==evt.getSource())
        {
        value1=textfield.getText();
        op="*";
        textfield.setText("");
        }   
    }//GEN-LAST:event_multiplicationActionPerformed

    @SuppressWarnings("empty-statement")
    private void subtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionActionPerformed
        // TODO add your handling code here:
        if(subtraction==evt.getSource());
        {
        value1=textfield.getText();
        op="-";
        textfield.setText("");
        }
    }//GEN-LAST:event_subtractionActionPerformed

    @SuppressWarnings("empty-statement")
    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
        if(plus==evt.getSource());
        {
       value1=textfield.getText();
        op="+";
        textfield.setText("");
        }
    }//GEN-LAST:event_plusActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        // TODO add your handling code here:
        if(equal==evt.getSource())
        {
            String value2=textfield.getText();
            int a=Integer.parseInt(value1);
            int b=Integer.parseInt(value2);
            
        if(op.equals("/"))
         
            textfield.setText(""+(a/b));
         
        
        if(op.equals("*"))
         
             textfield.setText(""+(a*b));
            
        
        if(op.equals("-"))
            textfield.setText(""+(a-b));
                     
        if(op.equals("+"))
         
            textfield.setText(""+(a+b));
          
       if(op.equals("%"))
        textfield.setText(""+(a%b));   
           
            
           }           
    }//GEN-LAST:event_equalActionPerformed

    private void reminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderActionPerformed
        // TODO add your handling code here:
        if(reminder==evt.getSource())
        {
        value1=textfield.getText();
        op="%";
        textfield.setText("");
        
        }
    }//GEN-LAST:event_reminderActionPerformed
    
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
            java.util.logging.Logger.getLogger(calculatorNewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorNewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorNewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorNewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorNewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton plus;
    private javax.swing.JButton reminder;
    private javax.swing.JButton subtraction;
    private javax.swing.JTextField textfield;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

    private static class Intgeger {

        private static int parseInt(String value2) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Intgeger() {
        }
    }
}