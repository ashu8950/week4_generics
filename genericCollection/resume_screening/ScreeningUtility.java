package genericCollection.resume_screening;

import java.util.List;

//Utility class to screen any type of JobRole using wildcard
public class ScreeningUtility {

 // Accepts any list of resumes of any JobRole type
 public static void processResumes(List<? extends JobRole> resumes) {
     System.out.println("🔍 Screening resumes...");
     for (JobRole resume : resumes) {
         System.out.println("📄 " + resume);
     }
 }
}

