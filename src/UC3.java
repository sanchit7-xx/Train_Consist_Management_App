import java.util.HashSet;
import java.util.Set;

public class UC3 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("====================================\n");

        // Create HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display results
        System.out.println("Adding Bogie IDs (with duplicates):");
        System.out.println("BG101, BG102, BG103, BG101, BG102\n");

        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIds + "\n");

        System.out.println("UC3 operations completed successfully...");
    }
}