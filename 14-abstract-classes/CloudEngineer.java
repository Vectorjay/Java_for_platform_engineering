public class CloudEngineer extends Employee implements Deployable{

    private String cloudProvider;

    public CloudEngineer(String name, String role, int age, int experience, double salary, String cloudProvider) {
        super(name, role, age, experience, salary);
        setCloudProvider(cloudProvider);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Cloud Provider : " + this.cloudProvider);
        System.out.println("======================");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying to GCP...");
        System.out.println("======================");
    }

    @Override
    public String describeRole() {
        return "Designs and manages cloud infrastructure";
    }

    public String getCloudProvider(){
        return cloudProvider;
    }

    public void setCloudProvider(String cloudProvider){
        if(cloudProvider == null || cloudProvider.isEmpty()){
            throw new IllegalArgumentException("Cloud Provider cannot be null or empty");
        }else {
            this.cloudProvider = cloudProvider;
        }
    }
}