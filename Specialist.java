public class Specialist extends HealthProfessional {
    // Additional instance variable for Specialist
    private String expertise;

    // Default constructor
    public Specialist() {
        super();
        this.expertise = "";
    }

    // Constructor with parameters to initialize all instance variables
    public Specialist(int id, String name, String specialty, String expertise) {
        super(id, name, specialty);
        this.expertise = expertise;
    }

    // Method to print the health professional details
    @Override
    public void printInfo() {
        System.out.println("The Specialist details are:");
        super.printInfo();
        System.out.println("Expertise: " + expertise);
    }
}
