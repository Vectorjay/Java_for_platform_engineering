public abstract class Employee {
    private String name;
    private String role;
    private int age;
    private int experience;
    private double salary;

    public abstract String describeRole();

    public Employee(String name, String role, int age, int experience, double salary) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
        System.out.println("Age: " + this.age);
        System.out.println("Experience: " + this.experience);
        System.out.println("Salary: " + this.salary);
    }

    // GETTERS
    public String getName(){return name;}
    public String getRole(){return role;}
    public int getAge(){return age;}
    public int getExperience(){return experience;}
    public double getSalary(){return salary;}

    //SETTERS
    public void setName(String name){this.name = name;}
    public void setRole(String role){this.role = role;}
    public void setAge(int age){this.age = age;}
    public void setExperience(int experience){this.experience = experience;}
    public void setSalary(double salary){this.salary = salary;}

}