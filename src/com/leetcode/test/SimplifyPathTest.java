package com.leetcode.test;

import com.leetcode.problems.SimplifyPath;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SimplifyPathTest {

    public final String input;
    public final String output;

    public SimplifyPath simplyPath;

    public SimplifyPathTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() {
        simplyPath = new SimplifyPath();
    }

    @Parameterized.Parameters
    public static Collection<Object> params() {
        return Arrays.asList(new Object[][]{
                {"/home/", "/home"},
                {"/../", "/"},
                {"/home//foo/", "/home/foo"},
        });
    }

    @Test
    public void testSimplifyPath() {
        Assert.assertEquals(output, simplyPath.simplifyPath(input));
    }


}