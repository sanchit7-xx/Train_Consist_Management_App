import java.util.*;
import java.util.stream.Collectors;

// Bogie class (same as previous use cases)
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " Bogie - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Adding multiple bogies (including duplicates for grouping demo)
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));

        // Step 2: Display original list
        System.out.println("Original Bogie List:\n");
        bogieList.forEach(System.out::println);

        // Step 3: Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Step 4: Display grouped result
        System.out.println("\nGrouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie bogie : entry.getValue()) {
                System.out.println("   " + bogie);
            }
        }

        // Step 5: Verify original list unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):\n");
        bogieList.forEach(System.out::println);
    }
}
