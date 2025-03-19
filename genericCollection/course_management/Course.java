package genericCollection.course_management;

import java.util.ArrayList;
import java.util.List;

// Generic class to manage any type of CourseType
public class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    // Add a course to the list
    public void addCourse(T course) {
        courseList.add(course);
    }

    // Display all courses with evaluation info
    public void showAllCourses() {
        for (T course : courseList) {
            System.out.println(course.toString());
        }
    }

    // Get the internal list of courses (used with wildcards)
    public List<T> getCourses() {
        return courseList;
    }
}
