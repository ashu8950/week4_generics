package genericCollection.course_management;

import java.util.List;

//Utility class using wildcard to handle any CourseType list
public class CourseUtility {

 // Display courses using wildcard type (? extends CourseType)
 public static void showCourses(List<? extends CourseType> courses) {
     for (CourseType course : courses) {
         System.out.println(course.toString());
     }
 }
}
