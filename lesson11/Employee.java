public class Employee {
    // Class Attributes
    private String name;
    private String role;
    private int age;
    private int experience;
    private double salary;

    // Constructor that catches errors and continues
    public Employee(String name, String role, int age, int experience, double salary) {

            setName(name);
            setRole(role);
            setAge(age);
            setExperience(experience);
            setSalary(salary);
    }

    // Method
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience);
        System.out.printf("Salary: %,.2f%n", salary);
        System.out.printf("Annual salary: %,.2f%n", calculateAnnualSalary());
    }

    // --- GETTER METHODS (Read)
    public String getName(){return this.name;}
    public String getRole(){return this.role;}
    public int getAge(){return this.age;}
    public int getExperience(){return this.experience;}
    public double getSalary(){return this.salary;}

    // --- SETTER METHODS (Change) ---
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setRole(String role){
        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role cannot be null or empty");
        }
        this.role = role;
    }

    public void setAge(int age){
        if(age >=18){
            this.age = age;
        }else {
            throw new IllegalArgumentException("Age must be 18");
            //System.out.println("Invalid Age");
        }

    }
    public void setExperience(int experience){
       if(experience <0) {
           throw new IllegalArgumentException("Experience cannot be negative");
           //System.out.println("Invalid Experience");
        }else{
           this.experience = experience;
        }
   }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary must be greater than 0");
            //System.out.println("Invalid Salary");
        }
    }

}