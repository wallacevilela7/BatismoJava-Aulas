import entities.BolsaNinja;
import entities.EquipamentoNinja;

import java.util.*;

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

        List<String> list = new ArrayList<>();


         //Queues - Filas
        // a queue faz parte da familia das linked lists - listas ligadas
        Queue<String> myQueue = new LinkedList<>();

    }
}