package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Produtos;

public class ProdutosDAO {
    
    public static void inserir(Produtos pro){
        String query = "INSERT INTO produtos "
                + " ( nome ) VALUES ( "
                + " '" + pro.getNome() + "'  ); ";
        Conexao.executar( query );
    }
    
    public static void editar(Produtos pro){
        String query = "UPDATE produtos SET "
                + " nome =  '" + pro.getNome() + "' "
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
        String query = "SELECT id, nome "
                     + " FROM produtos ORDER BY nome ";
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                while ( rs.next() ) {                    
                    Produtos cid = new Produtos();
                    cid.setId( rs.getInt( 1 ) );
                    cid.setNome( rs.getString( 2 ) );
                    lista.add( cid );
                }
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
    public static Produtos getProdutosById( int idProdutos ){
        String query = "SELECT id, nome "
                     + " FROM Produtos "
                     + " WHERE id = " + idProdutos;
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                rs.next();                  
                    Produtos pro = new Produtos();
                    pro.setId( rs.getInt( 1 ) );
                    pro.setNome( rs.getString( 2 ) );
                    return pro;
            } catch (Exception e) {
                return null;
            }
        }else{
            return null;
        }
    }
    
}
