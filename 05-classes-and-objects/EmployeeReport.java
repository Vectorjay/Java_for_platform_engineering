public class EmployeeReport {

    public static void main(String[] args) {

        printHeader();
        printCompanyName();
        printEmployeeDetails();
        printFooter();

    }

    // Method 1
    public static void printHeader() {
        System.out.println("==================================");
        System.out.println("        EMPLOYEE REPORT");
        System.out.println("==================================");
    }

    // Method 2
    public static void printCompanyName() {
        System.out.println("Company: Vector Technologies");
        System.out.println();
    }

    // Method 3
    public static void printEmployeeDetails() {

        double monthlySalary = 2500000.0;
        double annualSalary = monthlySalary * 12;
        double taxRate = 0.10;
        double taxAmount = annualSalary * taxRate;
        double salaryAfterTax = annualSalary - taxAmount;
        boolean eligibleForBonus = annualSalary > 20000000;

        System.out.println("Monthly Salary   :₦" + monthlySalary);
        System.out.println("Annual Salary    :₦" + annualSalary);
        System.out.println("Tax Rate         :" + (taxRate * 100) + "%");
        System.out.println("Tax Amount       :₦" + taxAmount);
        System.out.println("Salary After Tax :₦" + salaryAfterTax);
        System.out.println("Eligible for Bonus :" + eligibleForBonus);
    }

    // Method 4
    public static void printFooter() {
        System.out.println();
        System.out.println("==================================");
        System.out.println("End of Report");
        System.out.println("==================================");
    }
}