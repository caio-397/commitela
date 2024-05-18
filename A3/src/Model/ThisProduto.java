package Model;

import java.util.*;
import DAO.ProdutoDAO;
import java.sql.SQLException;

public class ThisProduto extends GetSetProduto {

   
    private int quantidade;
    private double preco;
    private String data;
    private double total;
    private final ProdutoDAO dao; 
    

   
    public ThisProduto() {
        this.dao = new ProdutoDAO(); 
    }

    
    public ThisProduto(int quantidade, double preco, String data, double total){
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
        this.total = total;
        this.dao = new ProdutoDAO(); 
    }

   
    public ThisProduto(int quantidade, double preco, int id, String nome, String descricao, String data, double total) {
        super(id, nome, descricao);
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
        this.total = total;
        this.dao = new ProdutoDAO(); 
    }

  
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int curso) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    

   
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n descricao: " + this.getDescricao()
                + "\n quantidade: " + this.getQuantidade()
                + "\n preco:" + this.getPreco()
                + "\n data:" + this.getData()
                + "\n total:" + this.getTotal()
                + "\n -----------";
    }


    public ArrayList getMinhaLista() {
        
        return dao.getMinhaLista();
    }

    public boolean InsertProdutoBD(int quantidade, double preco, String nome, String descricao, String data) throws SQLException {
        int id = this.maiorID() + 1;
        ThisProduto objeto = new ThisProduto(quantidade, preco, id, nome, descricao, data, total);

        dao.InsertProdutoBD(objeto);
        return true;

    }

    
    public boolean DeleteProdutoBD(int id) {

        dao.DeleteProdutoBD(id);
        return true;
    }

    
    public boolean UpdateProdutoBD(int quantidade, double preco, int id, String nome, String descricao, String data) {
        ThisProduto objeto = new ThisProduto(quantidade, preco, id, nome, descricao, data, total);

        dao.UpdateProdutoBD(objeto);
        return true;
    }

    public ThisProduto carregaProduto(int id) {

        dao.carregaProduto(id);
        return null;
    }
    

        public int maiorID() throws SQLException{

        return dao.maiorID();
    }   
}
