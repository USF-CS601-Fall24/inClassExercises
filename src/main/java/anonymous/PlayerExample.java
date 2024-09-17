package anonymous;


import java.util.*;

public class PlayerExample {
    public static void main(String[] args) {
        Player p1 = new Player("A", 0.367);
        Player p2 = new Player("B", 0.312);
        Player p3 = new Player("C", 0.389);

        // FILL IN CODE:
        // Pass an instance of an anonymous class that implements Comparator
        // and compares players by batting average (scores within eps = 0.01 are considered equal).
        SortedSet<Player> players1 = new TreeSet<>();
        players1.add(p1);
        players1.add(p2);
        players1.add(p3);
        System.out.println(players1);
        // Now that it works, change it to use lambda

        // FILL IN CODE:
        // Pass an instance of an anonymous class that implements Comparator
        // and compares players by name
        SortedSet<Player> players2 = new TreeSet<>();
        players2.add(p1);
        players2.add(p2);
        players2.add(p3);
        System.out.println(players2);
        // Now that it works, change it to use lambda

    }
}
