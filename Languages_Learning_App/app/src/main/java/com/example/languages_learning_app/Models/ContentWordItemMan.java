package com.example.languages_learning_app.Models;

public class ContentWordItemMan {
    private Integer level;
    private Integer vid;
    private String vword;
    private String vspelling;
    private String vmean;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVword() {
        return vword;
    }

    public void setVword(String vword) {
        this.vword = vword;
    }

    public String getVspelling() {
        return vspelling;
    }

    public void setVspelling(String vspelling) {
        this.vspelling = vspelling;
    }

    public String getVmean() {
        return vmean;
    }

    public void setVmean(String vmean) {
        this.vmean = vmean;
    }

    public ContentWordItemMan(Integer level, Integer vid, String vword, String vspelling, String vmean) {
        this.level = level;
        this.vid = vid;
        this.vword = vword;
        this.vspelling = vspelling;
        this.vmean = vmean;
    }

    public ContentWordItemMan() {
    }
}
