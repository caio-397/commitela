package Model;

public abstract class Pessoa {

    // Atributos
    private int id;
    private String nome;
    private String descricao;

    // M�todo Construtor de Objeto Vazio
    public Pessoa() {
    }

    // M�todo Construtor de Objeto, inserindo dados
    public Pessoa(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    // M�todos GET e SET
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

}
