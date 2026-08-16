import java.util.ArrayList;
public  class EmployeeManagement {
    public static void main(String[] args) {
        // Create the ArrayList that explicitly stores Employee objects
        ArrayList<Employee> employeeList = new ArrayList<>();

        try {
            Employee victor = new PlatformEngineer(
                    "Victor Onyia",
                    "Platform Engineer",
                    34,
                    7,
                    50000,
                    8
            );
            //victor.printDetails();
            employeeList.add(victor);

        } catch (IllegalArgumentException e) {
            System.out.println("System Error: Failed to create employee record.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Program continues running safely...");

        try {
            Employee sarah = new CloudEngineer(
                    "Sarah James",
                    "Cloud Engineer",
                    34,
                    7,
                    50000,
                    "GCP"
            );
            //sarah.printDetails();
            employeeList.add(sarah);

        } catch (IllegalArgumentException e) {
            System.out.println("System Error: Failed to create employee record.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Program continues running safely...");

        try {
            Employee paul = new SoftwareEngineer(
                    "Paul Hamilton",
                    "Software Engineer",
                    23,
                    3,
                    40000,
                    "Jnnior Developer"
            );
            //paul.printDetails();
            employeeList.add(paul);

        } catch (IllegalArgumentException e) {
            System.out.println("System Error: Failed to create employee record.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Program continues running safely...");

        System.out.println("\n--- Printing Employee List Details ---");

        // PASTE THE LOOP HERE:
        for (Employee emp : employeeList) {
            emp.printDetails();
            System.out.println();
        }
    }
}