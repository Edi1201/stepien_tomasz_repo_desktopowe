/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tomasz.stepien.kalkulator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tomme
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ts_jPanelMain = new javax.swing.JPanel();
        ts_jBclear = new javax.swing.JButton();
        ts_jBsqrt = new javax.swing.JButton();
        ts_jBsplit = new javax.swing.JButton();
        ts_jBtimes = new javax.swing.JButton();
        ts_jB7 = new javax.swing.JButton();
        ts_jB8 = new javax.swing.JButton();
        ts_jB9 = new javax.swing.JButton();
        ts_jBminus = new javax.swing.JButton();
        ts_jB4 = new javax.swing.JButton();
        ts_jB5 = new javax.swing.JButton();
        ts_jB6 = new javax.swing.JButton();
        ts_jBplus = new javax.swing.JButton();
        ts_jB1 = new javax.swing.JButton();
        ts_jB2 = new javax.swing.JButton();
        ts_jB3 = new javax.swing.JButton();
        ts_jBpower = new javax.swing.JButton();
        ts_jB0 = new javax.swing.JButton();
        ts_jBcomma = new javax.swing.JButton();
        ts_jBequal = new javax.swing.JButton();
        ts_jTF = new javax.swing.JTextField();
        ts_jMenuBar = new javax.swing.JMenuBar();
        ts_jMenuPlik = new javax.swing.JMenu();
        ts_jCBMIzapis = new javax.swing.JCheckBoxMenuItem();
        ts_jMIzamknij = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ts_jBclear.setText("Clear");
        ts_jBclear.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jBclear.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jBclear.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jBclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBclearActionPerformed(evt);
            }
        });

        ts_jBsqrt.setText("√");
        ts_jBsqrt.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jBsqrt.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jBsqrt.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jBsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBsqrtActionPerformed(evt);
            }
        });

        ts_jBsplit.setText("/");
        ts_jBsplit.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jBsplit.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jBsplit.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jBsplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBsplitActionPerformed(evt);
            }
        });

        ts_jBtimes.setText("*");
        ts_jBtimes.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jBtimes.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jBtimes.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jBtimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBtimesActionPerformed(evt);
            }
        });

        ts_jB7.setText("7");
        ts_jB7.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB7.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB7.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB7ActionPerformed(evt);
            }
        });

        ts_jB8.setText("8");
        ts_jB8.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB8.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB8.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB8ActionPerformed(evt);
            }
        });

        ts_jB9.setText("9");
        ts_jB9.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB9.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB9.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB9ActionPerformed(evt);
            }
        });

        ts_jBminus.setText("-");
        ts_jBminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBminusActionPerformed(evt);
            }
        });

        ts_jB4.setText("4");
        ts_jB4.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB4.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB4ActionPerformed(evt);
            }
        });

        ts_jB5.setText("5");
        ts_jB5.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB5.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB5.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB5ActionPerformed(evt);
            }
        });

        ts_jB6.setText("6");
        ts_jB6.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB6.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB6.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB6ActionPerformed(evt);
            }
        });

        ts_jBplus.setText("+");
        ts_jBplus.setMaximumSize(new java.awt.Dimension(73, 70));
        ts_jBplus.setMinimumSize(new java.awt.Dimension(73, 70));
        ts_jBplus.setPreferredSize(new java.awt.Dimension(73, 70));
        ts_jBplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBplusActionPerformed(evt);
            }
        });

        ts_jB1.setText("1");
        ts_jB1.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB1.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB1.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB1ActionPerformed(evt);
            }
        });

        ts_jB2.setText("2");
        ts_jB2.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB2.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB2.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB2ActionPerformed(evt);
            }
        });

        ts_jB3.setText("3");
        ts_jB3.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB3.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB3.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB3ActionPerformed(evt);
            }
        });

        ts_jBpower.setText("Potęga");
        ts_jBpower.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jBpower.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jBpower.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jBpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBpowerActionPerformed(evt);
            }
        });

        ts_jB0.setText("0");
        ts_jB0.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jB0.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jB0.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jB0ActionPerformed(evt);
            }
        });

        ts_jBcomma.setText(".");
        ts_jBcomma.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jBcomma.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jBcomma.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jBcomma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBcommaActionPerformed(evt);
            }
        });

        ts_jBequal.setText("=");
        ts_jBequal.setMaximumSize(new java.awt.Dimension(70, 70));
        ts_jBequal.setMinimumSize(new java.awt.Dimension(70, 70));
        ts_jBequal.setPreferredSize(new java.awt.Dimension(70, 70));
        ts_jBequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jBequalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ts_jPanelMainLayout = new javax.swing.GroupLayout(ts_jPanelMain);
        ts_jPanelMain.setLayout(ts_jPanelMainLayout);
        ts_jPanelMainLayout.setHorizontalGroup(
            ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ts_jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ts_jTF)
                    .addGroup(ts_jPanelMainLayout.createSequentialGroup()
                        .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ts_jPanelMainLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ts_jBclear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ts_jB7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ts_jB4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ts_jB8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ts_jB5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ts_jBsqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ts_jPanelMainLayout.createSequentialGroup()
                                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ts_jPanelMainLayout.createSequentialGroup()
                                        .addComponent(ts_jB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ts_jB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ts_jPanelMainLayout.createSequentialGroup()
                                        .addComponent(ts_jB0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ts_jBcomma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ts_jPanelMainLayout.createSequentialGroup()
                                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ts_jB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ts_jB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ts_jB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ts_jBminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ts_jBplus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ts_jBpower, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ts_jPanelMainLayout.createSequentialGroup()
                                .addComponent(ts_jBsplit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ts_jBtimes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ts_jBequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        ts_jPanelMainLayout.setVerticalGroup(
            ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ts_jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ts_jTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ts_jBtimes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ts_jBsqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ts_jBclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ts_jBsplit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ts_jB8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ts_jB7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ts_jB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ts_jBminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ts_jB5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ts_jB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ts_jB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ts_jBplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ts_jB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ts_jB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ts_jB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ts_jBpower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ts_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ts_jB0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ts_jBcomma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ts_jBequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        ts_jMenuPlik.setText("Plik");

        ts_jCBMIzapis.setSelected(true);
        ts_jCBMIzapis.setText("Zapis obliczeń");
        ts_jMenuPlik.add(ts_jCBMIzapis);

        ts_jMIzamknij.setText("Zamknij");
        ts_jMIzamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_jMIzamknijActionPerformed(evt);
            }
        });
        ts_jMenuPlik.add(ts_jMIzamknij);

        ts_jMenuBar.add(ts_jMenuPlik);

        setJMenuBar(ts_jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ts_jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ts_jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ts_jBplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBplusActionPerformed
        num1 = Double.parseDouble(ts_jTF.getText());
        ts_jTF.setText("");
        action="+";
    }//GEN-LAST:event_ts_jBplusActionPerformed

    private void ts_jBtimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBtimesActionPerformed
        num1 = Double.parseDouble(ts_jTF.getText());
        ts_jTF.setText("");
        action="*";
    }//GEN-LAST:event_ts_jBtimesActionPerformed

    private void ts_jBsplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBsplitActionPerformed
        num1 = Double.parseDouble(ts_jTF.getText());
        ts_jTF.setText("");
        action="/";
    }//GEN-LAST:event_ts_jBsplitActionPerformed

    private void ts_jBsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBsqrtActionPerformed
        num1 = Double.parseDouble(ts_jTF.getText());
        ts_jTF.setText("");
        action="s";
    }//GEN-LAST:event_ts_jBsqrtActionPerformed

    private void ts_jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB1ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB1.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB1ActionPerformed

    private void ts_jBpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBpowerActionPerformed
        num1 = Double.parseDouble(ts_jTF.getText());
        ts_jTF.setText("");
        action="p";
    }//GEN-LAST:event_ts_jBpowerActionPerformed

    private void ts_jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB0ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB0.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB0ActionPerformed

    private void ts_jBcommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBcommaActionPerformed
        String EnterNumber = ts_jTF.getText() + ts_jBcomma.getText();
        ts_jTF.setText(EnterNumber);
    }//GEN-LAST:event_ts_jBcommaActionPerformed

    private void ts_jBequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBequalActionPerformed
        String answer;        
        if (action == "+"){
            num2 = Double.parseDouble(ts_jTF.getText());
            result = num1 +  num2;
            String text = ""+num1+"+"+num2+"="+result;
            ts_jTF.setText(text);
            if (ts_jCBMIzapis.isSelected()) save(text);
        }
        else  if (action == "-"){
            num2 = Double.parseDouble(ts_jTF.getText());
            result = num1 -  num2;
            String text = ""+num1+"-"+num2+"="+result;
            ts_jTF.setText(text);
            if (ts_jCBMIzapis.isSelected()) save(text);
        }
        else  if (action == "*"){
            num2 = Double.parseDouble(ts_jTF.getText());
            result = num1 *  num2;
            String text = ""+num1+"*"+num2+"="+result;
            ts_jTF.setText(text);
            if (ts_jCBMIzapis.isSelected()) save(text);
        }
        else  if (action == "/"){
            num2 = Double.parseDouble(ts_jTF.getText());
            if(num1 == 0 || num2 == 0){
                String text = "Nie da sie dzielic 0 ani przez 0";
                ts_jTF.setText(text); 
                if (ts_jCBMIzapis.isSelected()) save(text);
            }else{
                result = num1 /  num2;
                String text = ""+num1+"/"+num2+"="+result;
                ts_jTF.setText(text);
                if (ts_jCBMIzapis.isSelected()) save(text);
            }
        }
        else  if (action == "s"){
            if(num1 < 0 ){ 
                String text = "Nie istnieje pierwiastek z liczby ujemnej";
                ts_jTF.setText(text);
                if (ts_jCBMIzapis.isSelected()) save(text);
            }else{
                result = Math.sqrt(num1);
                String text = "√"+num1+"="+result;
                ts_jTF.setText(text);
                if (ts_jCBMIzapis.isSelected()) save(text);
            }
        }else  if (action == "p"){
            num2 = Double.parseDouble(ts_jTF.getText());
            result = Math.pow(num1, num2);
            String text = ""+num1+" do potęgi "+num2+"="+result;
            ts_jTF.setText(text);
            if (ts_jCBMIzapis.isSelected()) save(text);
        }
    }//GEN-LAST:event_ts_jBequalActionPerformed

    private void ts_jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB7ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB7.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB7ActionPerformed

    private void ts_jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB8ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB8.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB8ActionPerformed

    private void ts_jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB9ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB9.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB9ActionPerformed

    private void ts_jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB4ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB4.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB4ActionPerformed

    private void ts_jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB5ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB5.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB5ActionPerformed

    private void ts_jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB6ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB6.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB6ActionPerformed

    private void ts_jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB2ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB2.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB2ActionPerformed

    private void ts_jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jB3ActionPerformed
        String Enternumber = ts_jTF.getText() + ts_jB3.getText();
        ts_jTF.setText(Enternumber);
    }//GEN-LAST:event_ts_jB3ActionPerformed

    private void ts_jBclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBclearActionPerformed
        ts_jTF.setText("");
    }//GEN-LAST:event_ts_jBclearActionPerformed

    private void ts_jBminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jBminusActionPerformed
        if(ts_jTF.getText().equals("")){
            ts_jTF.setText("-");
        }else{
            num1 = Double.parseDouble(ts_jTF.getText());
            ts_jTF.setText("");
            action="-";
        }
    }//GEN-LAST:event_ts_jBminusActionPerformed

    private void ts_jMIzamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_jMIzamknijActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ts_jMIzamknijActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private static void save(String action){
        File f = new File("obliczenia.txt");
        try{
            FileWriter fw = new FileWriter(f, true);
            fw.write(action+"\n");
            fw.close();
        }catch(IOException e){
            System.out.println("BLAD: "+e.toString());
        }
    }
    String action;
    double result;
    double num1;
    double num2;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ts_jB0;
    private javax.swing.JButton ts_jB1;
    private javax.swing.JButton ts_jB2;
    private javax.swing.JButton ts_jB3;
    private javax.swing.JButton ts_jB4;
    private javax.swing.JButton ts_jB5;
    private javax.swing.JButton ts_jB6;
    private javax.swing.JButton ts_jB7;
    private javax.swing.JButton ts_jB8;
    private javax.swing.JButton ts_jB9;
    private javax.swing.JButton ts_jBclear;
    private javax.swing.JButton ts_jBcomma;
    private javax.swing.JButton ts_jBequal;
    private javax.swing.JButton ts_jBminus;
    private javax.swing.JButton ts_jBplus;
    private javax.swing.JButton ts_jBpower;
    private javax.swing.JButton ts_jBsplit;
    private javax.swing.JButton ts_jBsqrt;
    private javax.swing.JButton ts_jBtimes;
    private javax.swing.JCheckBoxMenuItem ts_jCBMIzapis;
    private javax.swing.JMenuItem ts_jMIzamknij;
    private javax.swing.JMenuBar ts_jMenuBar;
    private javax.swing.JMenu ts_jMenuPlik;
    private javax.swing.JPanel ts_jPanelMain;
    private javax.swing.JTextField ts_jTF;
    // End of variables declaration//GEN-END:variables
}
