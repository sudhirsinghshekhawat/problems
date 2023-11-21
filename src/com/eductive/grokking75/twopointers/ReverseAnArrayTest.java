package com.eductive.grokking75.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAnArrayTest {

    @Test
    public void testReverseAnArrayWithOddLength() {

        int[] originalArray = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        int[] reversedArray = ReverseAnArray.reverseAnArray(originalArray);
        assertArrayEquals(expectedResult, reversedArray);

    }


    @Test
    public void testReverseAnArrayWithEvenLength() {

        int[] originalArray = {1, 2, 3, 4, 5, 6};
        int[] expectedResult = {6, 5, 4, 3, 2, 1};
        int[] reversedArray = ReverseAnArray.reverseAnArray(originalArray);
        assertArrayEquals(expectedResult, reversedArray);
    }

}