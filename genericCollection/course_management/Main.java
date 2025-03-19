package genericCollection.course_management;

public class Main {
    public static void main(String[] args) {
        // Create exam-based courses
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Math 101"));
        examCourses.addCourse(new ExamCourse("Physics 201"));

        // Create assignment-based courses
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("English Literature"));
        assignmentCourses.addCourse(new AssignmentCourse("History 101"));

        // Create research-based courses
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));
        researchCourses.addCourse(new ResearchCourse("Thesis Writing"));

        // Display each type of course using the generic method
        System.out.println("=== Exam Courses ===");
        examCourses.showAllCourses();

        System.out.println("\n=== Assignment Courses ===");
        assignmentCourses.showAllCourses();

        System.out.println("\n=== Research Courses ===");
        researchCourses.showAllCourses();

        // Display all courses using wildcard utility
        System.out.println("\n=== All Courses Using Wildcard ===");
        CourseUtility.showCourses(examCourses.getCourses());
        CourseUtility.showCourses(assignmentCourses.getCourses());
        CourseUtility.showCourses(researchCourses.getCourses());
    }
}

