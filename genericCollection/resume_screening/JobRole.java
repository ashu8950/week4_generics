package genericCollection.resume_screening;

//Base class for all job roles
public abstract class JobRole {
 private String candidateName;

 public JobRole(String candidateName) {
     this.candidateName = candidateName;
 }

 public String getCandidateName() {
     return candidateName;
 }

 // Abstract method for screening logic
 public abstract boolean screen();

 @Override
 public String toString() {
     return candidateName + " (" + this.getClass().getSimpleName() + ")";
 }
}

