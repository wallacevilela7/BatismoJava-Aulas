package konohabank;

import konohabank.entities.BancoKonoha;
import konohabank.entities.ContaCorrente;
import konohabank.entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        BancoKonoha banco = new BancoKonoha();

        ContaCorrente c1 = new ContaCorrente("Naruto", "12345", 100.0 );
        ContaPoupanca c2 = new ContaPoupanca("Jiraya", "1111", 200.0);

        System.out.println(c1);
        System.out.println("**************************");
        System.out.println(c2);

        c1.depositar(50.0);
        c2.depositar(100.0);

        System.out.println("-------------------------------");
        System.out.println("Realizando depositos");
        System.out.println("-------------------------------");


        System.out.println(c1);
        System.out.println("**************************");
        System.out.println(c2);


        System.out.println("-------------------------------");
        System.out.println("Realizando transferencias");
        System.out.println("-------------------------------");

        banco.transferenciaEntreContas(c2, c1, 100.0);

        System.out.println(c1);
        System.out.println("**************************");
        System.out.println(c2);

    }
}
