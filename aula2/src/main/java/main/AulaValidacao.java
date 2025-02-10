package main;

public class AulaValidacao {
    public static void main(String[] args) {

        String[] array = new String[6];

        array[0] = "Naruto";
        array[1] = "Sasuke";
        array[2] = "Sakura gil";
        array[3] = "Sou raiz ainda?";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        array = new String[1];
        System.out.println(array[0]);
    }
}
