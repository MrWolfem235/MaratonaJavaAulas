package br.com.maratonajava.aula.XColections.exercises.domain;

import br.com.maratonajava.aula.TresouceBundle.classes.In;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    String content;
    Map<String, Integer> wordsOcurrencies = new TreeMap<>();

    public Text(String content) {
        setContent(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private void setWordsOcurrencies(String regexWords, boolean caseInsensitive){
        Pattern wordPattern = Pattern.compile(regexWords);
        Matcher matcher = wordPattern.matcher(content);
        while(matcher.find()){
            String tempWord = caseInsensitive ? matcher.group().toLowerCase() : matcher.group();
            if (!wordsOcurrencies.containsKey(tempWord)){
                wordsOcurrencies.put(tempWord, 1);
            }else {
                Integer wordOcurrenciesTemp = wordsOcurrencies.get(tempWord);
                wordsOcurrencies.replace(tempWord, wordOcurrenciesTemp, wordOcurrenciesTemp+1);
            }
        }
    }

    public Map<String, Integer> getWordsOcurrencies(boolean caseInsensitive) {
        setWordsOcurrencies("( |^)([\\w])+( |$)",caseInsensitive);
        return wordsOcurrencies;
    }

    public Map<String, Integer> getCapitalizedWordsOcurrencies() {
        setWordsOcurrencies("( |^)([A-Z])\\w+( |$)",false);
        return wordsOcurrencies;
    }

    public Map<String, Integer> getWordBiggerThenOcurrencies(int size) {
        setWordsOcurrencies("( |^)([\\w]){"+(size)+",100}( |$)",false);
        return wordsOcurrencies;
    }

    public Map<String, Integer> getWordSmallerThenOcurrencies(int size) {
        setWordsOcurrencies("( |^)([\\w]){0,"+(size)+"}( |$)",false);
        return wordsOcurrencies;
    }

    public Map<String, Integer> getWordAtSizeOcurrencies(int size) {
        setWordsOcurrencies("( |^)([\\w]){"+(size)+"}( |$)",false);
        return wordsOcurrencies;
    }

    public Map<String, Integer> getWordAtPatternOcurrencies(String pattern) {
        setWordsOcurrencies(pattern,false);
        return wordsOcurrencies;
    }
}
