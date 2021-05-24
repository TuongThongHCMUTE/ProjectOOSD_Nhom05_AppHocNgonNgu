package com.example.languages_learning_app.Models;

public class ItemWordMan {
    private String word;

    private String mean;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public ItemWordMan(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }

    public ItemWordMan() {
    }
}
