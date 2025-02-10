package cadastroNinjas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int option;
        int numMax;
        System.out.println("Insira o numero maximo de ninjas: ");
        numMax = sc.nextInt();
        sc.nextLine();

        String[] array = new String[numMax];
        int j = 0;
        do
        {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:

                    if(j == numMax){
                        System.out.println("Lista totalmente preenchida");
                        System.out.println("Para verificar os ninjas cadastrados selecione a opcao (2) no menu");
                        break;
                    }

                    System.out.println("Digite o nome do ninja: ");
                    String nome = sc.nextLine();
                    array[j] = nome;
                    System.out.println(nome + " adicionado à lista de ninjas");
                    j++;
                    break;
                case 2:
                    if (array[0] == null) {
                        System.out.println("Lista de ninjas esta vazia");
                        break;
                    }
                    System.out.println("Lista de Ninjas: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    break;
                case 3:
                    System.out.println("Finalizando....");
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        } while (option != 3);

        sc.close();
    }
}
