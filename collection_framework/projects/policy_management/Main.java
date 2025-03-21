package collection_framework.projects.policy_management;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P1001", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P1002", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P1003", "Alice", LocalDate.now().plusDays(5)));
        manager.addPolicy(new Policy("P1004", "Charlie", LocalDate.now().minusDays(2)));

        System.out.println("Get Policy P1001:");
        System.out.println(manager.getPolicy("P1001"));

        System.out.println(" Expiring in 30 days:");
        for (Policy p : manager.getExpiringSoon()) {
            System.out.println(p);
        }

        System.out.println("Policies for Alice:");
        for (Policy p : manager.getPoliciesByHolder("Alice")) {
            System.out.println(p);
        }

        System.out.println(" Removing expired policies...");
        manager.removeExpiredPolicies();

        System.out.println("All Policies (in insertion order):");
        manager.printAllPolicies();
    }
}
