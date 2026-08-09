public class Employee{
    // Class Attributes
    String name;
    String role;
    int age;
    int experience;
    double salary;

    // Constructor
   public Employee(String name, String role, int age, int experience, double salary){
        this.name = name;
        this.role = role;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
   }

   public double calculateAnnualSalary(){
       return salary * 12;
   }

   // The printDetails Method
   public void printDetails(){
       System.out.println("Name: " + name);
       System.out.println("Role: " + role);
       System.out.println("Age: " + age);
       System.out.println("Experience: " + experience);
       System.out.printf("Salary: %,.2f%n", + salary);
       System.out.printf("Annual salary: %,.2f%n", + calculateAnnualSalary());
   }
}