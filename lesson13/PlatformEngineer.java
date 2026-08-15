public class PlatformEngineer extends Employee implements Deployable, Monitorable{
    // New specific field for this subclass
    private int kubernetesExperience;

    // Constructor that passes standard data to parent and sets the new field
    public PlatformEngineer(String name, String role, int age, int experience, double salary, int kubernetesExperience) {
        super(name, role, age, experience, salary);
        setKubernetesExperience(kubernetesExperience);
    }
    // Overridden printDetails method
    @Override
    public void printDetails() {
        // 1. Run the parent's (Employee) version of printDetails() first
        super.printDetails();
        // 2. Print the Platform Engineer-specific information right after
        System.out.println("Kubernetes Experience: " + this.kubernetesExperience + " years");
        System.out.println("======================");

    }

    @Override
    public void deploy(){
        System.out.println("======================");
        System.out.println("Deploying application on Kubernetes...");
        System.out.println("======================");
    }

    @Override
    public void monitor(){
        System.out.println("======================");
        System.out.println("Monitoring application on Kubernetes...");
        System.out.println("======================");
    }

    public int getKubernetesExperience() {
        return kubernetesExperience;
    }

    public void setKubernetesExperience(int kubernetesExperience) {
        if (kubernetesExperience < 0 ) {
            throw new IllegalArgumentException("kubernetes Experience cannot be negative");
        }else{
            this.kubernetesExperience = kubernetesExperience;
        }
    }

}
