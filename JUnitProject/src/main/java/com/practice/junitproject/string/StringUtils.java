package com.practice.junitproject.string;

public class StringUtils {
	//method to reverse
	public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
	//method to check pallindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }
    //method to convert upperCase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
