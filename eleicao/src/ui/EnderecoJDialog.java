/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;
import model.Endereco;
import model.Partido;
import model.Pessoa;

import ViewModel.EnderecoPessoa;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.EnderecoDAO1;
import main.PartidoDAO;


public class EnderecoJDialog extends javax.swing.JDialog {
    public EnderecoJDialog(java.awt.Frame parent, boolean modal)throws ClassNotFoundException, IOException{
        super(parent,modal);
        initComponents();
        try {
            loadRecords();
            fillcbPartido();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEndereco = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtCep = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNmr = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTitEleitor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbSecao = new javax.swing.JComboBox<>();
        cbPartido = new javax.swing.JComboBox<>();

        JTableEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTableEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo Eleitor", "nome", "número", "cep", "logradouro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableEndereco);

        btnFechar.setText("Fechar");
        btnFechar.setActionCommand("btnNovo");
        btnFechar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.setActionCommand("btnNovo");
        btnNovo.setPreferredSize(new java.awt.Dimension(90, 29));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("btnNovo");
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setActionCommand("btnNovo");
        btnRemover.setPreferredSize(new java.awt.Dimension(90, 29));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setActionCommand("btnNovo");
        btnSalvar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel11.setText("Cep:");

        jLabel13.setText("Número:");
        jLabel13.setAlignmentX(1.0F);

        jLabel7.setText("Logradouro:");

        jLabel14.setText("Data de Nascimento:");

        jLabel8.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel15.setText("Título de Eleitor:");
        jLabel15.setAlignmentX(1.0F);

        cbSecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbPartido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTitEleitor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13)
                                    .addComponent(txtNmr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cbSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        addRecord = true;
        clearInputBoxes();
        cbPartido.requestFocus();
        enableButtons(false, true, true, false); //verificar
        cbPartido.setEnabled(true);
        txtTitEleitor.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clearInputBoxes();
        enableButtons(true, false, false, false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
       int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                deleteRecord();
                loadRecords();
                clearInputBoxes();
                enableButtons(true, false, false, false);
                cbPartido.setEnabled(false);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
             catch (ClassNotFoundException | IOException ex) {
                Logger.getLogger(EnderecoJDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
          int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja salvar esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                if (addRecord == true) {
                    addNew();
                } else {
                    updateRecord();
                }
                addRecord = false;
                loadRecords();
                enableButtons(true, false, false, false);
                cbPartido.setEnabled(false);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } catch (ClassNotFoundException | IOException ex) {
                Logger.getLogger(EnderecoJDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    
     boolean addRecord = false;
 
    private void clearInputBoxes() {
        txtNmr.setText("");
        txtCep.setText("");
        txtLogradouro.setText("");
        txtTitEleitor.setText("");
        txtNome.setText("");
//        txtDataNasc.setText("");
    }
    
     private void addNew() throws SQLException, ClassNotFoundException, IOException {
        Endereco e = new Endereco();
        Pessoa p = new Pessoa();
        PartidoDAO pDao = new PartidoDAO();
        
        e.setNmr(Integer.parseInt(txtNmr.getText()));
        e.setCep(Integer.parseInt(txtCep.getText()));
        e.setLogradouro(txtLogradouro.getText());
        p.setTitEleitor(Integer.parseInt(txtTitEleitor.getText()));
        p.setNome(txtNome.getText());
        p.setPartido(pDao.find2((String) cbPartido.getSelectedItem())); //Verificar find2
//        p.setDataMqSql(txtDataNasc.getText());
        EnderecoDAO1 dao = new EnderecoDAO1();
        int idEndereco = dao.insertEndereco(e);
        dao.insertPessoa(p,idEndereco);
        
    }
     
    private void updateRecord() throws SQLException, ClassNotFoundException, IOException {
        Endereco e = new Endereco();
        Pessoa p = new Pessoa();
        PartidoDAO pDao = new PartidoDAO();
        
        e.setNmr(Integer.parseInt(txtNmr.getText()));
        e.setCep(Integer.parseInt(txtCep.getText()));
        e.setLogradouro(txtLogradouro.getText());
        p.setTitEleitor(Integer.parseInt(txtTitEleitor.getText()));
        p.setNome(txtNome.getText());
        p.setPartido(pDao.find2((String) cbPartido.getSelectedItem()));
//        p.setDataMqSql(txtDataNasc.getText());
        EnderecoDAO1 dao = new EnderecoDAO1();
        dao.updateEndereco(e);
        dao.updatePessoa(p);
    }
    
    private void deleteRecord() throws SQLException {
        EnderecoDAO1 dao = new EnderecoDAO1();
        dao.removePessoa(Integer.parseInt(txtTitEleitor.getText()));
//        dao.removeEndereco(Integer.parseInt(txtNmr.getText()));
    }
    
      private void loadRecords() throws SQLException, ClassNotFoundException, IOException {
        String sql = "SELECT P.titEleitor as tituloeleitor,P.nome,E.nmr as numero, E.cep, E.logradouro,PAR.nome as partido FROM Endereco E,Pessoa P,Partido PAR where P.idEnd = E.id AND PAR.nmr = P.nmrPartido";
 //verificar dataNasc as data nascimento
        ResultSetTableModel tableModel = new ResultSetTableModel(sql);
        JTableEndereco.setModel(tableModel);
        
//        //Hiding column "id" 
//        JTableEndereco.removeColumn(JTableEndereco.getColumnModel().getColumn(0));
//        
//       
//        //Adjusting columns***
//        JTableEndereco.getColumnModel().getColumn(0).setMaxWidth(50);
       
        JTableEndereco.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            try {
                if (JTableEndereco.getSelectedRow() >= 0) {
                    
                    Object titEleitor = JTableEndereco.getModel().getValueAt(JTableEndereco.getSelectedRow(), 0);
                    Object nome = JTableEndereco.getModel().getValueAt(JTableEndereco.getSelectedRow(), 1);
                    Object nmr = JTableEndereco.getModel().getValueAt(JTableEndereco.getSelectedRow(), 2);
                    Object cep = JTableEndereco.getModel().getValueAt(JTableEndereco.getSelectedRow(), 3);
                    Object logradouro = JTableEndereco.getModel().getValueAt(JTableEndereco.getSelectedRow(), 4);
                    Object partido =  JTableEndereco.getModel().getValueAt(JTableEndereco.getSelectedRow(), 5);
//                    Object dataNasc = JTableEndereco.getModel().getValueAt(JTableEndereco.getSelectedRow(), 5);
                    
                    //Verificar
                    txtTitEleitor.setText(titEleitor.toString());
                    txtNome.setText(nome.toString());
                    txtNmr.setText(nmr.toString());
                    txtCep.setText(cep.toString());
                    txtLogradouro.setText(logradouro.toString());
                    cbPartido.setSelectedItem(partido.toString());
                    
                    
//                    txtDataNasc.setText(titEleitor.toString());
                    
                    enableButtons(false, true, true, true);
                    cbPartido.setEnabled(true);
                    txtTitEleitor.setEnabled(true); //Verificar
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        JTableEndereco.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }
      
    public void enableButtons(boolean novo, boolean salvar, boolean cancelar, boolean remover){
        btnNovo.setEnabled(novo);
        btnSalvar.setEnabled(salvar);
        btnCancelar.setEnabled(cancelar);
        btnRemover.setEnabled(remover);
    }
    
//    public void enableFields(boolean nmr, boolean cep,boolean nome,boolean titEleitor,boolean logradouro){
//        txtNome.setEnabled(cep);
//        txtCep.setEnabled(cep);
//        txtTitEleitor.setEnabled(titEleitor); 
//        txtLogradouro.setEnabled(logradouro);
//        txtNmr.setEnabled(nmr);
//    }
    
    
    
         
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableEndereco;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbPartido;
    private javax.swing.JComboBox<String> cbSecao;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNmr;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTitEleitor;
    // End of variables declaration//GEN-END:variables

private void fillcbPartido() throws SQLException, ClassNotFoundException, IOException {
        PartidoDAO dao = new PartidoDAO();
        List<Partido> partidos = dao.list();
        cbPartido.removeAllItems();
        for(Partido p : partidos){
            cbPartido.addItem(p.getNome());
        }
}



}
