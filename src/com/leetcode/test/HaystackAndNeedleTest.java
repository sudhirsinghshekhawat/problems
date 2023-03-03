package com.leetcode.test;

import com.leetcode.problems.AlienDictionary;
import com.leetcode.problems.HaystackAndNeedle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class HaystackAndNeedleTest {

    private String hayStack;
    private String needle;

    private int index;

    public HaystackAndNeedle haystackAndNeedle;

    public HaystackAndNeedleTest(String hayStack, String needle, int index) {
        this.hayStack = hayStack;
        this.needle = needle;
        this.index = index;
    }

    @Before
    public void setUp() throws Exception {
        haystackAndNeedle = new HaystackAndNeedle();
    }


    @Parameterized.Parameters
    public static Collection params() {
        return Arrays.asList(new Object[][]{
                {"sadbutsad", "sad", 0},
                {"leetcode", "leeto", -1}
        });
    }

    @Test
    public void testStrStr() {
        Assert.assertEquals(index, haystackAndNeedle.strStr(hayStack, needle));
    }


}