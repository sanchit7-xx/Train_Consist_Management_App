import java.util.*;
import java.util.stream.Collectors;

// Bogie class (same as UC7)
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
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Display original list
        System.out.println("Original Bogie List:\n");
        bogieList.forEach(System.out::println);

        // Step 3: Apply Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Step 4: Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):\n");
        filteredBogies.forEach(System.out::println);

        // Step 5: Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):\n");
        bogieList.forEach(System.out::println);
    }
}