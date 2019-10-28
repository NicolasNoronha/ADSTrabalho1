package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Categoria;

public class CategoriaDAO {
    
    public static void inserir(Categoria cat){
        String query = "INSERT INTO categoria "
                + " ( nome ) VALUES ( "
                + " '" + cat.getNome() + "'  ); ";
        Conexao.executar( query );
    }
    
    public static void editar(Categoria cat){
        String query = "UPDATE categoria   SET "
                + " nome =  '" + cat.getNome() + "' "
                + " WHERE id = " + cat.getId();
        Conexao.executar( query );
    }
    
    public static void excluir(Categoria pro){
        String query = "DELETE FROM categoria  "
                    + " WHERE id = " + pro.getId();
        Conexao.executar( query );
    }
    
    public static List<Categoria> getProdutos(){
        List<Categoria> lista = new ArrayList<>();
        String query = "SELECT id, nome "
                     + " FROM categoria ORDER BY nome ";
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                while ( rs.next() ) {                    
                    Categoria cat = new Categoria();
                    cat.setId( rs.getInt( 1 ) );
                    cat.setNome( rs.getString( 2 ) );
                    lista.add( cat );
                }
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
    public static Categoria getProdutosById( int idCategoria ){
        String query = "SELECT id, nome "
                     + " FROM categoria "
                     + " WHERE id = " + idCategoria;
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                rs.next();                  
                    Categoria pro = new Categoria();
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
