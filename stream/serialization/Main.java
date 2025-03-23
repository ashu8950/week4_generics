package stream.serialization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Alice", "HR", 50000));
        employeeList.add(new Employee(102, "Bob", "Engineering", 70000));
        employeeList.add(new Employee(103, "Clara", "Marketing", 60000));

        EmployeeSerializer.serialize(employeeList);

        List<Employee> retrievedList = EmployeeSerializer.deserialize();

        if (retrievedList != null) {
            System.out.println("\nDeserialized Employee List:");
            for (Employee emp : retrievedList) {
                System.out.println(emp);
            }
        }
    }
}

