public class SoftwareEngineer extends Employee{

    private String softwareEngineer;

    public SoftwareEngineer(String name, String role, int age, int experience, double salary, String softwareEngineer){
        super(name, role, age, experience, salary);
        setSoftwareEngineer(softwareEngineer);
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Software Engineer: " + this.softwareEngineer);
        System.out.println("======================");
    }

    public String getSoftwareEngineer(){
        return softwareEngineer;
    }
    public void setSoftwareEngineer(String softwareEngineer){
        if(softwareEngineer == null || softwareEngineer.isEmpty()){
            throw new IllegalArgumentException("Software Engineer cannot be null or empty");
        }else {
            this.softwareEngineer = softwareEngineer;
        }
    }
}