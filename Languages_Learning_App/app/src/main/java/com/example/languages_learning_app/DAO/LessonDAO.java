package com.example.languages_learning_app.DAO;

import com.example.languages_learning_app.Models.ContentLessonItemMan;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class LessonDAO {
    String path;
    DatabaseReference mDatabase;
    private Integer languageid;

    public Integer getLanguageid() {
        return languageid;
    }

    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }

    private static LessonDAO instance;

    public static LessonDAO getInstance() {
        if (instance==null)
            instance = new LessonDAO();
        return instance;
    }

    public static void setInstance(LessonDAO instance) { LessonDAO.instance = instance; }

    public LessonDAO() { path = "Language_Lesson/" + languageid + "/lesson_s/"; }

    public ContentLessonItemMan getLessonValue(Integer lessonordernumber) {
        path = path + lessonordernumber;
        mDatabase = FirebaseDatabase.getInstance().getReference();

        ContentLessonItemMan clim = new ContentLessonItemMan();

        Query query = mDatabase.child(path);

        ContentLessonItemMan tmpclim = new ContentLessonItemMan();

        // Put data to tmpclim

        return tmpclim;
    }
}
