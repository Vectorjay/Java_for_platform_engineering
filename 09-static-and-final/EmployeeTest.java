public class EmployeeTest {

    public static void main(String[] args) {

        Employee victor = new Employee(
                "Victor Onyia",
                35,
                "Platform Engineer",
                2500000,
                7
        );
        Employee sarah = new Employee(
                "Sarah Smith",
                26,
                "Software Engineer",
                2300000,
                5
        );
        System.out.println("========================");
        System.out.println("EMPLOYEE 1");
        System.out.println("========================");
        System.out.println("Name: " + victor.name);
        System.out.println("Age: " + victor.age);
        System.out.println("Role: " + victor.role);
        System.out.println("Salary: " + victor.salary);
        System.out.println("Experirnce: " + victor.experience + " Years");

        System.out.println("========================");
        System.out.println("EMPLOYEE 2");
        System.out.println("========================");
        System.out.println("Name: " + sarah.name);
        System.out.println("Age: " + sarah.age);
        System.out.println("Role: " + sarah.role);
        System.out.println("Salary: " + sarah.salary);
        System.out.println("Experirnce: " + sarah.experience + " Years");

    }
}