import java.util.ArrayList;

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee victor = new PlatformEngineer(
                "Victor Onyia",
                "Platform Engineer",
                34,
                7,
                50000,
                8
        );
        employeeList.add(victor);

        Employee sarah = new CloudEngineer(
                "Sarah James",
                "Cloud Engineer",
                34,
                7,
                50000,
                "GCP"
        );
        employeeList.add(sarah);

        Employee paul = new SoftwareEngineer(
                "Paul Hamilton",
                "Software Engineer",
                23,
                4,
                10000,
                "Junior Developer"
        );
        employeeList.add(paul);

        System.out.println("\n--- Role Descriptions ---");

        for (Employee employee : employeeList) {
            System.out.println(employee.getRole() + ": " + employee.describeRole());
            System.out.println();
        }
    }
}
