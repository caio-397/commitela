package Model;

import java.util.*;
import DAO.ProdutoDAO;
import java.sql.SQLException;

public class Produto{
// Exclui o extend dessa e fiz tudo em uma só --- apaga esse comentário dps so p n ficar feio
    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private double preco;
    private String data;
    private double total;
    private final ProdutoDAO dao; 
    

    
    public Produto() {
        this.dao = new ProdutoDAO(); 
    }

   
    public Produto(int quantidade, double preco, String data, double total, int id, String nome, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
        this.total = (preco * quantidade);
        this.dao = new ProdutoDAO(); 
    }

    
    public Produto(int quantidade, double preco, int id, String nome, String descricao, String data, double total) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
        this.total = (preco * quantidade);
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
        this.total = (preco * quantidade);
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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


    public boolean InsertProdutoBD(int quantidade, double preco, String nome, String descricao, String data, double total) throws SQLException {
        int id = this.maiorID() + 1;
        Produto objeto = new Produto(quantidade, preco, id, nome, descricao, data, total);

        dao.InsertProdutoBD(objeto);
        return true;

    }

 
    public boolean DeleteProdutoBD(int id) {

        dao.DeleteProdutoBD(id);
        return true;
    }

   
    public boolean UpdateProdutoBD(int quantidade, double preco, int id, String nome, String descricao, String data, double total) {
        Produto objeto = new Produto(quantidade, preco, id, nome, descricao, data, total);

        dao.UpdateProdutoBD(objeto);
        return true;
    }


    public Produto carregaProduto(int id) {
        dao.carregaProduto(id);
        return null;
    }
    

        public int maiorID() throws SQLException{

        return dao.maiorID();
    }   
}
