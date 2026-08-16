public class EmployeeManagement  {
    // Main Method to run the code
    public static void main(String[] args) {
        try{
            Employee victor = new Employee(
                    "Victor Onyia",
                    "Platform Engineer",
                    18,
                    7,
                    50000,
                    8
            );

            victor.printDetails();

        }catch (IllegalArgumentException e) {
            System.out.println("System Error: Failed to create employee record.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Program continues running safely...");


    }
}