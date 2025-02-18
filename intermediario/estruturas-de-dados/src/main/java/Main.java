import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array
        String[] array = new String[3];

        //Lista
        List<String> list = new ArrayList<>();

        //Stack - pilha
        //LIFO
        Stack<String> stack = new Stack<>();

        //Queue - fila
        //FIFO
        Queue<String> queue = new LinkedList<>();

        queue.add("Naruto");
        queue.add("Sasuke");
        queue.add("Sakura - gil");
        queue.add("Kakashi");
        queue.add("Chico amaro");

        System.out.println("Na fila: " + queue);

        //remove o primeiro (HEAD)
        queue.poll();

        System.out.println("Na fila apos poll: " + queue);

        //Como ver o HEAD
        System.out.println("Primeiro da fila (HEAD): " + queue.peek());

        queue.add("Hashirama");
        queue.add("Tomirama");

        System.out.println("Na fila apos atualizar: " + queue);

        
    }
}
