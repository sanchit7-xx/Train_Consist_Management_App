import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true; // Found
            } else if (result < 0) {
                high = mid - 1; // Search left
            } else {
                low = mid + 1; // Search right
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("UC19 - Binary Search for Bogie ID\n");

        // Unsorted array (to test requirement)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 1: Sort before binary search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 2: Perform Binary Search
        boolean found = binarySearch(bogieIds, searchKey);

        // Output
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        System.out.println("\nProgram continues...");

        sc.close();
    }
}