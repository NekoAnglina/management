package com.example.viewpager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
//专门用于适配viewpager
//实质上是一种对RecyclerView的封装
public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder> {
    private List<String> titles = new ArrayList<>();
    private List<Integer> colors = new ArrayList<>();

    public ViewPagerAdapter(){
        titles.add("hello1");
        titles.add("hello2");
        titles.add("hello3");
        titles.add("hello4");
        titles.add("hello5");
        titles.add("hello6");
        titles.add("hello7");
        titles.add("hello8");
        titles.add("hello9");
        titles.add("hello0");


        colors.add(R.color.white);
        colors.add(R.color.black);
        colors.add(R.color.red);
        colors.add(R.color.teal_200);
        colors.add(R.color.teal_700);
        colors.add(R.color.purple_200);
        colors.add(R.color.white);
        colors.add(R.color.white);
        colors.add(R.color.white);
        colors.add(R.color.white);



    }
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewPagerViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        return new ViewPagerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_page,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewPagerAdapter.ViewPagerViewHolder holder, int position) {
        holder.mTv.setText(titles.get(position));
        holder.mContainer.setBackgroundResource(colors.get(position));
        //给View绑定东西
    }


    @Override
    public int getItemCount() {
        return 10;
        //展示的窗口的数量
    }

    class ViewPagerViewHolder extends RecyclerView.ViewHolder{
//解析item_page
        TextView mTv;
        RelativeLayout mContainer;
        public ViewPagerViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            mContainer = itemView.findViewById(R.id.container);
            mTv = itemView.findViewById(R.id.tvTitle);
        }
    }


}

