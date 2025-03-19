package genericCollection.course_management;

//Course evaluated by written exams
public class ExamCourse extends CourseType {
 public ExamCourse(String courseName) {
     super(courseName);
 }

 @Override
 public String evaluate() {
     return "Evaluated by written exams";
 }
}

