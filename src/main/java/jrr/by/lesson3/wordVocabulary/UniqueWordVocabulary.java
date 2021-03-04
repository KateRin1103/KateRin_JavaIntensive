package jrr.by.lesson3.wordVocabulary;

import java.util.Set;

import org.apache.log4j.Logger;

public class UniqueWordVocabulary {

    private Set<String> list;

    public UniqueWordVocabulary() {
    }

    public UniqueWordVocabulary(Set<String> list) {
        this.list = list;
    }

    public Set<String> getList() {
        return list;
    }

    public void setList(Set<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UniqueWordVocabulary{" +
                "list=" + list +
                '}';
    }

    public void addWord(String word) {
        list.add(word);
    }

    public int getWordsCount() {
        return list.size();
    }

    public void printVocabulary() {
        Logger logger = Logger.getLogger(UniqueWordVocabulary.class);
        logger.info(list.toString());
    }
}
