/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ClienteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.ClientePF;
import model.ClientePJ;

/**
 *
 * @author assparremberger
 */
public class ListClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListClientes
     */
    public ListClientes() {
        initComponents();
        carregarTabela();
    }

    private void carregarTabela() {
        List<?> lista;
        DefaultTableModel model = new DefaultTableModel();
        String[] colunas = {"Código", "Nome", "E-mail",
            "Receber E-mail", "Cidade", "Tipo", "CPF /CNPJ"};
        
        if ( rbPF.isSelected()) {
            colunas[6] = "CPF";
            lista = ClienteDAO.getClientesPF();
        }else if( rbPJ.isSelected() ){
            colunas[6] = "CNPJ";
            lista = ClienteDAO.getClientesPJ(); 
        }else{ 
            lista = ClienteDAO.getClientes();
        }
            
        model.setColumnIdentifiers(colunas);
        
        for (Object cli : lista) {
            Cliente cliente = (Cliente) cli;
            String receberEmail = "Não";
            if (cliente.isReceberEmail()) 
                receberEmail = "Sim";
            
            Object[] linha = {};
            
            if ( cliente.getTipo().equals( Cliente.PESSOA_FISICA ) ) {
                ClientePF pf = (ClientePF) cli;
                linha = new Object[]{
                        pf.getId(), pf.getNome(),
                        pf.getEmail(), receberEmail,
                        pf.getCidade().getNome(), "Pessoa Física",
                        pf.getCpf()};
            }else{
                ClientePJ pj = (ClientePJ) cli;
                linha = new Object[]{
                        pj.getId(), pj.getNome(),
                        pj.getEmail(), receberEmail,
                        pj.getCidade().getNome(), "Pessoa Jurídica",
                        pj.getCnpj()};
            }
            model.addRow( linha );
        }
        
        tableClientes.setModel( model );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        rbTodos = new javax.swing.JRadioButton();
        rbPF = new javax.swing.JRadioButton();
        rbPJ = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Clientes");

        buttonGroupTipo.add(rbTodos);
        rbTodos.setSelected(true);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(rbPF);
        rbPF.setText("Pessoa Física");
        rbPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPFActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(rbPJ);
        rbPJ.setText("Pessoa Jurídica");
        rbPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPJActionPerformed(evt);
            }
        });

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Maria"},
                {"2", "João"}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane1.setViewportView(tableClientes);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbTodos)
                        .addGap(18, 18, 18)
                        .addComponent(rbPF)
                        .addGap(18, 18, 18)
                        .addComponent(rbPJ)
                        .addGap(0, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTodos)
                    .addComponent(rbPF)
                    .addComponent(rbPJ))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnExcluir)
                        .addContainerGap(208, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        carregarTabela();
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPFActionPerformed
        carregarTabela();
    }//GEN-LAST:event_rbPFActionPerformed

    private void rbPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPJActionPerformed
        carregarTabela();
    }//GEN-LAST:event_rbPJActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tableClientes.getSelectedRow();   
        if( linha < 0 ){
            JOptionPane.showMessageDialog(this, 
                "Você deve selecionar um cliente!");
        }else{
            int id = (int) tableClientes.getValueAt(linha, 0);
            String nome = (String) tableClientes.getValueAt(linha, 1);
            int resposta = JOptionPane.showConfirmDialog(this, 
                    "Confirma a exclusão do cliente " + nome + "?", 
                    "Excluir Cliente", JOptionPane.YES_NO_OPTION);
            if( resposta == JOptionPane.YES_OPTION ){
                ClienteDAO.excluir( id );
                carregarTabela();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbPF;
    private javax.swing.JRadioButton rbPJ;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tableClientes;
    // End of variables declaration//GEN-END:variables
}
