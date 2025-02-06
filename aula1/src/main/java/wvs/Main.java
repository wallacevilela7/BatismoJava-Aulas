package wvs;

import wvs.ninja.Ninja;
import wvs.ninja.mission.Mission;

public class Main {

    public static void main(String[] args) {
        Ninja n = new Ninja(
                "Naruaito",
                10,
                new Mission(
                        "Exame chunnin",
                        'C',
                        "not finished"
                ));

        Ninja n2 = new Ninja(
                "Sasuke",
                11,
                new Mission(
                        "Vila da pedra",
                        'B',
                        "finished"
                ));

        Ninja n3 = new Ninja(
                "Shikas",
                11,
                new Mission(
                        "Investigar",
                        'A',
                        "not finished"
                ));

        System.out.println(n);
        System.out.println("---------------------------------------");
        System.out.println(n2);
        System.out.println("---------------------------------------");
        System.out.println(n3);
        System.out.println("---------------------------------------");

    }
}