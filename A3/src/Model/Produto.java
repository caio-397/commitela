package Model;

import java.util.*;
import DAO.ProdutoDAO;
import java.sql.SQLException;

public class Produto extends Pessoa {

    // Atributos
    private int quantidade;
    private double preco;
    private String data;
    private final ProdutoDAO dao; 

    // M�todo Construtor de Objeto Vazio
    public Produto() {
        this.dao = new ProdutoDAO(); // inicializado n�o importa em qual construtor
    }

    // M�todo Construtor de Objeto, inserindo dados
    public Produto(int quantidade, double preco, String data){
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
        this.dao = new ProdutoDAO(); // inicializado n�o importa em qual construtor
    }

    // M�todo Construtor usando tamb�m o construtor da SUPERCLASSE
    public Produto(int quantidade, double preco, int id, String nome, String descricao, String data) {
        super(id, nome, descricao);
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
        this.dao = new ProdutoDAO(); // inicializado n�o importa em qual construtor
    }

    // M�todos GET e SET
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
    

    // Override necess�rio para poder retornar os dados de Pessoa no toString para produto.
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n descricao: " + this.getDescricao()
                + "\n quantidade: " + this.getQuantidade()
                + "\n preco:" + this.getPreco()
                + "\n data:" + this.getData()
                + "\n -----------";
    }

    /*
    
        ABAIXO OS M�TODOS PARA USO JUNTO COM O DAO
        SIMULANDO A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    
     */
    // Retorna a Lista de Produto(objetos)
    public ArrayList getMinhaLista() {
        //return ProdutoDAO.MinhaLista;
        return dao.getMinhaLista();
    }

    // Cadastra novo Produto
//    public boolean InsertProdutoBD(String curso, int fase, String nome, int idade) {
    public boolean InsertProdutoBD(int quantidade, double preco, String nome, String descricao, String data) throws SQLException {
        int id = this.maiorID() + 1;
        Produto objeto = new Produto(quantidade, preco, id, nome, descricao, data);
//        ProdutoDAO.MinhaLista.add(objeto);
        dao.InsertProdutoBD(objeto);
        return true;

    }

    // Deleta um Produto espec�fico pelo seu campo ID
    public boolean DeleteProdutoBD(int id) {
//        int indice = this.procuraIndice(id);
//        ProdutoDAO.MinhaLista.remove(indice);
        dao.DeleteProdutoBD(id);
        return true;
    }

    // Edita um Produto espec�fico pelo seu campo ID
    public boolean UpdateProdutoBD(int quantidade, double preco, int id, String nome, String descricao, String data) {
        Produto objeto = new Produto(quantidade, preco, id, nome, descricao, data);
//        int indice = this.procuraIndice(id);
//        ProdutoDAO.MinhaLista.set(indice, objeto);
        dao.UpdateProdutoBD(objeto);
        return true;
    }

    // procura o INDICE de objeto da MinhaLista que contem o ID enviado.
//    private int procuraIndice(int id) {
//        int indice = -1;
//        for (int i = 0; i < ProdutoDAO.MinhaLista.size(); i++) {
//            if (ProdutoDAO.MinhaLista.get(i).getId() == id) {
//                indice = i;
//            }
//        }
//        return indice;
//    }

    // carrega dados de um Produto espec�fico pelo seu ID
    public Produto carregaProduto(int id) {
//        int indice = this.procuraIndice(id);
//        return ProdutoDAO.MinhaLista.get(indice);
        dao.carregaProduto(id);
        return null;
    }
    
    // retorna o maior ID da nossa base de dados
        public int maiorID() throws SQLException{
//    public int maiorID(){
//        return ProdutoDAO.maiorID();
        return dao.maiorID();
    }   
}
