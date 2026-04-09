import java.util.regex.Pattern;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 11: Validate Train ID & Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Developer
 * @version 11.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Code ");
        System.out.println("===========================================\n");

        // Sample inputs (you can change these for testing)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // ----- Define regex patterns -----
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // ----- Validate using Pattern.matches() -----
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // ----- Display results -----
        System.out.println("Train ID: " + trainId);
        System.out.println("Is Valid? " + isTrainValid);

        System.out.println("\nCargo Code: " + cargoCode);
        System.out.println("Is Valid? " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}