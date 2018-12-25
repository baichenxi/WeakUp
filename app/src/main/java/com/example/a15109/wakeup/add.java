package com.example.a15109.wakeup;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

public class add extends AppCompatActivity {
    private Button button,button3,button4;
    private String[] data = { "账号" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                add.this, android.R.layout.simple_list_item_1, data);


        button3 = (Button) findViewById(R.id.cancel_btn1);
        button4 = (Button) findViewById(R.id.button);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(add.this, friendlist.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(add.this,friendex .class);
                startActivity(intent);
            }
        });

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_jianli:
                button = (Button) findViewById(R.id.save_btn);
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
                                        Toast.makeText(add.this, "failed", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }

                            @Override
                            public void onResponse(Call call, final Response response) throws IOException {
                                final String s = response.body().string();
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(add.this, "success", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }
                        });
                    }
                });

                break;


            default:
                break;
        }
    }



}