public class SalaryCalculatorV2 {

    public static double calculateAnnualSalary(double monthlySalary) {
        return monthlySalary * 12;
    }

    public static double calculateTax(double annualSalary) {
        return annualSalary * 0.10;
    }

    public static double calculateSalaryAfterTax(double annualSalary) {
        return annualSalary - calculateTax(annualSalary);
    }

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("       SALARY REPORT          ");
        System.out.println("==============================");

        double monthlySalary = 2500000;

        double annualSalary = calculateAnnualSalary(monthlySalary);

        double taxAmount = calculateTax(annualSalary);

        double salaryAfterTax = calculateSalaryAfterTax(annualSalary);

        System.out.println("Monthly Salary : " + monthlySalary);
        System.out.println("Annual Salary  : " + annualSalary);
        System.out.println("Tax Amount     : " + taxAmount);
        System.out.println("Salary After Tax : " + salaryAfterTax);

        System.out.println("==============================");

    }
}