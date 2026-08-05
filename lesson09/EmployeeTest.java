public class EmployeeTest {

    public static void main(String[] args) {

        Employee victor = new Employee(
                "Victor Onyia",
                35,
                "Platform Engineer",
                2500000,
                7
        );

        System.out.println("EMPLOYEE 1");
        System.out.println("Name: " + victor.name);
        System.out.println("Age: " + victor.age);
        System.out.println("Role: " + victor.role);
        System.out.println("Salary: " + victor.salary);
        System.out.println("Experirnce: " + victor.experience + " Years");

    }
}