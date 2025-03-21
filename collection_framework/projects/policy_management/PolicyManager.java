package collection_framework.projects.policy_management;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class PolicyManager {
	    private HashMap<String, Policy> hashMap = new HashMap<>();
	    private LinkedHashMap<String, Policy> insertionOrderMap = new LinkedHashMap<>();
	    private TreeMap<LocalDate, List<Policy>> sortedByExpiry = new TreeMap<>();

	    // Add a policy
	    public void addPolicy(Policy policy) {
	        hashMap.put(policy.policyNumber, policy);
	        insertionOrderMap.put(policy.policyNumber, policy);

	        sortedByExpiry.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
	    }

	    // Retrieve by policy number
	    public Policy getPolicy(String policyNumber) {
	        return hashMap.get(policyNumber);
	    }

	    // List policies expiring in next 30 days
	    public List<Policy> getExpiringSoon() {
	        List<Policy> result = new ArrayList<>();
	        LocalDate now = LocalDate.now();
	        LocalDate limit = now.plusDays(30);

	        for (Map.Entry<LocalDate, List<Policy>> entry : sortedByExpiry.subMap(now, true, limit, true).entrySet()) {
	            result.addAll(entry.getValue());
	        }
	        return result;
	    }

	    // List policies by holder name
	    public List<Policy> getPoliciesByHolder(String holder) {
	        List<Policy> result = new ArrayList<>();
	        for (Policy p : hashMap.values()) {
	            if (p.policyHolder.equalsIgnoreCase(holder)) {
	                result.add(p);
	            }
	        }
	        return result;
	    }

	    // Remove expired policies
	    public void removeExpiredPolicies() {
	        LocalDate now = LocalDate.now();
	        SortedMap<LocalDate, List<Policy>> expired = sortedByExpiry.headMap(now);

	        for (List<Policy> policies : expired.values()) {
	            for (Policy p : policies) {
	                hashMap.remove(p.policyNumber);
	                insertionOrderMap.remove(p.policyNumber);
	            }
	        }

	        expired.clear(); // remove from TreeMap
	    }

	    // Print all policies (in insertion order)
	    public void printAllPolicies() {
	        for (Policy p : insertionOrderMap.values()) {
	            System.out.println(p);
	        }
	    }
}
