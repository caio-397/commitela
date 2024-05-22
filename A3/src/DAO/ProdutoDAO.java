package DAO;

import Model.Produto;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDAO {

    public static ArrayList<Produto> MinhaLista = new ArrayList<Produto>();

    public ProdutoDAO() {
}

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_produtos");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public Connection getConexao() {

        Connection connection = null;  //inst�ncia da conex�o

        try {

            
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            
            String server = "localhost"; 
            String database = "cometela";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "LQdevtbtc1503.";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  
            System.out.println("O driver nao foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    
    public ArrayList getMinhaLista() {
        
        MinhaLista.clear(); 
// Aqui em que ver as tags ali que eu adicionnei so pra conectar com o banco de dados certinho, mas é so o total ali, adicionei como double
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produtos");
            while (res.next()) {

                int quantidade = res.getInt("quantidade");
                double preco = res.getDouble("preco");
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String descricao = res.getString("descricao");
                String data = res.getString("data");
                double total = res.getDouble("total");

                Produto objeto = new Produto(quantidade, preco, id, nome, descricao, data, total);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

   
    public boolean InsertProdutoBD(Produto objeto) {
        String sql = "INSERT INTO tb_produtos(id,nome,descricao,quantidade,preco,data,total) VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getDescricao());
            stmt.setInt(4, objeto.getQuantidade());
            stmt.setDouble(5, objeto.getPreco());
            stmt.setString(6, objeto.getData());
            stmt.setDouble(7, objeto.getTotal());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    
    public boolean DeleteProdutoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_produtos WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }

    
    public boolean UpdateProdutoBD(Produto objeto) {

        String sql = "UPDATE tb_produtos set nome = ? ,descricao = ? ,quantidade = ? ,preco = ?, data = ?, total = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getDescricao());
            stmt.setInt(3, objeto.getQuantidade());
            stmt.setDouble(4, objeto.getPreco());
            stmt.setString(5, objeto.getData());
            stmt.setInt(6, objeto.getId());
            stmt.setDouble(7, objeto.getTotal());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Produto carregaProduto(int id) {
        
        Produto objeto = new Produto();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produtos WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setDescricao(res.getString("descricao"));
            objeto.setQuantidade(res.getInt("quantidade"));
            objeto.setPreco(res.getDouble("preco"));
            objeto.setData(res.getString("data"));
            objeto.setTotal(res.getDouble("total"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
}
