package com.example.sam.wordcounter;

import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import static java.nio.file.Paths.get;

/**
 * Created by Sam on 03/07/2017.
 */

public class WordCount {

    public static int count(String text){
        return text.split(" ").length;
    }

    public static String countString(String text){
        return Integer.toString(count(text));
    }

    public static HashMap<String, Integer> wordList(String text){
        HashMap<String, Integer> result = new HashMap();
        result.clear();
        for (String word: text.toLowerCase().split(" ")){
            Integer count = result.get(word);
            if (count == null) {
                count = 1;
            }
            else {
                count += 1;
            }
            result.put(word, count);
        }
        return result;
    }

    public static String wordListString(String text){
        return wordList(text).toString();
    }

//    public static String sortedWordList(String text){
//        HashMap<String, Integer> map = wordList(text);
//        ArrayList<HashMap.Entry<String, Integer>> sortedList = new ArrayList<HashMap.Entry<String, Integer>>();
//        for (HashMap.Entry<String, Integer> entry: map.entrySet()){
//            if (entry.getValue() > sortedList.get(0).getValue()){
//                sortedList.add(0, entry);
//            }
//            else {
//                sortedList.add(entry);
//            }
//        }
//        return sortedList.toString();
//
//    }
}
