package jrr.by.lesson3.wordCounter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterTest {

    private Map<Integer,String> words = new HashMap<>();

    @BeforeEach
    void initialization(){
        words.put(1, "apple");
        words.put(2, "apple");
        words.put(3, "mango");
    }

    @Test
    void addWord() {
        UniqueWordCounter wordCounter = new UniqueWordCounter(words);
        assertEquals(3, wordCounter.addWord(4, "apple"));
    }

    @Test
    void getMostFrequentWord() {
        UniqueWordCounter wordCounter = new UniqueWordCounter(words);
        assertEquals("apple", wordCounter.getMostFrequentWord());
    }

    @Test
    void printWordsFrequency() {
        UniqueWordCounter wordCounter = new UniqueWordCounter(words);
        wordCounter.printWordsFrequency();
    }
}