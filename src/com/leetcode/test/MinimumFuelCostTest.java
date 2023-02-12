package com.leetcode.test;

import com.leetcode.problems.MinimumFuelCost;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MinimumFuelCostTest {
    private int[][] roads;
    private int seats;
    private int output;
    private MinimumFuelCost minimumFuelCost;

    public MinimumFuelCostTest(int[][] roads, int seats, int output) {
        this.roads = roads;
        this.seats = seats;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        minimumFuelCost = new MinimumFuelCost();
    }


    @Parameterized.Parameters
    public static Collection params() {
        return Arrays.asList(new Object[][]{
                {new int[][]{{0, 1}, {0, 2}, {0, 3}}, 5, 3},
                {new int[][]{{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}}, 2, 7},
        });
    }

    @Test
    public void testMinimumFuelCost() {
        Assert.assertEquals(output, minimumFuelCost.minimumFuelCost(roads, seats));
    }


}