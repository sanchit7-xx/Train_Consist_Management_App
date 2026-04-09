import java.util.Arrays;

public class TrainConsistManagementApp {

    // Binary Search with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        //  Step 1: Validate state (Fail-Fast)
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train to search.");
        }

        // 🔵 Step 2: Sort before searching
        Arrays.sort(bogieIds);

        // 🔵 Step 3: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true; // Found
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("UC20 - Exception Handling During Search\n");

        // 🔁 Try with empty array to test exception
        String[] bogieIds = {};

        try {
            boolean found = searchBogie(bogieIds, "BG101");

            if (found) {
                System.out.println("Bogie FOUND.");
            } else {
                System.out.println("Bogie NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}