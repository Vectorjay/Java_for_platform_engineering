import java.util.ArrayList;
public class EmployeeManagement {

    public static void main(String[] args) {
        //ArrayList<Employee> employeeList = new ArrayList<>();

        Department platformDepartment = new Department("Platform Engineering");
        Department cloudDepartment = new Department("Cloud Engineering");
        Department softwareDepartment = new Department("Software Engineering");

        Employee victor = new PlatformEngineer(
                "Victor Onyia",
                "Platform Engineer",
                34,
                7,
                50000,
                8,
                platformDepartment
        );
        victor.printDetails();

        Employee sarah = new CloudEngineer(
                "Sarah James",
                "Cloud Engineer",
                34,
                7,
                50000,
                "GCP",
                cloudDepartment
        );
        sarah.printDetails();

        Employee  paul = new SoftwareEngineer(
                "Paul Hamilton",
                "Software Engineer",
                23,
                4,
                10000,
                "Junior Developer",
                softwareDepartment
        );
        paul.printDetails();

    }
}
