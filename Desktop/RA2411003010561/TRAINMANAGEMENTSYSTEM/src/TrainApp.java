import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // 4. Program continues...
        System.out.println("System ready for further operations.");
    }
}