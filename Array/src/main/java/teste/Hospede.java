package teste;

public class Hospede {
    private String nome;
    private String sobrenome;
    private int idade;
    private Endereco endereco;


    public Hospede(String nome) {
        this(nome, "");
    }

    public Hospede(String nome, String sobrenome) {
        this(nome, sobrenome, 0);
    }

    public Hospede(String nome, String sobrenome, int idade) {
        this(nome, sobrenome, 0, null);
    }

    public Hospede(String nome, String sobrenome, int idade, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public Hospede() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}