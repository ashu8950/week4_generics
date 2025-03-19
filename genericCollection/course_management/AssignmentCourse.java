package genericCollection.course_management;

//Course evaluated by assignments
public class AssignmentCourse extends CourseType {
 public AssignmentCourse(String courseName) {
     super(courseName);
 }

 @Override
 public String evaluate() {
     return "Evaluated through assignments";
 }
}

