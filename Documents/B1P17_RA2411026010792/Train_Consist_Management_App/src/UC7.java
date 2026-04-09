import java.util.ArrayList;
import java.util.HashMap; // Added for UC6
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map; // Added for UC6
import java.util.Set;
import java.util.Comparator;
class Bogie {
    String type;
    int capacity;
    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return type + " (" + capacity + " seats)";
    }
}
public class UC7 {
    private static List<String> passengerBogies = new ArrayList<>();
    private static Set<String> bogieIds = new HashSet<>();
    private static LinkedList<String> trainChain = new LinkedList<>();
    private static Set<String> trainFormation = new LinkedHashSet<>();
    private static Map<String, Integer> bogieCapacities = new HashMap<>();

    public static void main(String[] args) {
        // UC1: Initialize Train and Display Consist Summary

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Initializing system...");
        List<Object> trainConsist = new ArrayList<>();
        System.out.println("Status: Train initialized.");
        System.out.println("Current Bogie Count: " + trainConsist.size());

        System.out.println("\nReady for further operations...");
        System.out.println("------------------------------------");
        addPassengerBogiesToTrain();
        trackUniqueBogieIDs();
        maintainOrderedBogieIDs();
        preserveInsertionOrder();
        mapBogietoCapacity();
        sortBogiesbyCapacity();
    }
    public static void addPassengerBogiesToTrain() {
        System.out.println("=== UC2: Passenger Bogie Operations ===");

        // 1. Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("Adding bogies: Sleeper, AC Chair, First Class");
        System.out.println("Current Consist: " + passengerBogies);

        // 2. Removing a bogie
        String toRemove = "AC Chair";
        passengerBogies.remove(toRemove);
        System.out.println("\nRemoving bogie: " + toRemove);
        System.out.println("Updated Consist: " + passengerBogies);

        // 3. Checking existence
        String toCheck = "Sleeper";
        boolean exists = passengerBogies.contains(toCheck);
        System.out.println("\nChecking if '" + toCheck + "' exists in consist...");
        System.out.println("Result: " + (exists ? "Exists" : "Not Found"));

        // 4. Final state for UC2
        System.out.println("\nFinal Bogie Count: " + passengerBogies.size());
        System.out.println("Final Consist State: " + passengerBogies);
        System.out.println("------------------------------------\n");
    }
    public static void trackUniqueBogieIDs() {
        System.out.println("=== UC3: Unique Bogie ID Tracking ===");
        System.out.println("Registering Bogie IDs: BG101, BG102, BG101 (duplicate), BG103");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // This duplicate will be automatically ignored
        bogieIds.add("BG103");

        // 2. Display the Set
        System.out.println("Registered Unique IDs: " + bogieIds);

        // 3. Verification of size
        System.out.println("Total Unique Bogies Registered: " + bogieIds.size());

        if (bogieIds.size() < 4) {
            System.out.println("System Note: Duplicate IDs were detected and filtered automatically.");
        }

        System.out.println("------------------------------------\n");
    }
    public static void maintainOrderedBogieIDs() {
        System.out.println("=== UC4: Ordered Train Chaining (LinkedList) ===");

        // 1. Initial Chaining (addLast is the default for a train growing backwards)
        trainChain.add("Engine");
        trainChain.add("Sleeper");
        trainChain.add("AC");
        trainChain.add("Cargo");
        trainChain.addLast("Guard"); // Explicitly adding to the end

        System.out.println("Initial Chain: " + trainChain);

        // 2. Inserting in the middle (Pantry Car at position 2)
        System.out.println("Action: Inserting 'Pantry Car' at index 2...");
        trainChain.add(2, "Pantry Car");
        System.out.println("Updated Chain: " + trainChain);

        // 3. Removing from ends (Detach Engine and Guard for maintenance)
        System.out.println("Action: Detaching first and last units...");
        String detachedFirst = trainChain.removeFirst();
        String detachedLast = trainChain.removeLast();

        System.out.println("Detached: " + detachedFirst + " and " + detachedLast);

        // 4. Final state display
        System.out.println("Final Ordered Consist: " + trainChain);
        System.out.println("Current length: " + trainChain.size() + " units.");
        System.out.println("------------------------------------\n");
    }
    public static void preserveInsertionOrder() {
        System.out.println("=== UC5: Unique Ordered Formation (LinkedHashSet) ===");

        // 1. Attaching bogies in a specific sequence
        System.out.println("Action: Attaching Engine, Sleeper, Cargo, Guard...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 2. Attempting to add a duplicate
        System.out.println("Action: Attempting to attach duplicate 'Sleeper'...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("System Alert: Duplicate bogie detected! Attachment rejected.");
        }

        // 3. Display the formation
        System.out.println("Final Train Formation: " + trainFormation);
        System.out.println("Total Units in Formation: " + trainFormation.size());
        System.out.println("------------------------------------\n");
    }
    public static void mapBogietoCapacity() {
        System.out.println("=== UC6: Bogie Capacity Mapping (HashMap) ===");

        // 1. Mapping Bogies to Capacities using put(K, V)
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("Cargo", 500);

        System.out.println("Action: Capacities registered for all bogie types.");

        // 2. Iterating through the Map using entrySet()
        System.out.println("\n--- Detailed Bogie Inventory ---");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // 3. Fast Lookup Example
        String searchBogie = "Sleeper";
        System.out.println("\nQuick Lookup: Capacity of '" + searchBogie + "' is " + bogieCapacities.get(searchBogie) + " seats.");
        System.out.println("------------------------------------\n");
    }// Add this to your imports at the top!

    public static void  sortBogiesbyCapacity() {
        System.out.println("=== UC7: Sort Bogies by Capacity (Comparator) ===");

        // 1. Create a List of Bogie OBJECTS (Not just Strings anymore!)
        List<Bogie> passengerList = new ArrayList<>();

        // 2. Add the Bogies to our list
        passengerList.add(new Bogie("Sleeper", 72));
        passengerList.add(new Bogie("AC Chair", 56));
        passengerList.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting: " + passengerList);

        // 3. The Comparator "Sorting Hat"
        // We tell it: "Compare these using the 'capacity' number"
        passengerList.sort(Comparator.comparingInt(b -> b.capacity));

        // 4. Display the results
        System.out.println("After Sorting (Lowest to Highest Capacity):");
        for (Bogie b : passengerList) {
            System.out.println("-> " + b);
        }
        System.out.println("------------------------------------\n");
    }
}