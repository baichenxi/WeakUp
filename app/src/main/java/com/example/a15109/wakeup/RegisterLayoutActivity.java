package com.example.a15109.wakeup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisterLayoutActivity extends Activity {
    private int ima_type=0;
    private int touch_times=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        Button reg_but=(Button)findViewById(R.id.Reg_but);
        reg_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"注册成功",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        final ImageView reg_ima= (ImageView) findViewById(R.id.Reg_ima);
        reg_ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ima_type==0) {
                    reg_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_2));
                    ima_type=1;
                }
                else if (touch_times == 4 ) {
                    reg_ima.setImageDrawable(getResources().getDrawable(R.mipmap.menhera_3));
                    touch_times=0;
                    ima_type=0;
                }
                    else touch_times++;


            }
        });

    }
}
