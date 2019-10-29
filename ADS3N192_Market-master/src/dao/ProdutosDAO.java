package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produtos;

public class ProdutosDAO {
    
    public static void inserir(Produtos pro){
        String query = "INSERT INTO produtos "
                + " ( nome, quantidade ) VALUES ( "
           + " '" + pro.getNome()           + "' , "
           + "  " + pro.getQuantidade()     + " ) ";
        
        JOptionPane.showMessageDialog(null, query);
        Conexao.executar( query );
    }
    
    public static void editar(Produtos pro){
        String query = "UPDATE produtos SET "
                + " nome =  '" + pro.getNome() + "' "
                + " quantidade =  '" + pro.getQuantidade()+ "' "
                + " WHERE id = " + pro.getId();
        Conexao.executar( query );
    }
    
    public static void excluir(Produtos pro){
        String query = "DELETE FROM produtos "
                    + " WHERE id = " + pro.getId();
        Conexao.executar( query );
    }
    
    public static List<Produtos> getProdutos(){
        List<Produtos> lista = new ArrayList<>();
        String query = "SELECT id, nome, quantidade "
                     + " FROM produtos ORDER BY nome, quantidade ";
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                while ( rs.next() ) {                    
                    Produtos cid = new Produtos();
                    cid.setId( rs.getInt( 1 ) );
                    cid.setNome( rs.getString( 2 ) );
                    cid.setQuantidade(rs.getString( 3 ) );
                    lista.add( cid );
                }
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
    public static Produtos getProdutosById( int idProdutos ){
        String query = "SELECT id, nome, quantidade "
                     + " FROM Produtos "
                     + " WHERE id = " + idProdutos;
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                rs.next();                  
                    Produtos pro = new Produtos();
                    pro.setId( rs.getInt( 1 ) );
                    pro.setNome( rs.getString( 2 ) );
                    pro.setQuantidade( rs.getString(3));
                    return pro;
            } catch (Exception e) {
                return null;
            }
        }else{
            return null;
        }
    }
    
}
