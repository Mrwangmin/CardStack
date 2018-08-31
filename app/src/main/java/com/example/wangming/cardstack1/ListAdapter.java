package com.example.wangming.cardstack1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wangming on 2018/8/31.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    public ArrayList<Lesson> lessons = new ArrayList<>();

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView lessonName;
        TextView lessonTeacher;
        TextView lessonTime;
        TextView lessonPlace;

        public ViewHolder(View view){
            super(view);
            lessonName = view.findViewById(R.id.lesson_name);
            lessonTeacher = view.findViewById(R.id.lesson_teacher);
            lessonTime = view.findViewById(R.id.lesson_time);
            lessonPlace = view.findViewById(R.id.lesson_place);
        }
    }

    public ListAdapter(ArrayList<Lesson> lessons){
            this.lessons.addAll(lessons);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lesson_iten,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Lesson lesson = lessons.get(position);
        holder.lessonName.setText(lesson.getLessonName());
        holder.lessonPlace.setText(lesson.getLessonPlace());
        holder.lessonTime.setText(lesson.getLessonTime());
        holder.lessonTeacher.setText(lesson.getLessonTeacher());

    }

    @Override
    public int getItemCount(){
        return lessons.size();
    }

}
