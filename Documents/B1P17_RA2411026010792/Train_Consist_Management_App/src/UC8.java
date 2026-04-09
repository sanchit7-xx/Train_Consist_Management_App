import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()\n");

        // Array of bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        System.out.println("After Sorting: " + Arrays.toString(bogieNames));

        System.out.println("\nProgram continues...");
    }
}