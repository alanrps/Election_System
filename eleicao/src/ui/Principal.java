/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1923161
 */
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
      
   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnZonaActionPerformed = new javax.swing.JButton();
        btnUrnaActionPerformed = new javax.swing.JButton();
        btnSecao = new javax.swing.JButton();
        btnEnderecoActionPerformed = new javax.swing.JButton();
        btnPartido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnZonaActionPerformed.setText("Zona");
        btnZonaActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZonaActionPerformedActionPerformed(evt);
            }
        });

        btnUrnaActionPerformed.setText("Urna");
        btnUrnaActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrnaActionPerformedActionPerformed(evt);
            }
        });

        btnSecao.setText("Seção");
        btnSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecaoActionPerformed(evt);
            }
        });

        btnEnderecoActionPerformed.setText("Pessoa");
        btnEnderecoActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnderecoActionPerformedActionPerformed(evt);
            }
        });

        btnPartido.setText("Partido");
        btnPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(btnPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEnderecoActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btnUrnaActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(btnZonaActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEnderecoActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUrnaActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnZonaActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZonaActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZonaActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZonaActionPerformedActionPerformed

    private void btnUrnaActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrnaActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUrnaActionPerformedActionPerformed

    private void btnSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecaoActionPerformed
        SecaoJDialog form = new SecaoJDialog(null, true);
        form.setSize(500,500);
        form.setLocationRelativeTo(null); 
        form.setVisible(true);
    }//GEN-LAST:event_btnSecaoActionPerformed

    private void btnEnderecoActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnderecoActionPerformedActionPerformed
        // TODO add your handling code here:
        EnderecoJDialog form = new EnderecoJDialog(null, true);
        form.setSize(500,500);
        form.setLocationRelativeTo(null); 
        form.setVisible(true);
       
        
    }//GEN-LAST:event_btnEnderecoActionPerformedActionPerformed

    private void btnPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoActionPerformed
        PartidoJDialog form = new PartidoJDialog(null, true);
        form.setSize(500,500);
        form.setLocationRelativeTo(null); 
        form.setVisible(true);
    }//GEN-LAST:event_btnPartidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnderecoActionPerformed;
    private javax.swing.JButton btnPartido;
    private javax.swing.JButton btnSecao;
    private javax.swing.JButton btnUrnaActionPerformed;
    private javax.swing.JButton btnZonaActionPerformed;
    // End of variables declaration//GEN-END:variables
}
