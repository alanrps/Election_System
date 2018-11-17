/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author a1923161
 */
public class FrmPrincipal extends javax.swing.JFrame {
   
    public FrmPrincipal() {
try {
            initComponents();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnZonaActionPerformed = new javax.swing.JButton();
        btnEnderecoActionPerformed = new javax.swing.JButton();
        btnPartidoActionPerformed = new javax.swing.JButton();
        btnPessoaActionPerformed = new javax.swing.JButton();
        btnSecaoActionPerformed = new javax.swing.JButton();
        btnUrnaActionPerformed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnZonaActionPerformed.setText("Zona");
        btnZonaActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZonaActionPerformedActionPerformed(evt);
            }
        });
        jPanel1.add(btnZonaActionPerformed, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 100, 60));

        btnEnderecoActionPerformed.setText("Endereço");
        btnEnderecoActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnderecoActionPerformedActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnderecoActionPerformed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 60));

        btnPartidoActionPerformed.setText("Partido");
        btnPartidoActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoActionPerformedActionPerformed(evt);
            }
        });
        jPanel1.add(btnPartidoActionPerformed, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 100, 60));

        btnPessoaActionPerformed.setText("Pessoa");
        btnPessoaActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaActionPerformedActionPerformed(evt);
            }
        });
        jPanel1.add(btnPessoaActionPerformed, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 100, 60));

        btnSecaoActionPerformed.setText("Seção");
        btnSecaoActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecaoActionPerformedActionPerformed(evt);
            }
        });
        jPanel1.add(btnSecaoActionPerformed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 60));

        btnUrnaActionPerformed.setText("Urna");
        btnUrnaActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrnaActionPerformedActionPerformed(evt);
            }
        });
        jPanel1.add(btnUrnaActionPerformed, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZonaActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZonaActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZonaActionPerformedActionPerformed

    private void btnEnderecoActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnderecoActionPerformedActionPerformed
        // TODO add your handling code here:
        EnderecoJDialog form = new EnderecoJDialog(null, true);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_btnEnderecoActionPerformedActionPerformed

    private void btnPartidoActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoActionPerformedActionPerformed

    private void btnPessoaActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPessoaActionPerformedActionPerformed

    private void btnSecaoActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecaoActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSecaoActionPerformedActionPerformed

    private void btnUrnaActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrnaActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUrnaActionPerformedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnderecoActionPerformed;
    private javax.swing.JButton btnPartidoActionPerformed;
    private javax.swing.JButton btnPessoaActionPerformed;
    private javax.swing.JButton btnSecaoActionPerformed;
    private javax.swing.JButton btnUrnaActionPerformed;
    private javax.swing.JButton btnZonaActionPerformed;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
