package genericCollection.resume_screening;

import java.util.ArrayList;
import java.util.List;

// Generic class to handle resumes of any JobRole
public class Resume<T extends JobRole> {
    private List<T> resumeList = new ArrayList<>();

    public void addResume(T resume) {
        if (resume.screen()) {
            resumeList.add(resume);
        } else {
            System.out.println("Rejected: " + resume.getCandidateName() + " (" + resume.getClass().getSimpleName() + ")");
        }
    }

    public void showShortlisted() {
        for (T r : resumeList) {
            System.out.println("✅ " + r);
        }
    }

    public List<T> getAll() {
        return resumeList;
    }
}
