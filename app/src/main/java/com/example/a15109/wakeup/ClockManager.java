package com.example.a15109.wakeup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.content.Context.*;

import java.io.IOException;

import android.widget.Toast;
import android.widget.Button;

import okhttp3.Call;
import okhttp3.Response;



public class ClockManager extends Activity {

    TextView textView;
    Button button;
    Button btn_team;
    Button btn_single;
    Button btn_edit;
    Button btn_delete;
    RecyclerView mRecyclerView;
    PopupWindow mPopupWindow;
    //private HomeAdapter mAdapter;   不要像这三句一样写出不来
    //LinearLayoutManager layout；
    //Adapter adapter;
    HomeAdapter mAdapter;
    LinearLayoutManager layout;
    Switch mSwitch;
    List<Item> listMain;
    Context context;
    public static boolean k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.clockmanager_main);


        /*
        HttpUtil.getRequestToken("http://192.168.191.1:8080/ServletTest/GetClock?username=111&teamname=aa", new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                e.printStackTrace();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(ClockManager.this, "failed", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String s = response.body().string();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(ClockManager.this, s, Toast.LENGTH_SHORT).show();
                       // Log.v("1233333",s);
                        //initData(s);
                    }
                });
            }
        });
        */

        initData();

        layout = new LinearLayoutManager(this); //要向这两句一样写
        mRecyclerView = findViewById(R.id.ry);
        mRecyclerView.setLayoutManager(layout);
        mAdapter = new HomeAdapter(listMain);
        mRecyclerView.addItemDecoration(new RecycleViewDivider(ClockManager.this, LinearLayoutManager.VERTICAL));
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

    }



    protected void initData()           //导入数据库数据
    {
        listMain = new ArrayList<>();
        String time[] = new String[100];
        String text[] = new String[100];
        int type[] = new int[100];


        JK j = new JK();
        j.getClock("");
        String[] clock = j.clocks;
        for(int i=0;i<clock.length;i++)
        {
            //Log.v(String.valueOf(i),clock[i].getClock());
            time[i] = clock[i];
            text[i] = " ";
            type[i] = 0;
        }

        for(int i=0;i<clock.length;i++)
        {
            Item mItemSingle = new Item(time[i], " ", 0);
            listMain.add(mItemSingle);
        }


/*
         StoreClock.time[0] = "22:00";
         StoreClock.text[0] = " ";
         StoreClock.type[0] = 0;
         StoreClock.len ++;
         for(int i=0;i<StoreClock.len;i++)
         {
             time[i] = StoreClock.time[i];
             text[i] = StoreClock.text[i];
             type[i] = StoreClock.type[i];
         }

        for (int i = 0;i<StoreClock.len; i++) {
            Item mItemSingle = new Item(time[i], text[i], type[i]);
            listMain.add(mItemSingle);
        }
*/

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
                if(ly!=null)
                {
                    del = ly.findViewById(R.id.btn_delete);
                    del.setVisibility(View.GONE);
                }
            }
            mAdapter.isVisible = false;
            k = false;
        } else {
            Button del;

            for (position = 0; position < mAdapter.getItemCount(); position++) {

                View view = mRecyclerView.getChildAt(position);
                LinearLayout ly = (LinearLayout) view;    //获取布局中任意控件对象
                if(ly!=null)
                {
                    del = ly.findViewById(R.id.btn_delete);
                    del.setVisibility(View.VISIBLE);
                }

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
        /*
        Intent intent = new Intent(ClockManager.this,TestActivity.class);
        startActivity(intent);
        ClockManager.this.finish();
        */

        return;
    }



}





