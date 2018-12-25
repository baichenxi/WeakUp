package com.example.a15109.wakeup;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by lw on 2017/4/14.
 */

public class friendadapter extends ArrayAdapter{
    private final int resourceId;

    public friendadapter(Context context, int textViewResourceId, List<friend> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        friend friend = (friend) getItem(position); // 获取当前项的Fruit实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);//实例化一个对象



        return view;
    }
}
