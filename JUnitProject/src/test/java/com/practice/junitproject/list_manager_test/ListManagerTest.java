package com.practice.junitproject.list_manager_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.practice.junitproject.list_manager.ListManager;

import java.util.ArrayList;
import java.util.List;

class ListManagerTest {
    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        ListManager.removeElement(list, 5);
        assertFalse(list.contains(5));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        ListManager.addElement(list, 10);
        assertEquals(2, ListManager.getSize(list));
        ListManager.removeElement(list, 5);
        assertEquals(1, ListManager.getSize(list));
    }
}

