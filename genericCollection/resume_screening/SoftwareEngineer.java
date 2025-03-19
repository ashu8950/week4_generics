package genericCollection.resume_screening;

public class SoftwareEngineer extends JobRole {
    private int yearsOfExperience;

    public SoftwareEngineer(String candidateName, int yearsOfExperience) {
        super(candidateName);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean screen() {
        return yearsOfExperience >= 2;
    }
}
