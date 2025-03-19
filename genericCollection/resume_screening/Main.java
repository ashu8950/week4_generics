package genericCollection.resume_screening;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Resumes for Software Engineers
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addResume(new SoftwareEngineer("Alice", 3));
        seResumes.addResume(new SoftwareEngineer("Bob", 1)); // rejected

        // Resumes for Data Scientists
        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addResume(new DataScientist("Carol", true));
        dsResumes.addResume(new DataScientist("David", false)); // rejected

        // Resumes for Product Managers
        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addResume(new ProductManager("Eve", true));
        pmResumes.addResume(new ProductManager("Frank", false)); // rejected

        // Display shortlisted
        System.out.println("=== Shortlisted Software Engineers ===");
        seResumes.showShortlisted();

        System.out.println("\n=== Shortlisted Data Scientists ===");
        dsResumes.showShortlisted();

        System.out.println("\n=== Shortlisted Product Managers ===");
        pmResumes.showShortlisted();

        // Use wildcard utility to process any resume type
        System.out.println("\n=== Wildcard Screening ===");
        ScreeningUtility.processResumes(seResumes.getAll());
        ScreeningUtility.processResumes(dsResumes.getAll());
        ScreeningUtility.processResumes(pmResumes.getAll());
    }
}

