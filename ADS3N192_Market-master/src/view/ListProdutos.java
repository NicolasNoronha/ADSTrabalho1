
package view;
import dao.ProdutosDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produtos;

public class ListProdutos extends javax.swing.JInternalFrame {

  
    public ListProdutos() {
        initComponents();
        carregarTabela();
        
    }
private void carregarTabela() {
   
      DefaultTableModel model = new DefaultTableModel();
      
        ProdutosDAO pro = new ProdutosDAO();
      
        
        for (Produtos p: pro.getProdutos()){
            model.addRow(new Object[]{
            
                p.getId(),
                p.getNome(),
                p.getQuantidade()
                
                });
        }
        tableProdutos.setModel( model );
}     

     
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        rbTodos = new javax.swing.JRadioButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10", "arroz", "3"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(tableProdutos);

        rbTodos.setSelected(true);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        btnExcluir.setText("Exluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(rbTodos)
                .addGap(373, 373, 373))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbTodos)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnExcluir)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        rbTodos.getAccessibleContext().setAccessibleParent(this);
        btnExcluir.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
       carregarTabela();
    }//GEN-LAST:event_rbTodosActionPerformed

    //produto exluir
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       int linha = tableProdutos.getSelectedRow();   
        if( linha < 0 ){
            JOptionPane.showMessageDialog(this, 
                "Você deve selecionar um produto!");
        }else{
            int id = (int) tableProdutos.getValueAt(linha, 0);
            String nome = (String) tableProdutos.getValueAt(linha, 1);
            int resposta = JOptionPane.showConfirmDialog(this, 
                    "Confirma a exclusão do cliente " + nome + "?", 
                    "Excluir Cliente", JOptionPane.YES_NO_OPTION);
            if( resposta == JOptionPane.YES_OPTION ){
                ProdutosDAO.excluir( id );
                carregarTabela();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

             

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tableProdutos;
    // End of variables declaration//GEN-END:variables

}
