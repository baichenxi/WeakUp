package com.example.a15109.wakeup;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;

import okhttp3.Call;
import okhttp3.Response;

public class ClockEditing extends Activity implements OnClickListener {
    private TextView tvShowDialog, tvShowTimeDialog, text_chongfu, text_bq, text_ls, text_gl;
    private Calendar cal;
    private Spinner spinner_chongfu, spinner_bq, spinner_ls, spinner_gl;
    private List<String> list_chongfu, list_bq, list_ls, list_gl;
    private Button jianli,shanchu;
    private ImageButton fanhui;
    private ArrayAdapter<String> adapter_chongfu, adapter_bq, adapter_ls, adapter_gl;
    private int year, month, day, houre, minute;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.clockedit);

        button = (Button) findViewById(R.id.button_jianli);
        //获取当前日期
        getDate();
        tvShowDialog = (TextView) findViewById(R.id.tvShowDialog);
        tvShowDialog.setOnClickListener(this);
        tvShowTimeDialog = (TextView) findViewById(R.id.tvShowTimeDialog);
        tvShowTimeDialog.setOnClickListener(this);
        jianli=(Button)findViewById(R.id.button_jianli);
        jianli.setOnClickListener(this);
        fanhui=(ImageButton)findViewById(R.id.imageButton_fanhui);
        fanhui.setOnClickListener(this);
        shanchu=(Button)findViewById(R.id.button_shanchu);
        shanchu.setOnClickListener(this);



        //下拉菜单
        //1. 重复
        text_chongfu = (TextView) findViewById(R.id.text_chongfu);
        text_chongfu.setText("重复：");
        spinner_chongfu = (Spinner) findViewById(R.id.spinner_chongfu);
        list_chongfu = new ArrayList<>();
        list_chongfu.add("每天");
        list_chongfu.add("周一至周五");
        list_chongfu.add("周六");
        list_chongfu.add("周日");
        adapter_chongfu = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_chongfu);
        adapter_chongfu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_chongfu.setAdapter(adapter_chongfu);
        //2. 标签
        text_bq = (TextView) findViewById(R.id.text_bq);
        text_bq.setText("标签：");
        spinner_bq = (Spinner) findViewById(R.id.spinner_bq);
        list_bq = new ArrayList<>();
        list_bq.add("早起");
        list_bq.add("睡觉");
        list_bq.add("晨跑");
        list_bq.add("站立会议");

        adapter_bq = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_bq);
        adapter_bq.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_bq.setAdapter(adapter_bq);

        //3. 铃声
        text_ls = (TextView) findViewById(R.id.text_ls);
        text_ls.setText("铃声：");
        spinner_ls = (Spinner) findViewById(R.id.spinner_ls);
        list_ls = new ArrayList<>();
        list_ls.add("默认");
        list_ls.add("燃烧我的卡路里");
        list_ls.add("天分");
        list_ls.add("好久不见");
        list_ls.add("江南");
        list_ls.add("天空之城");

        adapter_ls = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_ls);
        adapter_ls.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ls.setAdapter(adapter_ls);

        //4. 关联设置
        text_gl = (TextView) findViewById(R.id.text_gl);
        text_gl.setText("关联设置:");
        spinner_gl = (Spinner) findViewById(R.id.spinner_gl);
        list_gl = new ArrayList<>();
        list_gl.add("王二狗");
        list_gl.add("软工团队");
        list_gl.add("二柱子");
        list_gl.add("票圈");
        adapter_gl = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_gl);
        adapter_gl.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_gl.setAdapter(adapter_gl);
    }


    //获取当前日期
    private void getDate() {
        cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);       //获取年月日时分秒
        Log.i("wxy", "year" + year);
        month = cal.get(Calendar.MONTH);   //获取到的月份是从0开始计数
        day = cal.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvShowDialog: //设置日期
                text_chongfu.setText("qwe：");
                OnDateSetListener listener = new OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker arg0, int year, int month, int day) {
                        tvShowDialog.setText(year + "-" + (++month) + "-" + day);      //将选择的日期显示到TextView中,因为之前获取month直接使用，所以不需要+1，这个地方需要显示，所以+1
                    }
                };
                DatePickerDialog dialog = new DatePickerDialog(ClockEditing.this, DatePickerDialog.THEME_HOLO_LIGHT, listener, year, month, day);//主题在这里！后边三个参数为显示dialog时默认的日期，月份从0开始，0-11对应1-12个月
                dialog.show();
                break;
            case R.id.tvShowTimeDialog: //设置时间（时分）
                new TimePickerDialog(this, AlertDialog.THEME_HOLO_LIGHT, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        houre = hourOfDay;
                        ClockEditing.this.minute = minute;
                        if (ClockEditing.this.minute < 10) {
                            tvShowTimeDialog.setText(houre + ":" + "0" + ClockEditing.this.minute);
                        } else {
                            tvShowTimeDialog.setText(houre + ":" + ClockEditing.this.minute);
                        }
                    }
                }, 0, 0, true).show();
                break;
            case R.id.imageButton_fanhui:text_chongfu.setText("asd：");
                // 点击返回按钮
                break;
            case R.id.button_jianli:
                text_chongfu.setText("asd：");
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        HttpUtil.getRequestToken("http://192.168.191.1:8080/ServletTest/SetClock?username=111&time=7777", new okhttp3.Callback() {
                            @Override
                            public void onFailure(Call call, final IOException e) {
                                e.printStackTrace();
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(ClockEditing.this, "failed", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }

                            @Override
                            public void onResponse(Call call, final Response response) throws IOException {
                                final String s = response.body().string();
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(ClockEditing.this, "success", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }
                        });
                    }
                });

                break;

            case R.id.button_shanchu:text_chongfu.setText("asd：");
                //点击删除闹钟按钮
                break;
            default:
                break;
        }
    }

}
