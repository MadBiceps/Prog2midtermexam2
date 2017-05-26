/**
 * Created by Fabian on 24.05.2017.
 */
public class Main {
    public static void main(String args[]) {
        Container c1, c2, c3;

        // === STACK ===
        System.out.println("Stack befüllen mit 1..11");
        c1 = new StapelImpl(10);
        for (int i = 1; i <= 11; i++) {
            System.out.print(c1.schreiben(""+i) + " ");
        }
        System.out.println();
        while (!c1.istLeer()) {
            System.out.println(c1.lesen() + " ");
        }
        System.out.println();

        // === QUEUE ===
        System.out.println("Queue befüllen mit 1..11");
        c2 = new SchlangeImpl(10);
        for (int i = 1; i <= 11; i++) {
            System.out.print(c2.schreiben(""+i) + " ");
        }
        System.out.println();
        while (!c2.istLeer()) {
            System.out.println(c2.lesen() + " ");
        }
        System.out.println();

        // === QUEUE ===
        System.out.println("SQueue befüllen mit 9, 8, 7, 6, 2, 1, 2, 2, 1");
        c3 = new SSchlangeImpl(10);
        c3.schreiben(""+9);
        c3.schreiben(""+8);
        c3.schreiben(""+7);
        c3.schreiben(""+6);
        c3.schreiben(""+2);
        c3.schreiben(""+1);
        c3.schreiben(""+2);
        c3.schreiben(""+2);
        c3.schreiben(""+1);

        System.out.println("AVG): " + ((SSchlange) c3).avg());

        while (!c3.istLeer()) {
            System.out.println(c3.lesen() + " ");
        }
        System.out.println();
    }
}
