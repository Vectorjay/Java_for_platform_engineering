public class EmployeeManagement  {
    // Main Method to run the code
    public static void main(String[] args) {
        Employee victor = new Employee(
                "Victor Onyia",
                "Platform Engineer",
                34,
                6,
                2300000
        );
        Employee sarah = new Employee(
                "Sarah James",
                "Cloud Engineer",
                29,
                5,
                1800000
        );
        victor.printDetails();
        sarah.printDetails();
    }
}