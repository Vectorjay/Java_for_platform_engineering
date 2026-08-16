public class LoanEligibilityChecker  {
    public static void main(String[] args) {
        String applicantName = "Victor Onyia";
        int age = 35;
        double monthlySalary = 2500000.0;
        int yearsExperience = 7;

        System.out.println("===============================");
        System.out.println("     LOAN ELIGIBILITY CHECKER  ");
        System.out.println("==============================");
    System.out.println("Applicant: " + applicantName);
        System.out.println("Age: " + age);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Experience: " + yearsExperience + " years");

    if (age >= 18 && monthlySalary >= 500000 && yearsExperience >= 3) {
        System.out.println("Loan Status: " + "APPROVED");
        }
    else {
        System.out.println("Loan Status: " + "REJECTED");
        }
    }
}