package entity;

public class Ninja {
    private String nome;
    private Integer idade;
    private String missao;
    private String nivelDeDificuldade;
    private String statusMissao;

    public Ninja(String nome, Integer idade, String missao, String nivelDeDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDeDificuldade = nivelDeDificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade " + idade + "\nMissao: " + missao + "\nDificuldade: " + nivelDeDificuldade + "\nStatus: " + statusMissao);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getNivelDeDificuldade() {
        return nivelDeDificuldade;
    }

    public void setNivelDeDificuldade(String nivelDeDificuldade) {
        this.nivelDeDificuldade = nivelDeDificuldade;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }
}
