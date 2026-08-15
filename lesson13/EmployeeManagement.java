import java.util.ArrayList;
public  class EmployeeManagement {
    public static void main(String[] args) {
        // Create an ArrayList that stores Deployable objects
        ArrayList<Deployable> deployableList = new ArrayList<>();
        ArrayList<Monitorable> monitorableList = new ArrayList<>();

        try {
            PlatformEngineer victor = new PlatformEngineer(
                    "Victor Onyia",
                    "Platform Engineer",
                    34,
                    7,
                    50000,
                    8
            );
            deployableList.add(victor);
            monitorableList.add(victor);
            //victor.deploy();

        } catch (IllegalArgumentException e) {
            System.out.println("System Error: Failed to create employee record.");
            System.out.println("Reason: " + e.getMessage());
        }

        try {
            Deployable sarah = new CloudEngineer(
                    "Sarah James",
                    "Cloud Engineer",
                    34,
                    7,
                    50000,
                    "GCP"
            );
            deployableList.add(sarah);

        } catch (IllegalArgumentException e) {
            System.out.println("System Error: Failed to create employee record.");
            System.out.println("Reason: " + e.getMessage());
        }

        try {
            Deployable paul = new SoftwareEngineer(
                    "Paul Hamilton",
                    "Software Engineer",
                    23,
                    4,
                    10000,
                    "Junior Developer"
            );
            deployableList.add(paul);

        } catch (IllegalArgumentException e) {
            System.out.println("System Error: Failed to create employee record.");
            System.out.println("Reason: " + e.getMessage());
        }

        for (Deployable dep : deployableList ){
            dep.deploy();
            System.out.println();
        }
        for (Monitorable mon : monitorableList ){
            mon.monitor();
            System.out.println();
        }
    }
}