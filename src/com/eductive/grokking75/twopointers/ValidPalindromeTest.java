package com.eductive.grokking75.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() {
        String input = "ABBA";
        assertTrue(ValidPalindrome.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeWhenInputNotPalindrome() {
        String input = "RACEACARA";
        assertFalse(ValidPalindrome.isPalindrome(input));
    }
}