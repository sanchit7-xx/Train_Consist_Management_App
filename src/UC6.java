import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("====================================\n");

        // Create HashMap
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        System.out.println("Bogie Capacity Mapping Created:\n");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}