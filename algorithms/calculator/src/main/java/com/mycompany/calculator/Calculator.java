/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author dev1
 */
public class Calculator extends javax.swing.JFrame {

    enum Operators {
        SUBTRACTION,
        ADDITION,
        MULTIPLICATION,
        DIVISION
    }

    public float num1 = 0;
    public float num2 = 0;
    public Operators option = null;

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_num0 = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();
        btn_equals = new javax.swing.JButton();
        btn_num1 = new javax.swing.JButton();
        btn_num2 = new javax.swing.JButton();
        btn_num3 = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_num4 = new javax.swing.JButton();
        btn_num5 = new javax.swing.JButton();
        btn_num6 = new javax.swing.JButton();
        btn_num7 = new javax.swing.JButton();
        btn_num9 = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_num8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label_result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_add.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_add.setText("+");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_num0.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num0.setText("0");
        btn_num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num0ActionPerformed(evt);
            }
        });

        btn_clean.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        btn_clean.setText("Borrar");
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        btn_equals.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_equals.setText("=");
        btn_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalsActionPerformed(evt);
            }
        });

        btn_num1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num1.setText("1");
        btn_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num1ActionPerformed(evt);
            }
        });

        btn_num2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num2.setText("2");
        btn_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num2ActionPerformed(evt);
            }
        });

        btn_num3.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num3.setText("3");
        btn_num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num3ActionPerformed(evt);
            }
        });

        btn_sub.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_sub.setText("-");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });

        btn_multi.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_multi.setText("x");
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });

        btn_num4.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num4.setText("4");
        btn_num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num4ActionPerformed(evt);
            }
        });

        btn_num5.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num5.setText("5");
        btn_num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num5ActionPerformed(evt);
            }
        });

        btn_num6.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num6.setText("6");
        btn_num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num6ActionPerformed(evt);
            }
        });

        btn_num7.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num7.setText("7");
        btn_num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num7ActionPerformed(evt);
            }
        });

        btn_num9.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num9.setText("9");
        btn_num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num9ActionPerformed(evt);
            }
        });

        btn_division.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_division.setText("÷");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_num8.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btn_num8.setText("8");
        btn_num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(btn_num0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btn_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btn_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_num3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_num4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btn_num5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_num6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_num7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btn_num8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_num9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_num7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_num8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_num9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_num4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_num5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_num6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_num3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_num0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        label_result.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        label_result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_result.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_result)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(label_result))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num0ActionPerformed
        this.changeLabel("0");
    }//GEN-LAST:event_btn_num0ActionPerformed

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        this.label_result.setText("0");
        this.num1 = 0;
        this.num2 = 0;
        this.option = null;
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void btn_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num1ActionPerformed
        this.changeLabel("1");
    }//GEN-LAST:event_btn_num1ActionPerformed

    private void btn_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num2ActionPerformed
        this.changeLabel("2");
    }//GEN-LAST:event_btn_num2ActionPerformed

    private void btn_num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num3ActionPerformed
        this.changeLabel("3");
    }//GEN-LAST:event_btn_num3ActionPerformed

    private void btn_num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num4ActionPerformed
        this.changeLabel("4");
    }//GEN-LAST:event_btn_num4ActionPerformed

    private void btn_num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num5ActionPerformed
        this.changeLabel("5");
    }//GEN-LAST:event_btn_num5ActionPerformed

    private void btn_num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num6ActionPerformed
        this.changeLabel("6");
    }//GEN-LAST:event_btn_num6ActionPerformed

    private void btn_num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num7ActionPerformed
        this.changeLabel("7");
    }//GEN-LAST:event_btn_num7ActionPerformed

    private void btn_num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num8ActionPerformed
        this.changeLabel("8");
    }//GEN-LAST:event_btn_num8ActionPerformed

    private void btn_num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num9ActionPerformed
        this.changeLabel("9");
    }//GEN-LAST:event_btn_num9ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        this.setOperator(Operators.ADDITION);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        this.setOperator(Operators.SUBTRACTION);
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        this.setOperator(Operators.MULTIPLICATION);
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        this.setOperator(Operators.DIVISION);
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalsActionPerformed

        if ("0".equals(this.label_result.getText())) {
            return;
        }

        this.num2 = Float.parseFloat(this.label_result.getText());

        try {
            switch (this.option) {
                case ADDITION ->
                    this.label_result.setText((num1 + num2) + "");
                case SUBTRACTION ->
                    this.label_result.setText((num1 - num2) + "");
                case MULTIPLICATION ->
                    this.label_result.setText((num1 * num2) + "");
                case DIVISION ->
                    this.label_result.setText((num1 / num2) + "");
            }
        } catch (Exception e) {
            this.label_result.setText("System Error");
        }
    }//GEN-LAST:event_btn_equalsActionPerformed

    private void setOperator(Operators operator) {

        String label_text = this.label_result.getText();

        if (!"0".equals(label_text)) {
            this.num1 = Float.parseFloat(label_text);
            this.option = operator;
            this.label_result.setText("0");
        }
    }

    private void changeLabel(String text) {
        String label_text = this.label_result.getText();
        String newText;

        if (!"0".equals(label_text)) {
            newText = label_text + text;
        } else {
            newText = text;
        }

        this.label_result.setText(newText);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_equals;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_num0;
    private javax.swing.JButton btn_num1;
    private javax.swing.JButton btn_num2;
    private javax.swing.JButton btn_num3;
    private javax.swing.JButton btn_num4;
    private javax.swing.JButton btn_num5;
    private javax.swing.JButton btn_num6;
    private javax.swing.JButton btn_num7;
    private javax.swing.JButton btn_num8;
    private javax.swing.JButton btn_num9;
    private javax.swing.JButton btn_sub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_result;
    // End of variables declaration//GEN-END:variables
}
