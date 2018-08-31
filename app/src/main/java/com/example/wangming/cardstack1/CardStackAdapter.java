package com.example.wangming.cardstack1;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.loopeer.cardstack.CardStackView;
import com.loopeer.cardstack.StackAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LZL on 2017/7/16.
 */

public class CardStackAdapter extends StackAdapter<Integer> {
    ArrayList<ArrayList> list = new ArrayList<>();
    public CardStackAdapter(Context context)
    {
        super(context);
    }


    public void updateData(List data,ArrayList<ArrayList> list) {
        this.list.addAll(list);
        updateData(data);
    }

    @Override
    protected CardStackView.ViewHolder onCreateView(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        CardViewHolder holder = new CardViewHolder(view);
        System.out.println("onCreateView");
        return holder;
    }

    @Override
    public void bindView(Integer data, int position, CardStackView.ViewHolder holder) {
        if(holder instanceof CardViewHolder)
        {
            CardViewHolder cardHolder = (CardViewHolder)holder;
            cardHolder.onBind(data,position,list);
        }
    }


    @Override
    public int getItemCount() {
        System.out.println("getItemCount");
        return super.getItemCount();
    }

    @Override
    public int getItemViewType(int position) {
        System.out.println("getItemViewType");
        return super.getItemViewType(position);
    }

    @Override
    public Integer getItem(int position) {
        System.out.println("getItem");
        return super.getItem(position);
    }

    public static class CardViewHolder extends CardStackView.ViewHolder
    {
        View root;
        FrameLayout cardTitle;
        RecyclerView listItem;
        TextView titleText;
        public CardViewHolder(View view)
        {
            super(view);
            root = view;
            cardTitle = view.findViewById(R.id.card_title);
            titleText = view.findViewById(R.id.text_list_card_title);
            listItem = view.findViewById(R.id.recycler);
        }

        public void onBind(Integer backgroundColorId,int position,ArrayList<ArrayList> list)
            {
            switch (position){
                case 0:
                    titleText.setText("星期一");
                    cardTitle.getBackground().setColorFilter(ContextCompat.getColor(getContext(), R.color.holo_blue_bright)
                        , PorterDuff.Mode.SRC_IN);break;
                case 1:
                    titleText.setText("星期二");
                    cardTitle.getBackground().setColorFilter(ContextCompat.getColor(getContext(),R.color.holo_orange_light)
                        , PorterDuff.Mode.SRC_IN);break;
                case 2:
                    titleText.setText("星期三");
                    cardTitle.getBackground().setColorFilter(ContextCompat.getColor(getContext(),R.color.holo_purple)
                        , PorterDuff.Mode.SRC_IN);break;
                case 3:
                    titleText.setText("星期四");
                    cardTitle.getBackground().setColorFilter(ContextCompat.getColor(getContext(),R.color.holo_red_light)
                        , PorterDuff.Mode.SRC_IN);break;
                case 4:
                    titleText.setText("星期五");
                    cardTitle.getBackground().setColorFilter(ContextCompat.getColor(getContext(),R.color.holo_green_dark)
                            , PorterDuff.Mode.SRC_IN);break;
            }
            ListAdapter adapter = new ListAdapter(list.get(position));
            listItem.setLayoutManager(new LinearLayoutManager(getContext()));
            listItem.setAdapter(adapter);
        }

        @Override
        public void onItemExpand(boolean b) {
            listItem.setVisibility(b ? View.VISIBLE : View.GONE);
        }
    }
}