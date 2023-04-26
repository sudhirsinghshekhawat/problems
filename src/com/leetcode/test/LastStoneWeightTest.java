package com.leetcode.test;

import com.leetcode.problems.LastStoneWeight;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LastStoneWeightTest {

    public int[] input;
    public int output;

    public LastStoneWeight lastStoneWeight;


    public LastStoneWeightTest(int[] input, int output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        lastStoneWeight = new LastStoneWeight();
    }

    @Parameterized.Parameters
    public static Collection<Object> params() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 7, 4, 1, 8, 1}, 1},
                {new int[]{1}, 1}
        });
    }


    @Test
    public void lastStoneWeight() {
        Assert.assertEquals(output, lastStoneWeight.lastStoneWeight(input));
    }
}