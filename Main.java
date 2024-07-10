public class Main {
    public static void main(String[] args) {
        // Creating a GeneralPractitioner instance
        GeneralPractitioner gp = new GeneralPractitioner(1, "Dr. John Doe", "General Practice", "City Health Clinic");
        gp.printInfo(); // Prints: The General Practitioner details are: ...

        System.out.println(); // Just to add a line break

        // Creating a Specialist instance
        Specialist sp = new Specialist(2, "Dr. Jane Smith", "Cardiology", "Heart Disease");
        sp.printInfo(); // Prints: The Specialist details are: ...
    }
}
j