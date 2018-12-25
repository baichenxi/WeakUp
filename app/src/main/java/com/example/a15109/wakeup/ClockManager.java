package com.example.a15109.wakeup;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;

public class ClockManager extends Activity {

    TextView textView;
    Button button;
    Button btn_team;
    Button btn_single;
    Button btn_edit;
    Button btn_delete;
    RecyclerView mRecyclerView;
    PopupWindow mPopupWindow;
    private Button button1;
    //private HomeAdapter mAdapter;   不要像这三句一样写出不来
    //LinearLayoutManager layout；
    //Adapter adapter;
    HomeAdapter mAdapter;
    LinearLayoutManager layout;
    Switch mSwitch;
    List<Item> listMain;
    public static boolean k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clockmanager_main);


        initData();

        layout = new LinearLayoutManager(this); //要向这两句一样写
        mRecyclerView = findViewById(R.id.ry);
        mRecyclerView.setLayoutManager(layout);
        mAdapter = new HomeAdapter(listMain);
        mRecyclerView.setAdapter(mAdapter);

        /*
        mAdapter.setOnItemClickListener(new HomeAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                return;
            }
            @Override
            public void onLongClick(int position) {
                Toast.makeText(ClockManager.this,"您长按点击了"+position+"行",Toast.LENGTH_SHORT).show();
            }
        });
           */

        btn_team = findViewById(R.id.btn_team);
        btn_single = findViewById(R.id.btn_single);
        btn_edit = findViewById(R.id.btn_edit);
        btn_delete = findViewById(R.id.btn_delete);
        button = findViewById(R.id.btn_add);
        setOnClickListener();


        button1 = (Button) findViewById(R.id.btn_add);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ClockManager.this, ClockEditing.class);
                startActivity(intent);
            }
        });

    }



    protected void initData()           //导入数据库数据
    {
        listMain = new ArrayList<>();
        String time[] = {"18:00","19:00","20:00","21:00","22:00"};
        String text[] = {"开会，团队A","上课","洗澡","做作业，团队B","睡觉"};
        int type[] = {1,1,0,0,0};
        for (int i = 0;i<5; i++) {
            Item mItemSingle = new Item(time[i], text[i], type[i]);
            listMain.add(mItemSingle);
        }
    }
    public void setOnClickListener() {
        OnClick onClick = new OnClick();
        button.setOnClickListener(onClick);
    }


    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_add:
                    add(v);
                    break;
                case R.id.btn_team:
                    addTeam(v);
                    break;
                case R.id.btn_single:
                    addSingle(v);
                    break;
                case R.id.btn_edit:
                    editItem(v);
                    break;
            }

        }
    }
    private void showPopupWindow() {

        //找到布局文件
        View context = View.inflate(ClockManager.this, R.layout.selection, null);
        mPopupWindow = new PopupWindow(context, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        mPopupWindow.setFocusable(true);//可获取焦点
        mPopupWindow.setOutsideTouchable(true);//设置外部区域是否可点击
        ColorDrawable colorDrawable = new ColorDrawable(Color.TRANSPARENT);
        mPopupWindow.setBackgroundDrawable(colorDrawable);//设置透明背景
        mPopupWindow.showAsDropDown(button, 0, 0);
    }
    private void shutPopupWindow() {
        if (mPopupWindow.isShowing())
            mPopupWindow.dismiss();
    }
    public void editItem(View v) {
        int position = 0;
        if (mAdapter.isVisible == true)  //
        {
            Button del;
            for (position = 0; position < mAdapter.getItemCount(); position++) {
                View view = mRecyclerView.getChildAt(position);
                LinearLayout ly = (LinearLayout) view;    //获取布局中任意控件对象
                del = (Button) ly.findViewById(R.id.btn_delete);
                del.setVisibility(View.GONE);
            }
            mAdapter.isVisible = false;
            k = false;
        } else {
            Button del;
            for (position = 0; position < mAdapter.getItemCount(); position++) {
                View view = mRecyclerView.getChildAt(position);
                LinearLayout ly = (LinearLayout) view;    //获取布局中任意控件对象
                del = (Button) ly.findViewById(R.id.btn_delete);
                del.setVisibility(View.VISIBLE);

            }
            mAdapter.isVisible = true;
            k = true;
        }
        //mAdapter.notifyDataSetChanged();
    }

    public void addTeam(View v) {
        if (mAdapter.isVisible == true)
            editItem(v);

        Item mItemSingle = new Item("19:00", "开会，团队A", 1);
        mAdapter.setListItem(mItemSingle);
        //mAdapter.notifyItemInserted(0); //插在0位置
        if(mAdapter.getItemCount()==1)
        {
            mRecyclerView.setAdapter(mAdapter);
        }
        else
        {
            // mAdapter.notifyItemInserted(); //插在0位置
            mAdapter.notifyDataSetChanged();
            //mRecyclerView.getLayoutManager().scrollToPosition(0);
        }
        shutPopupWindow();
        return;
    }
    public void addSingle(View v) {
        if (mAdapter.isVisible == true)
            editItem(v);
        Item mItemSingle = new Item("19:00", "开会", 0);
        mAdapter.setListItem(mItemSingle);
        if(mAdapter.getItemCount()==1)
        {
            mRecyclerView.setAdapter(mAdapter);
        }
        else
        {
            // mAdapter.notifyItemInserted(); //插在0位置
            mAdapter.notifyDataSetChanged();
            //mRecyclerView.getLayoutManager().scrollToPosition(0);
            /*
            Button del;
            v = mRecyclerView.getChildAt(0);
            LinearLayout ly = (LinearLayout) v;    //获取布局中任意控件对象
            del = (Button) ly.findViewById(R.id.btn_delete);
            del.setVisibility(View.GONE);*/
        }
        shutPopupWindow();
        return;

    }
    public void add(View view) {
        //showPopupWindow();      //注释掉 写跳转函数
        //Intent intent = new Intent(ClockManager.this,TestActivity.class);
        // startActivity(intent);
        //ClockManager.this.finish();


        return;
    }



}






