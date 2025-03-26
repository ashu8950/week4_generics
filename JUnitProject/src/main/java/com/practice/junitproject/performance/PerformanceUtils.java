package com.practice.junitproject.performance;

public class PerformanceUtils {
    /**
     * Simulates a long-running task with a 3-second delay.
     */
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        return "Task Completed";
    }
}
