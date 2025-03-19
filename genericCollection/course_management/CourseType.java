package genericCollection.course_management;

//Abstract base class for all types of university courses
public abstract class CourseType {
 private String courseName;

 public CourseType(String courseName) {
     this.courseName = courseName;
 }

 public String getCourseName() {
     return courseName;
 }

 // Abstract method for defining evaluation strategy
 public abstract String evaluate();

 // Combines course name and evaluation description
 @Override
 public String toString() {
     return courseName + " (" + evaluate() + ")";
 }
}
