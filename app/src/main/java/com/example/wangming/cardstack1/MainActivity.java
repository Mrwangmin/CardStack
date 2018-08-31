package com.example.wangming.cardstack1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loopeer.cardstack.AllMoveDownAnimatorAdapter;
import com.loopeer.cardstack.CardStackView;
import com.loopeer.cardstack.UpDownAnimatorAdapter;
import com.loopeer.cardstack.UpDownStackAnimatorAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
public class MainActivity extends AppCompatActivity implements CardStackView.ItemExpendListener{
    private CardStackView mCardStack;



    Integer[] color = {
            R.color.holo_green_dark,
            R.color.holo_blue_bright,
            R.color.holo_orange_light,
            R.color.holo_purple,
            R.color.holo_red_light
    };
    String[] name = {"数据结构","计算机网络","编译原理","C语言","算法设计","FPGA编程"};
    String[] scores = {"77","87","65","98","74","80"};


    ArrayList<Lesson> monday = new ArrayList<>();
    ArrayList<Lesson> tuseday = new ArrayList<>();
    ArrayList<Lesson> wednesday = new ArrayList<>();
    ArrayList<Lesson> thursday = new ArrayList<>();
    ArrayList<Lesson> friday = new ArrayList<>();

    ArrayList<ArrayList> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLesson();
    }

    @Override
    public void onItemExpend(boolean expend) {

    }

    void initLesson(){

        Lesson changwei1 = new Lesson("常微分方程","李浩光","8:00 - 9:40","15-511");
        Lesson dawu1 = new Lesson("大学物理","邱学军","10:00 - 11:40","11-311");
        Lesson shufen1 = new Lesson("数学分析","夏永波","14:10 - 15:50","11-411");
        Lesson xinghsi1 = new Lesson("形式与政策","董永烨","6:40 - 9:10","1-311");

        Lesson shufen2 = new Lesson("数学分析","夏永波","8:00 - 9:40","11-411");;
        Lesson english2 = new Lesson("英语3","陈丽珠","10:00 - 11:40","10-306");
        Lesson java2 = new Lesson("JAVA语言程序设计","谢茂涛","14:10 - 15:50","11-311");
        Lesson matlab2 = new Lesson("数学软件","佘炜","6:40 - 9:10","16-211");

        Lesson changwei3 = new Lesson("常微分方程","李浩光","8:00 - 9:40","15-511");
        Lesson dawu3 = new Lesson("大学物理","邱学军","10:00 - 11:40","11-311");
        Lesson history3 = new Lesson("中国近代史","詹全友","14:10 - 16:40","15-503");

        Lesson shufen4 = new Lesson("数学分析","夏永波","8:00 - 9:40","11-411");;
        Lesson english4 = new Lesson("英语3","陈丽珠","10:00 - 11:40","10-306");
        Lesson java4 = new Lesson("JAVA语言程序设计","谢茂涛","14:10 - 15:50","11-311");
        Lesson dawu4 = new Lesson("大学物理","邱学军","10:00 - 11:40","11-311");
        Lesson history4 = new Lesson("中国近代史","詹全友","14:10 - 16:40","15-503");

        Lesson sanda5 = new Lesson("散打","崔书豪","10:00 - 11:40","体育馆");
        Lesson shufen5 = new Lesson("数学分析","夏永波","14:10 - 15:50","11-411");

        monday.add(changwei1);
        monday.add(dawu1);
        monday.add(shufen1);
        monday.add(xinghsi1);
        tuseday.add(shufen2);
        tuseday.add(english2);
        tuseday.add(java2);
        tuseday.add(matlab2);
        wednesday.add(changwei3);
        wednesday.add(dawu3);
        wednesday.add(history3);
        thursday.add(shufen4);
        thursday.add(english4);
        thursday.add(java4);
        thursday.add(dawu4);
        thursday.add(history4);
        friday.add(sanda5);
        friday.add(shufen5);

        list.add(monday);
        list.add(tuseday);
        list.add(wednesday);
        list.add(thursday);
        list.add(friday);

        mCardStack = findViewById(R.id.cardStackView);
        CardStackAdapter adapter = new CardStackAdapter(this);
        mCardStack.setAdapter(adapter);

        mCardStack.setItemExpendListener(this);
        adapter.updateData(Arrays.asList(color),list);
//        mCardStack.setAnimatorAdapter(new AllMoveDownAnimatorAdapter(mCardStack));
//        mCardStack.setAnimatorAdapter(new UpDownAnimatorAdapter(mCardStack));
        mCardStack.setAnimatorAdapter(new UpDownStackAnimatorAdapter(mCardStack));
    }
}