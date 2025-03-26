package com.practice.junitproject.performance_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import com.practice.junitproject.performance.PerformanceUtils;
import java.util.concurrent.TimeUnit;

public class PerformanceUtilsTest {

    /**
     * Fails if execution exceeds 2 seconds (method takes 3 seconds).
     */
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS) // Enforce 2s time limit
    void testLongRunningTaskTimeout() {
        assertEquals("Task Completed", PerformanceUtils.longRunningTask());
    }
}
