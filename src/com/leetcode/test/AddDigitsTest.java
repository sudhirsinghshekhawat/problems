package com.leetcode.test;

import com.leetcode.problems.AddDigits;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AddDigitsTest {

    public int input;
    public int output;
    public AddDigits addDigits;

    public AddDigitsTest(int input, int output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        addDigits = new AddDigits();
    }

    @Parameterized.Parameters
    public static Collection<Object> params() {
        return Arrays.asList(new Object[][]{
                {11, 2},
                {65, 2},
                {36, 9}
        });
    }

    @Test
    public void testAddDigits() {
        Assert.assertEquals(output, addDigits.addDigits(input));
    }

    @Test
    public void addDigitsRecursive() {
        Assert.assertEquals(output, addDigits.addDigitsRecursive(input));
    }
}