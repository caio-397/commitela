package Model;

import java.util.*;
import DAO.AlunoDAO;
import java.sql.SQLException;

public class Produto extends Pessoa {

    // Atributos
    private int quantidade;
    private double preco;
    private String data;
    private final AlunoDAO dao; 

    // M�todo Construtor de Objeto Vazio
    public Produto() {
        this.dao = new AlunoDAO(); // inicializado n�o importa em qual construtor
    }

    // M�todo Construtor de Objeto, inserindo dados
    public Produto(int quantidade, double preco, String data){
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
        this.dao = new AlunoDAO(); // inicializado n�o importa em qual construtor
    }

    // M�todo Construtor usando tamb�m o construtor da SUPERCLASSE
    public Produto(int quantidade, double preco, int id, String nome, String descricao, String data) {
        super(id, nome, descricao);
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
        this.dao = new AlunoDAO(); // inicializado n�o importa em qual construtor
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
    

    // Override necess�rio para poder retornar os dados de Pessoa no toString para aluno.
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
    // Retorna a Lista de Alunos(objetos)
    public ArrayList getMinhaLista() {
        //return AlunoDAO.MinhaLista;
        return dao.getMinhaLista();
    }

    // Cadastra novo aluno
//    public boolean InsertAlunoBD(String curso, int fase, String nome, int idade) {
    public boolean InsertAlunoBD(int quantidade, double preco, String nome, String descricao, String data) throws SQLException {
        int id = this.maiorID() + 1;
        Produto objeto = new Produto(quantidade, preco, id, nome, descricao, data);
//        AlunoDAO.MinhaLista.add(objeto);
        dao.InsertAlunoBD(objeto);
        return true;

    }

    // Deleta um aluno espec�fico pelo seu campo ID
    public boolean DeleteAlunoBD(int id) {
//        int indice = this.procuraIndice(id);
//        AlunoDAO.MinhaLista.remove(indice);
        dao.DeleteAlunoBD(id);
        return true;
    }

    // Edita um aluno espec�fico pelo seu campo ID
    public boolean UpdateAlunoBD(int quantidade, double preco, int id, String nome, String descricao, String data) {
        Produto objeto = new Produto(quantidade, preco, id, nome, descricao, data);
//        int indice = this.procuraIndice(id);
//        AlunoDAO.MinhaLista.set(indice, objeto);
        dao.UpdateAlunoBD(objeto);
        return true;
    }

    // procura o INDICE de objeto da MinhaLista que contem o ID enviado.
//    private int procuraIndice(int id) {
//        int indice = -1;
//        for (int i = 0; i < AlunoDAO.MinhaLista.size(); i++) {
//            if (AlunoDAO.MinhaLista.get(i).getId() == id) {
//                indice = i;
//            }
//        }
//        return indice;
//    }

    // carrega dados de um aluno espec�fico pelo seu ID
    public Produto carregaAluno(int id) {
//        int indice = this.procuraIndice(id);
//        return AlunoDAO.MinhaLista.get(indice);
        dao.carregaAluno(id);
        return null;
    }
    
    // retorna o maior ID da nossa base de dados
        public int maiorID() throws SQLException{
//    public int maiorID(){
//        return AlunoDAO.maiorID();
        return dao.maiorID();
    }   
}
