package collection_framework.Map.employee_grouper;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class EmployeeGrouper {

    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();

        for (Employee emp : employees) {
            String dept = emp.getDepartment();

            if (!groupedMap.containsKey(dept)) {
                groupedMap.put(dept, new ArrayList<>());
            }

            groupedMap.get(dept).add(emp);
        }

        return groupedMap;
    }
}

