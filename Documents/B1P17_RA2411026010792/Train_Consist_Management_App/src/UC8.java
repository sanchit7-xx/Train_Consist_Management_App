public class TrainConsistManagementApp {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {

        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Method to display array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("UC16 - Sort Passenger Bogies by Capacity (Bubble Sort)\n");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Before Sorting: ");
        display(capacities);

        // Sorting using Bubble Sort
        bubbleSort(capacities);

        System.out.print("After Sorting: ");
        display(capacities);

        System.out.println("\nProgram continues...");
    }
}