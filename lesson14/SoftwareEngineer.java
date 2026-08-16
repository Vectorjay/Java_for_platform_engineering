public class SoftwareEngineer extends Employee implements Deployable{

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

    @Override
    public void deploy() {
        System.out.println("Deploy using CI/CD....");
    }

    @Override
    public String describeRole() {
        return "Develops and maintains software applications";
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