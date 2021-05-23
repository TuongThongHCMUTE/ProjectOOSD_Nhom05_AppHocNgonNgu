package com.example.languages_learning_app.Models;

public class ItemLessonMan {
    private Integer idlesson;

    private String namelesson;

    public Integer getIdlesson() {
        return idlesson;
    }

    public void setIdlesson(Integer idlesson) {
        this.idlesson = idlesson;
    }

    public void setNamelesson(String namelesson) {
        this.namelesson = namelesson;
    }

    public String getNamelesson() {
        return namelesson;
    }

    public ItemLessonMan(Integer idlesson, String namelesson) {
        this.idlesson = idlesson;
        this.namelesson = namelesson;
    }

    public ItemLessonMan() {
    }
}
