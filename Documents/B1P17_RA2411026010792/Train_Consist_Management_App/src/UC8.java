public class TrainConsistManagementApp {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Class
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Method to assign cargo safely
        void assignCargo(String cargoType) {
            try {
                System.out.println("Attempting to assign " + cargoType + " to " + shape + " bogie");

                // Unsafe condition
                if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Petroleum cannot be assigned to a Rectangular bogie!");
                }

                // Safe assignment
                this.cargo = cargoType;
                System.out.println("Cargo assigned successfully: " + cargoType);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Assignment process completed.\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("UC15 - Safe Cargo Assignment Using try-catch-finally\n");

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");  //  Safe

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");  //  Unsafe

        GoodsBogie g3 = new GoodsBogie("Rectangular");
        g3.assignCargo("Coal");       //  Safe

        System.out.println("Program continues after handling exceptions...");
    }
}