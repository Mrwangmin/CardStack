package com.example.wangming.cardstack1;

/**
 * Created by wangming on 2018/8/30.
 */

public class Lesson {
    String lessonName;
    String lessonTeacher;
    String lessonTime;
    String lessonPlace;

    public Lesson( String lessonName, String lessonTeacher, String lessonTime, String lessonPlace){
        this.lessonPlace =lessonPlace;
        this.lessonTime = lessonTime;
        this.lessonTeacher = lessonTeacher;
        this.lessonName = lessonName;
    }

    public void setLessonName(String lessonName){
        this.lessonName = lessonName;
    }

    public void setLessonTeacher(String lessonTeacher){
        this.lessonTeacher = lessonTeacher;
    }

    public void setLessonTime(String lessonTime){
        this.lessonTime = lessonTime;
    }

    public void setLessonPlace(String lessonPlace){
        this.lessonPlace = lessonPlace;
    }

    public String getLessonName(){
        return lessonName;
    }

    public String getLessonTeacher(){
        return lessonTeacher;
    }

    public String getLessonTime(){
        return lessonTime;
    }

    public String getLessonPlace(){
        return lessonPlace;
    }
}
