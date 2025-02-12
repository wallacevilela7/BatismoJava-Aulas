package Main.entities;

import Main.enums.TipoHabilidade;

public class NinjaAvancado extends NinjaBasico {
    private String habilidadeEspecial;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, Integer idade, String habilidade, TipoHabilidade tipoHabilidade, String habilidadeEspecial) {
        super(nome, idade, habilidade, tipoHabilidade);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Além disso minha habilidade especial é: " + habilidadeEspecial);
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println("Executando especial: " + habilidadeEspecial);
    }
}
