package com.leetcode.test;

import com.leetcode.problems.NthTribonaci;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class NthTribonaciTest {

    private final int input;
    private final int output;
    private NthTribonaci tribonaci;

    public NthTribonaciTest(int input, int output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        tribonaci = new NthTribonaci();
    }

    @Parameterized.Parameters
    public static Collection params() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 1},
                {2, 1},
                {4, 4},
                {4, 4},
                {25, 1389537},
        });
    }

    @Test
    public void testTribonaci() {
        System.out.println(input + "," + output);
        Assert.assertEquals(output, tribonaci.tribonaci(input));
    }
}