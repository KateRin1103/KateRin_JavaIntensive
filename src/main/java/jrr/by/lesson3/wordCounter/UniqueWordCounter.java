package jrr.by.lesson3.wordCounter;

import java.util.Map;

import org.apache.log4j.Logger;

public class UniqueWordCounter {

    private Map<Integer, String> words;

    public Map<Integer, String> getWords() {
        return words;
    }

    public void setWords(Map<Integer, String> words) {
        this.words = words;
    }

    public UniqueWordCounter(Map<Integer, String> states) {
        this.words = states;
    }

    public UniqueWordCounter() {
    }

    @Override
    public String toString() {
        return "UniqueWordCounter{" +
                "states=" + words +
                '}';
    }

    Logger logger = Logger.getLogger(UniqueWordCounter.class);

    public int addWord(Integer key, String word) {

        words.put(key, word);
        int count = 0;

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            if (word.equals(entry.getValue())) count++;
        }

        logger.info("Count of word = " + count);

        return count;
    }

    public String getMostFrequentWord() {

        int max = 0;
        int count = 0;
        String frequentWord = null;
        int i = 0;

        for (Map.Entry<Integer, String> word : words.entrySet()) {
            for (Map.Entry<Integer, String> entry : words.entrySet()) {
                if (entry.getValue().equals(word.getValue()) && i != 0) {
                    count++;
                }
                i++;
            }
            if (count > max) {
                max = count;
                frequentWord = word.getValue();
            }
            i = 0;
            count = 0;
        }

        logger.info("The most frequent word is " + frequentWord);
        return frequentWord;
    }

    public void printWordsFrequency() {
        logger.info(words.toString());
    }
}
