package com.example.a15109.wakeup;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private int ima_type=0;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);


        button = (Button) findViewById(R.id.Log_but);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyPlan.class);
                startActivity(intent);
            }
        });



        TextView log_reg = (TextView) findViewById(R.id.Log_reg);
        log_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"CLICK THE register",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),RegisterLayoutActivity.class);
                startActivity(intent);


            }
        });
        TextView log_fog = (TextView) findViewById(R.id.Log_fog);
        log_fog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"CLICK THE forget",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),ForgetLayoutActivity.class);
                startActivity(intent);
            }
        });
        final ImageView log_ima = (ImageView) findViewById(R.id.Log_ima);
        log_ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ima_type==0) {
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_101));
                    ima_type=1;
                }else if (ima_type==1){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_103));
                    ima_type=2;
                }else if (ima_type==2){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_87));
                    ima_type=3;
                }else if (ima_type==3){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_78));
                    ima_type=4;
                } else if (ima_type==4){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_96));
                    ima_type=5;
                }else if (ima_type==5){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_63));
                    ima_type=6;
                }else if (ima_type==6){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_51));
                    ima_type=7;
                }else if (ima_type==7){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_50));
                    ima_type=8;
                }else if (ima_type==8){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_49));
                    ima_type=9;
                }else if (ima_type==9){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_29));
                    ima_type=10;
                }else if (ima_type==10){
                    log_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_11));
                    ima_type=11;
                }
            }
        });



    }
}
