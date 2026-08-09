public class EmployeeManagement  {
    // Main Method to run the code
    public static void main(String[] args) {
        Employee victor = new Employee(
                "Victor Onyia",
                "Platform Engineer",
                34,
                7,
                500000
        );

        //victor.printDetails();
        System.out.println("Age: " + victor.getAge());
        victor.setAge(15);
        System.out.println("Age after attempting to set 15: " + victor.getAge());

        System.out.println("Experienc: " + victor.getExperience());
        victor.setExperience(-12);
        System.out.println("Experience after attempting to set -12: " + victor.getExperience());

        System.out.println("Salary: " + victor.getSalary());
        victor.setSalary(-400000);
        System.out.println("Salary after attempting to set -400000: " + victor.getSalary());
    }
}