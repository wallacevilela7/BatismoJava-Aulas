import entity.Ninja;
import entity.Uchiha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("=====Gerenciamento de ninjas=====");


        int option;
        List<Ninja> list = new ArrayList<>();

        do
        {
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar Habilidades Especiais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    Integer idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Missao: ");
                    String missao = sc.nextLine();

                    System.out.print("Dificuldade: ");
                    String dificuldade = sc.nextLine();

                    System.out.print("Status: ");
                    String status = sc.nextLine();

                    System.out.print("Clan: ");
                    String ninjaType = sc.nextLine();

                    if (ninjaType.equalsIgnoreCase("uchiha")) {
                        System.out.println("Defina a habilidade especial: ");
                        String habilidadeEspecial = sc.nextLine();
                        list.add(new Uchiha(nome, idade, missao, dificuldade, status, habilidadeEspecial));
                        break;
                    }

                    list.add(new Ninja(nome, idade, missao, dificuldade, status));
                    break;

                case 2:
                    for (Ninja ninja : list)
                        ninja.mostrarInformacoes();
                    break;
                case 3:
                    System.out.println("Atualizanção habilidade especial");
                    System.out.println("Digite o nome do ninja: ");
                    String nomeNinja = sc.nextLine();
                    System.out.println("Nova habilidade especial: ");
                    String novaHab = sc.nextLine();

                    list.stream()
                            .filter(x -> x instanceof Uchiha && x.getNome().equalsIgnoreCase(nomeNinja))
                            .map(x -> (Uchiha) x)
                            .forEach(uchiha -> uchiha.setHabilidadeEspecial(novaHab));

                    break;
                case 4:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (option != 4);

    }
}
