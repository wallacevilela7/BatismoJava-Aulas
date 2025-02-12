package Main.entities;

import Main.enums.TipoHabilidade;
import Main.interfaces.Ninja;

public class NinjaBasico implements Ninja {

    private String nome;
    private Integer idade;
    private String habilidade;
    private TipoHabilidade tipoHabilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, Integer idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
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

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public TipoHabilidade getTipoHabilidade() {
        return tipoHabilidade;
    }

    public void setTipoHabilidade(TipoHabilidade tipoHabilidade) {
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja: " + nome +
                "\nIdade: " + idade +
                "\nHabilidade: " + habilidade +
                "\nTipo Habilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Usando habilidade: " + habilidade);
    }
}