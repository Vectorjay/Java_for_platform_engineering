public  class SalaryCalculator {
    public static void main(String[] args) {
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
}