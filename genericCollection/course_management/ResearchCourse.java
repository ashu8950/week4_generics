package genericCollection.course_management;

//Course evaluated by research work
public class ResearchCourse extends CourseType {
 public ResearchCourse(String courseName) {
     super(courseName);
 }

 @Override
 public String evaluate() {
     return "Evaluated based on research work";
 }
}
