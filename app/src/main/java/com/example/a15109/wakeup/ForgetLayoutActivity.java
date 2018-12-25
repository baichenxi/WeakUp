package com.example.a15109.wakeup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ForgetLayoutActivity extends AppCompatActivity {
    private int ima_type=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fog_layout);
        Button fog_but1=(Button) findViewById(R.id.fog_but1);
        fog_but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"验证邮件已发送",Toast.LENGTH_SHORT).show();
            }
        });
        Button fog_but2=(Button) findViewById(R.id.fog_but2);
        fog_but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"密码修改成功",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        final ImageView fog_ima= (ImageView) findViewById(R.id.fog_ima);
        fog_ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ima_type==0){
                    fog_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_25));
                    ima_type=1;
                }else  if (ima_type==1){
                    fog_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_37));
                    ima_type=2;
                }else  if (ima_type==2){
                    fog_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_55));
                    ima_type=3;
                }
            }
        });


    }
}
