package com.example.languages_learning_app.Models;

public class ContentLessonItemMan {
    private Integer idlesson;

    private String namelesson;

    private String contentlesson;

    private Integer lang;   // id of language

    private String manageruser; // username of lesson's manager

    private Integer activestate;

    public Integer getIdlesson() {
        return idlesson;
    }

    public void setIdlesson(Integer idlesson) {
        this.idlesson = idlesson;
    }

    public String getNamelesson() {
        return namelesson;
    }

    public void setNamelesson(String namelesson) {
        this.namelesson = namelesson;
    }

    public String getContentlesson() {
        return contentlesson;
    }

    public void setContentlesson(String contentlesson) {
        this.contentlesson = contentlesson;
    }

    public Integer getLang() {
        return lang;
    }

    public void setLang(Integer lang) {
        this.lang = lang;
    }

    public String getManageruser() {
        return manageruser;
    }

    public void setManageruser(String manageruser) {
        this.manageruser = manageruser;
    }

    public Integer getActivestate() {
        return activestate;
    }

    public void setActivestate(Integer activestate) {
        this.activestate = activestate;
    }

    public ContentLessonItemMan(Integer idlesson, String namelesson, String contentlesson, Integer lang, String manageruser, Integer activestate) {
        this.idlesson = idlesson;
        this.namelesson = namelesson;
        this.contentlesson = contentlesson;
        this.lang = lang;
        this.manageruser = manageruser;
        this.activestate = activestate;
    }

    public ContentLessonItemMan() {
    }
}
