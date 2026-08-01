import java.util.Scanner;

public class EmployeeRegistration{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter yyour role: ");
        String role = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your years of experirnce: ");
        int experience = input.nextInt();

        System.out.print("Enter your monthly salary: ");
        double monthlySalary = input.nextDouble();

        // Print report
        System.out.println();
        System.out.println("===============================");
        System.out.println("  Employee Registration        ");
        System.out.println("===============================");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience);
        System.out.println("Monthly Salary: " + monthlySalary);

        if(age >= 18){
            System.out.println("Eligible to work: YES");
        }
        else{
            System.out.println("Eligible to work: NO");
        }
        System.out.println("==============================");

        input.close();
    }
}