package com.example.sam.wordcounter;


import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 03/07/2017.
 */

public class WordCountTest {

    @Test
    public void wordCountTest() throws Exception {
        assertEquals(4 , WordCount.count("This is a test"));
    }

    @Test
    public void countToStringTest() throws Exception {
        assertEquals("4", WordCount.countString("This is a test"));
    }

    @Test
    public void countWordsTest() throws Exception {
        HashMap<String, Integer> result = new HashMap<>();
        result.put("this", 1);
        result.put("is", 2);
        result.put("a", 3);
        result.put("test", 1);
        assertEquals(result, WordCount.wordList("This is is a A a test"));
    }

}
