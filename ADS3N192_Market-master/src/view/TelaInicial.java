/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author assparremberger
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jdpPainelInicial = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCidadesCadastrar = new javax.swing.JMenuItem();
        jMenuItemCidadesListar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemClientesCadastrar = new javax.swing.JMenuItem();
        jMenuItemClientesListar = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItemProdutosListar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market da Turma ADS3N192");

        javax.swing.GroupLayout jdpPainelInicialLayout = new javax.swing.GroupLayout(jdpPainelInicial);
        jdpPainelInicial.setLayout(jdpPainelInicialLayout);
        jdpPainelInicialLayout.setHorizontalGroup(
            jdpPainelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpPainelInicialLayout.setVerticalGroup(
            jdpPainelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Sobre");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cidades");

        jMenuItemCidadesCadastrar.setText("Cadastrar");
        jMenuItemCidadesCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadesCadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCidadesCadastrar);

        jMenuItemCidadesListar.setText("Listar");
        jMenuItemCidadesListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadesListarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCidadesListar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Clientes");

        jMenuItemClientesCadastrar.setText("Cadastrar");
        jMenuItemClientesCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesCadastrarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemClientesCadastrar);

        jMenuItemClientesListar.setText("Listar");
        jMenuItemClientesListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesListarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemClientesListar);

        jMenuBar1.add(jMenu3);

        jMenu7.setText("Produtos");

        jMenuItem3.setText("Cadastrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuItemProdutosListar.setText("Listar");
        jMenuItemProdutosListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosListarActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItemProdutosListar);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("Categorias");

        jMenuItem5.setText("Cadastrar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Listar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainelInicial)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainelInicial)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    //cadastrar cliente
    
    private void jMenuItemClientesCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesCadastrarActionPerformed
        FrmCliente tela = new FrmCliente();
        jdpPainelInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesCadastrarActionPerformed

    //cadastrar cidade 
    private void jMenuItemCidadesCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadesCadastrarActionPerformed
        FrmCidade tela = new FrmCidade();
        jdpPainelInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCidadesCadastrarActionPerformed
    //Listar clientes
    
    private void jMenuItemClientesListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesListarActionPerformed
        ListClientes tela = new ListClientes();
        jdpPainelInicial.add(tela);
        tela.setVisible( true );
    }//GEN-LAST:event_jMenuItemClientesListarActionPerformed

    //Listar produtos
    
    private void jMenuItemProdutosListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosListarActionPerformed
        ListProdutos tela = new ListProdutos();
        jMenuItemProdutosListar.add(tela);
        tela.setVisible( true );
    }//GEN-LAST:event_jMenuItemProdutosListarActionPerformed

    //cadastrar pordutos
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       FrmProdutos tela = new FrmProdutos();
        jdpPainelInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    //listar cidade
    private void jMenuItemCidadesListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadesListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCidadesListarActionPerformed

    //cadastrar categoria 
    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      FrmCategorias tela = new FrmCategorias();
        jdpPainelInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    
    //listar categorias
    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ListProdutos tela = new ListProdutos();
        jMenuItemProdutosListar.add(tela);
        tela.setVisible( true );
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemCidadesCadastrar;
    private javax.swing.JMenuItem jMenuItemCidadesListar;
    private javax.swing.JMenuItem jMenuItemClientesCadastrar;
    private javax.swing.JMenuItem jMenuItemClientesListar;
    private javax.swing.JMenuItem jMenuItemProdutosListar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JDesktopPane jdpPainelInicial;
    // End of variables declaration//GEN-END:variables
}
