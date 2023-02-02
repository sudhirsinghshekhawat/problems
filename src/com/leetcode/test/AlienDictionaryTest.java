package com.leetcode.test;

import com.leetcode.problems.AlienDictionary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AlienDictionaryTest {

    private String[] words;
    private String order;
    private boolean result;
    private AlienDictionary alienDictionary;

    public AlienDictionaryTest(String[] words, String order, boolean result) {
        this.words = words;
        this.order = order;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        alienDictionary = new AlienDictionary();
    }

    @Parameterized.Parameters
    public static Collection params() {
        return Arrays.asList(new Object[][]{
                {new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz", true},
                {new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz", false},
                {new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz", false},

        });
    }

    @Test
    public void testIsAlienSorted() {
        Assert.assertEquals(result, alienDictionary.isAlienSorted(words, order));
    }
}