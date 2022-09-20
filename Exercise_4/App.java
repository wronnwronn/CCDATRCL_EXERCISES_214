import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Classmates = new LinkedList<>();

        // Adds elements to the queue
        Classmates.add("Adia Ronn Matthew");
        Classmates.add("Du Alexander John");
        Classmates.add("Rifarial Neil");
        Classmates.add("Par Mycko Vicente Luis");
        Classmates.add("Abella Justine Nica");
        
        System.out.println(Classmates);
        System.out.println(Classmates.size());
        System.out.println(Classmates.peek());

        Classmates.remove();
        Classmates.remove();
        Classmates.remove();
        Classmates.remove();
        Classmates.remove();

        Classmates.add("Aranilla Idel Lawrence");
        Classmates.add("Bablis Winna Jane");
        Classmates.add("Calalang Victor Vinnie Lars");
        Classmates.add("Cinco Brandon Kenneth");
        Classmates.add("Guansing Ivan");

        System.out.println(Classmates);
        System.out.println(Classmates.size());
        System.out.println(Classmates.peek());
    }
}
