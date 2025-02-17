import entities.BolsaNinja;
import entities.EquipamentoNinja;

public class Main {
    public static void main(String[] args) {
        EquipamentoNinja kunaiPadrao = new EquipamentoNinja("Kunai padrao");
        EquipamentoNinja shuriken = new EquipamentoNinja("Shuriken");
        EquipamentoNinja pergaminho = new EquipamentoNinja("Pergaminho de invocação");

        BolsaNinja<EquipamentoNinja> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.addEquipamento(kunaiPadrao);
        bolsaNinja.addEquipamento(shuriken);
        bolsaNinja.addEquipamento(pergaminho);

        System.out.println(bolsaNinja);
    }
}
