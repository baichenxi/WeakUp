package com.example.a15109.wakeup;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.text.Layout;
import android.view.View;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;
import android.util.*;
import java.util.ArrayList;
import java.util.List;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.app.AlertDialog;

import java.util.List;

class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    List<Item> list;//存放数据
    boolean isVisible;
    //private OnItemClickListener mItemClickListener;
    int pstion;
    private Context mContext;
    /*
    public interface OnItemClickListener{
        void onClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener ){
        this.mItemClickListener  = onItemClickListener; }   */

    public HomeAdapter(List<Item> list) {
        this.list = list;
        isVisible = false;
    }

    public void setListItem(Item I)
    {
        this.list.add(0,I);
    }
    @Override
    //加载item 的布局  创建ViewHolder实例
    public HomeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_home,parent,false);
        return new MyViewHolder(itemView);
    }

    //对RecyclerView子项数据进行赋值
    @Override
    public void onBindViewHolder(final HomeAdapter.MyViewHolder holder, final int position) {

        if(list.size()==0)  return;
        Item iSingle = list.get(position);
        holder.tv.setText(iSingle.getTime());
        holder.tv1.setText(iSingle.getText());      //因为是在Adapter内中定义的MyViewHolder类 故不需要初始化
        holder.swiClock.setChecked(true);

        if (iSingle.getType() == 1) {
            holder.v.setBackgroundColor(Color.GRAY);
        }
        else
        {
            holder.v.setBackgroundColor(Color.WHITE);
        }

        if (isVisible == false)
            holder.btn_del.setVisibility(View.GONE);
        else
            holder.btn_del.setVisibility(View.VISIBLE);

        holder.btn_del.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pstion = holder.getAdapterPosition();
                delete(holder.v);

                //delete(position); //没final 会报错
            }
        });


        // if(holder.btn_del.getVisibility() == View.VISIBLE)
        // {
        holder.v.setOnClickListener(new View.OnClickListener() {    //从外面判定不合理且不行
            @Override
            public void onClick(View v) {
                if(isVisible == true)           //跳转界面
                {
                    holder.tv.setText(String.valueOf(position));    //position 表示该闹钟在闹钟数组里的位置
                }
            }
        });
        // }


    }

    //返回子项个数
    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        View v;
        Switch swiClock;
        TextView tv;
        TextView tv1;
        Button btn_del;
        TextView title;
        //TextView tv2;
        public MyViewHolder(View view) {
            super(view);
            v = view.findViewById(R.id.id_item);
            tv = view.findViewById(R.id.textView1);
            tv1 = view.findViewById(R.id.textView2);
            btn_del = view.findViewById(R.id.btn_delete);
            swiClock = view.findViewById(R.id.swi_Clock);
            title = view.findViewById(R.id.textView13);
        }


    }
    public void delete(View v) {
        int position = pstion;
        //if (list.size() == 1) {
        //  showdialog();
        //   return;
        //  }

        list.remove(position);
        notifyItemRemoved(position);
        //notifyItemChanged(position);
        notifyDataSetChanged();

        Button del;
        for (position = 0; position < list.size(); position++) {
            LinearLayout ly = (LinearLayout) v;    //获取布局中任意控件对象
            del = (Button) ly.findViewById(R.id.btn_delete);
            if (del.getVisibility() != View.VISIBLE)
                del.setVisibility(View.VISIBLE);
        }
    }
    public void showdialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setTitle("提示");
        builder.setMessage("至少要有一个闹钟");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(mContext, "确定", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }
}