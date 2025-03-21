package collection_framework.Map.employee_grouper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR"),
            new Employee("David", "Finance")
        );
        //object created for calling method
        EmployeeGrouper grouper = new EmployeeGrouper();
        Map<String, List<Employee>> grouped = grouper.groupByDepartment(employees);

        for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
