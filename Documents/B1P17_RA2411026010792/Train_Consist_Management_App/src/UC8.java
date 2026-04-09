import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("UC13 - Performance Comparison\n");

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100));
        }

        // Loop timing
        long start1 = System.nanoTime();

        List<Bogie> result1 = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result1.add(b);
            }
        }

        long end1 = System.nanoTime();

        // Stream timing
        long start2 = System.nanoTime();

        List<Bogie> result2 = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long end2 = System.nanoTime();

        System.out.println("Loop Time: " + (end1 - start1));
        System.out.println("Stream Time: " + (end2 - start2));
    }
}