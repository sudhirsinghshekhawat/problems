package com.leetcode.test;

import com.leetcode.problems.IsValidParenthesis;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsValidParenthesisTest {

    public final String input;
    public final boolean output;

    public IsValidParenthesis isValidParenthesis;

    public IsValidParenthesisTest(String input, boolean isValidParenthesis) {
        this.input = input;
        this.output = isValidParenthesis;
    }

    @Before
    public void setUp() {
        isValidParenthesis = new IsValidParenthesis();
    }

    @Parameterized.Parameters
    public static Collection<Object> params() {
        return Arrays.asList(new Object[][]{
                {"()", true},
                {"(){}[]", true},
                {"(]", false},
        });
    }

    @Test
    public void testIsValidParenthesis() {
        Assert.assertEquals(output, isValidParenthesis.isValidParenthesis(input));
    }


}