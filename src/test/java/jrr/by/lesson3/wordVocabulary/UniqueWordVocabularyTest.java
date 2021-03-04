package jrr.by.lesson3.wordVocabulary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordVocabularyTest {

    private  Set<String> vocabulary = new HashSet<String>();

    @BeforeEach
    void initialization(){
        vocabulary.add("apple");
        vocabulary.add("balloon");
        vocabulary.add("cat");
    }

    @Test
    void addWord() {
        UniqueWordVocabulary list = new UniqueWordVocabulary(vocabulary);
        list.addWord("device");
        assertEquals(4, list.getWordsCount());
    }

    @Test
    void addWordNull() {
        Set<String> vocabulary = new HashSet<String>();
        UniqueWordVocabulary list = new UniqueWordVocabulary(vocabulary);
        assertEquals(0, list.getWordsCount());
    }

    @Test
    void incorrectAddWord() {
        UniqueWordVocabulary list = new UniqueWordVocabulary(vocabulary);
        list.addWord("device");
        assertNotEquals(3, list.getWordsCount());
    }

    @Test
    void getWordsCount() {
        UniqueWordVocabulary list = new UniqueWordVocabulary(vocabulary);
        assertEquals(3,vocabulary.size());
    }

    @Test
    void incorrectGetWordsCount() {
        UniqueWordVocabulary list = new UniqueWordVocabulary(vocabulary);
        assertNotEquals(1,vocabulary.size());
    }

    @Test
    void printVocabulary() {
        UniqueWordVocabulary list = new UniqueWordVocabulary(vocabulary);
        list.printVocabulary();
    }
}