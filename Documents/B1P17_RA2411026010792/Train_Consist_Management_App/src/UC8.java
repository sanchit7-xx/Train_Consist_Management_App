import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method for Linear Search
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("UC18 - Linear Search for Bogie ID\n");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Output result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        System.out.println("\nProgram continues...");

        sc.close();
    }
}