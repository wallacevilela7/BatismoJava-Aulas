package entity;

public class Uchiha extends Ninja {
    private String habilidadeEspecial;

    public Uchiha(String nome, Integer idade, String missao, String nivelDeDificuldade, String statusMissao, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDeDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    private void mostrarHabilidade(){
        System.out.println("Minha habilidade especial é: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidade();
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
