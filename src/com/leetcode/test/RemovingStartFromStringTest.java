package com.leetcode.test;

import com.leetcode.problems.RemovingStarFromString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RemovingStartFromStringTest {

    public final String input;
    public final String output;

    public RemovingStarFromString removingStarFromString;

    public RemovingStartFromStringTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setup() {
        removingStarFromString = new RemovingStarFromString();
    }

    @Parameterized.Parameters
    public static Collection<Object> params() {
        return Arrays.asList(new Object[][]{
                {"leet**cod*e", "lecoe"},
                {"erase*******", ""}
        });
    }

    @Test
    public void testRemovingStrasFromString() {
        Assert.assertEquals(output, removingStarFromString.removingStrasFromString(input));
    }

    @Test
    public void testRemovingStarsFromString_1() {
        Assert.assertEquals(output, removingStarFromString.removingStarsFromString_1(input));
    }
}