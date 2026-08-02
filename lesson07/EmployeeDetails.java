public class EmployeeDetails{
    // Method Defination
    public static void printEmployeeDetails(String name, String role, int age, int experience, double salary){
        System.out.println("===============================");
        System.out.println("      EMPLOYEE DETAILS         ");
        System.out.println("==============================");

        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience);
        System.out.println("Salary: " + salary);

    }

    // Call method
    public static void main(String[] args) {
        printEmployeeDetails(
                "Victor Onyia",
                "Platform Engineer",
                35,
                7,
                2500000
        );
        printEmployeeDetails(
                "Sarah James",
                "Cloud Engineer",
                29,
                5,
                1800000
        );
    }
}
