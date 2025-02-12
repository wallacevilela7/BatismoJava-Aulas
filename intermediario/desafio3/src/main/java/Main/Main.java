package Main;

import Main.entities.NinjaAvancado;
import Main.entities.NinjaBasico;
import Main.enums.TipoHabilidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NinjaBasico ninja;

        System.out.println("Entre com os dados do ninja: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        Integer idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Habilidade: ");
        String habilidade = sc.nextLine();

        System.out.print("Escolha o tipo de habilidade: \nTAIJUTSU,\n" +
                "NINJUTSU,\n" +
                "GENJUTSU,\n" +
                "KATON,\n" +
                "RINNEGAN,\n" +
                "SHARINGAN: ");
        String tipo = sc.nextLine();

        System.out.print("Ninja comum(1) ou de nivel avançado?(2)");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 2){
            System.out.print("Habilidade especial: ");
            String habilidadeEspecial = sc.nextLine();
            ninja = new NinjaAvancado(nome, idade, habilidade, TipoHabilidade.valueOf(tipo), habilidadeEspecial);
        } else {
            ninja = new NinjaBasico(nome, idade, habilidade, TipoHabilidade.valueOf(tipo));
        }

        ninja.mostrarInformacoes();
        ninja.executarHabilidade();
    }
}
