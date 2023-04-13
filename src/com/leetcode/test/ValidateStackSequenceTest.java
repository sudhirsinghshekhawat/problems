package com.leetcode.test;

import com.leetcode.problems.ValidateStackSequence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ValidateStackSequenceTest {

    public int[] pushed;
    public int[] popped;
    public boolean result;
    public ValidateStackSequence validateStackSequence;

    public ValidateStackSequenceTest(int[] pushed, int[] popped, boolean result) {
        this.pushed = pushed;
        this.popped = popped;
        this.result = result;
    }

    @Before
    public void setUp() {
        validateStackSequence = new ValidateStackSequence();
    }


    @Parameterized.Parameters
    public static Collection<Object> params() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}, true},
                {new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}, false}
        });
    }

    @Test
    public void testValidateStackSequence() {
        Assert.assertEquals(result, validateStackSequence.validateStackSequence(pushed, popped));
    }
}