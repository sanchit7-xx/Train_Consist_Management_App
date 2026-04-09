import java.util.LinkedHashSet;

public class UC5 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("====================================\n");

        // Create LinkedHashSet
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Display formation
        System.out.println("Train Formation (after adding bogies):");
        System.out.println("[Engine, Sleeper, Cargo, Guard, Sleeper]\n");

        System.out.println("Final Train Formation (duplicates removed, order preserved):");
        System.out.println(trainFormation + "\n");

        System.out.println("UC5 operations completed successfully...");
    }
}