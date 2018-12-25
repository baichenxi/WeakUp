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
import android.widget.TextView;
import android.widget.Toast;

public class MyPlan extends Activity {

    private TextView mTextMessage;
    Button[] buttons;
    String[] day;
    int year=2018;
    int month=12;
    int BeforeDayButton = 6;



    int[] jihua_number;
    int[] jihua_year;
    int[] jihua_month;
    int[] jihua_day;
    String[] jihua_type;
    String[] jihua_content;

    String[] buttons_plan_geren;
    String[] buttons_plan_tuandui;

    /*private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };*/
    private Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_plan);


        button1 = (Button) findViewById(R.id.left2);
        button2 = (Button) findViewById(R.id.right2);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyPlan.this, ClockManager.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MyPlan.this, friendlist.class);
                startActivity(intent);
            }
        });




        Button ButtonAdd = (Button)findViewById(R.id.button);
        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




        buttons = new Button[43];
        buttons_plan_geren = new String[43];
        buttons_plan_tuandui = new String[43];

        jihua_number = new int[100];
        jihua_year = new int[100];
        jihua_month = new int[100];
        jihua_day = new int[100];
        jihua_type = new String[100];
        jihua_content = new String[100];

        day = new String[32];


        buttons[1] = (Button)findViewById(R.id.button11);
        buttons[2] = (Button)findViewById(R.id.button12);
        buttons[3] = (Button)findViewById(R.id.button13);
        buttons[4] = (Button)findViewById(R.id.button14);
        buttons[5] = (Button)findViewById(R.id.button15);
        buttons[6] = (Button)findViewById(R.id.button16);
        buttons[7] = (Button)findViewById(R.id.button17);
        buttons[8] = (Button)findViewById(R.id.button21);
        buttons[9] = (Button)findViewById(R.id.button22);
        buttons[10] = (Button)findViewById(R.id.button23);
        buttons[11] = (Button)findViewById(R.id.button24);
        buttons[12] = (Button)findViewById(R.id.button25);
        buttons[13] = (Button)findViewById(R.id.button26);
        buttons[14] = (Button)findViewById(R.id.button27);
        buttons[15] = (Button)findViewById(R.id.button31);
        buttons[16] = (Button)findViewById(R.id.button32);
        buttons[17] = (Button)findViewById(R.id.button33);
        buttons[18] = (Button)findViewById(R.id.button34);
        buttons[19] = (Button)findViewById(R.id.button35);
        buttons[20] = (Button)findViewById(R.id.button36);
        buttons[21] = (Button)findViewById(R.id.button37);
        buttons[22] = (Button)findViewById(R.id.button41);
        buttons[23] = (Button)findViewById(R.id.button42);
        buttons[24] = (Button)findViewById(R.id.button43);
        buttons[25] = (Button)findViewById(R.id.button44);
        buttons[26] = (Button)findViewById(R.id.button45);
        buttons[27] = (Button)findViewById(R.id.button46);
        buttons[28] = (Button)findViewById(R.id.button47);
        buttons[29] = (Button)findViewById(R.id.button51);
        buttons[30] = (Button)findViewById(R.id.button52);
        buttons[31] = (Button)findViewById(R.id.button53);
        buttons[32] = (Button)findViewById(R.id.button54);
        buttons[33] = (Button)findViewById(R.id.button55);
        buttons[34] = (Button)findViewById(R.id.button56);
        buttons[35] = (Button)findViewById(R.id.button57);
        buttons[36] = (Button)findViewById(R.id.button61);
        buttons[37] = (Button)findViewById(R.id.button62);
        buttons[38] = (Button)findViewById(R.id.button63);
        buttons[39] = (Button)findViewById(R.id.button64);
        buttons[40] = (Button)findViewById(R.id.button65);
        buttons[41] = (Button)findViewById(R.id.button66);
        buttons[42] = (Button)findViewById(R.id.button67);





        //测试用.数据
        jihua_number[1]=1;
        jihua_year[1]=2018;
        jihua_month[1]=12;
        jihua_day[1]=24;
        jihua_type[1]="个人计划";
        jihua_content[1]="概率论作业";

        jihua_number[2]=1;
        jihua_year[2]=2018;
        jihua_month[2]=12;
        jihua_day[2]=26;
        jihua_type[2]="团队计划";
        jihua_content[2]="软件工程博客";

        jihua_number[3]=1;
        jihua_year[3]=2018;
        jihua_month[3]=12;
        jihua_day[3]=28;
        jihua_type[3]="个人计划";
        jihua_content[3]="系统结构作业";

        jihua_number[4]=1;
        jihua_year[4]=2019;
        jihua_month[4]=1;
        jihua_day[4]=1;
        jihua_type[4]="个人计划";
        jihua_content[4]="交水电费";

        jihua_number[5]=1;
        jihua_year[5]=2018;
        jihua_month[5]=12;
        jihua_day[5]=29;
        jihua_type[5]="个人计划";
        jihua_content[5]="找朋友";

        jihua_number[6]=1;
        jihua_year[6]=2018;
        jihua_month[6]=12;
        jihua_day[6]=22;
        jihua_type[6]="团队计划";
        jihua_content[6]="Beta演示";

        jihua_number[7]=1;
        jihua_year[7]=2019;
        jihua_month[7]=1;
        jihua_day[7]=5;
        jihua_type[7]="团队计划";
        jihua_content[7]="开会";

        jihua_number[8]=1;
        jihua_year[8]=2019;
        jihua_month[8]=1;
        jihua_day[8]=13;
        jihua_type[8]="团队计划";
        jihua_content[8]="开会";

        jihua_number[9]=1;
        jihua_year[9]=2019;
        jihua_month[9]=2;
        jihua_day[9]=18;
        jihua_type[9]="个人计划";
        jihua_content[9]="送礼物";



        //测试用.初始化
        for(int i=1;i<43;i++)
        {
            buttons[i].setBackgroundColor(Color.rgb(250,250,250));
            buttons[i].setTextColor(Color.rgb(0,0,0));
            buttons_plan_geren[i] = "";
            buttons_plan_tuandui[i] = "";
        }




        //测试用.获取计划

        for(int i=0;i<100;i++)
        {
            if (jihua_number[i] == 1)
            {
                if (jihua_year[i] == 2018 && jihua_month[i] == 12)
                {
                    if (jihua_type[i] == "个人计划")
                    {
                        buttons[BeforeDayButton + jihua_day[i]].setTextColor(Color.rgb(255, 0, 0));
                        buttons_plan_geren[BeforeDayButton + jihua_day[i]] += jihua_content[i]+";";
                    }
                    else if (jihua_type[i] == "团队计划")
                    {
                        buttons[BeforeDayButton + jihua_day[i]].setBackgroundResource(R.drawable.round);
                        buttons_plan_tuandui[BeforeDayButton + jihua_day[i]] += jihua_content[i]+";";
                    }
                }
            }
        }


        day[0]="";
        day[1]="1";
        day[2]="2";
        day[3]="3";
        day[4]="4";
        day[5]="5";
        day[6]="6";
        day[7]="7";
        day[8]="8";
        day[9]="9";
        day[10]="10";
        day[11]="11";
        day[12]="12";
        day[13]="13";
        day[14]="14";
        day[15]="15";
        day[16]="16";
        day[17]="17";
        day[18]="18";
        day[19]="19";
        day[20]="20";
        day[21]="21";
        day[22]="22";
        day[23]="23";
        day[24]="24";
        day[25]="25";
        day[26]="26";
        day[27]="27";
        day[28]="28";
        day[29]="29";
        day[30]="30";
        day[31]="31";


        /*buttons[14].setTextColor(Color.rgb(255,0,0));    测试用
        buttons[14].setBackgroundResource(R.drawable.round);
        buttons[18].setBackgroundColor(Color.rgb(250,250,250));

        if(buttons[14].length()==0)buttons[14].setText("41");
        if(buttons[14].length()!=0)buttons[14].setText("");
        if(buttons[14].length()==0)buttons[1].setText("41");*/


        final TextView TextDate = (TextView)findViewById(R.id.Date);
        Button buttonleft = (Button)findViewById(R.id.left);
        Button buttonright = (Button)findViewById(R.id.right);

        buttonright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ThisMonthDay;
                month=month+1;
                if(month>12)
                {
                    month=month-12;
                    year=year+1;
                }
                TextDate.setText(year+"-"+month);
                if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)ThisMonthDay=31;
                else if(month==4||month==6||month==9||month==11)ThisMonthDay=30;
                else if((year%400==0)||(year%4==0&&year%100!=0))ThisMonthDay=29;
                else ThisMonthDay=28;

                for(int i=1;i<43;i++)
                {
                    buttons[i].setBackgroundColor(Color.rgb(250,250,250));
                    buttons[i].setTextColor(Color.rgb(0,0,0));
                    buttons_plan_geren[i] = "";
                    buttons_plan_tuandui[i] = "";
                }

                for(int i=29;i<43;i++)
                {
                    if(buttons[i].length()==0)
                    {
                        BeforeDayButton = (i-1)%7;
                        for(int k=1;k<i;k++)
                        {
                            buttons[k].setText(day[0]);
                        }
                        i=i%7;
                        if(i==0)i=7;
                        for(int j=i;j<ThisMonthDay+i;j++)
                        {
                            buttons[j].setText(day[j-i+1]);
                        }
                        break;
                    }
                }

                for(int i=0;i<100;i++)
                {
                    if (jihua_number[i] == 1)
                    {
                        if (jihua_year[i] == year && jihua_month[i] == month)
                        {
                            if (jihua_type[i] == "个人计划")
                            {
                                buttons[BeforeDayButton + jihua_day[i]].setTextColor(Color.rgb(255, 0, 0));
                                buttons_plan_geren[BeforeDayButton + jihua_day[i]] += jihua_content[i]+";";
                            }
                            else if (jihua_type[i] == "团队计划")
                            {
                                buttons[BeforeDayButton + jihua_day[i]].setBackgroundResource(R.drawable.round);
                                buttons_plan_tuandui[BeforeDayButton + jihua_day[i]] += jihua_content[i]+";";
                            }
                        }
                    }
                }

            }
        });


        buttonleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ThisMonthDay;
                month=month-1;
                if(month<1)
                {
                    month=month+12;
                    year=year-1;
                }
                TextDate.setText(year+"-"+month);
                if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)ThisMonthDay=31;
                else if(month==4||month==6||month==9||month==11)ThisMonthDay=30;
                else if((year%400==0)||(year%4==0&&year%100!=0))ThisMonthDay=29;
                else ThisMonthDay=28;

                for(int i=1;i<43;i++)
                {
                    buttons[i].setBackgroundColor(Color.rgb(250,250,250));
                    buttons[i].setTextColor(Color.rgb(0,0,0));
                    buttons_plan_geren[i] = "";
                    buttons_plan_tuandui[i] = "";
                }

                for(int i=29;i<43;i++)
                {
                    if(buttons[i].length()==0)
                    {
                        for(int k=1;k<i;k++)
                        {
                            if(buttons[k].length()!=0)
                            {
                                for(int j=k;j<i;j++)
                                {
                                    buttons[j].setText(day[0]);
                                }
                                k=ThisMonthDay-(k-1);
                                k=k%7;
                                if(k==0)k=7;
                                k=8-k;
                                BeforeDayButton = k-1;
                                for(int t=k;t<k+ThisMonthDay;t++)
                                {
                                    buttons[t].setText(day[t-k+1]);
                                }
                                break;
                            }
                        }
                        break;
                    }
                }

                for(int i=0;i<100;i++)
                {
                    if (jihua_number[i] == 1)
                    {
                        if (jihua_year[i] == year && jihua_month[i] == month)
                        {
                            if (jihua_type[i] == "个人计划")
                            {
                                buttons[BeforeDayButton + jihua_day[i]].setTextColor(Color.rgb(255, 0, 0));
                                buttons_plan_geren[BeforeDayButton + jihua_day[i]] += jihua_content[i]+";";
                            }
                            else if (jihua_type[i] == "团队计划")
                            {
                                buttons[BeforeDayButton + jihua_day[i]].setBackgroundResource(R.drawable.round);
                                buttons_plan_tuandui[BeforeDayButton + jihua_day[i]] += jihua_content[i]+";";
                            }
                        }
                    }
                }

            }
        });


        //测试用.点击显示计划
        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[1]!=""&&buttons_plan_tuandui[1]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[1]+'\n'+"团队计划:"+buttons_plan_tuandui[1],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[1]!=""&&buttons_plan_tuandui[1]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[1],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[1]==""&&buttons_plan_tuandui[1]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[1],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[2]!=""&&buttons_plan_tuandui[2]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[2]+'\n'+"团队计划:"+buttons_plan_tuandui[2],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[2]!=""&&buttons_plan_tuandui[2]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[2],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[2]==""&&buttons_plan_tuandui[2]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[2],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[3]!=""&&buttons_plan_tuandui[3]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[3]+'\n'+"团队计划:"+buttons_plan_tuandui[3],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[3]!=""&&buttons_plan_tuandui[3]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[3],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[3]==""&&buttons_plan_tuandui[3]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[3],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[4]!=""&&buttons_plan_tuandui[4]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[4]+'\n'+"团队计划:"+buttons_plan_tuandui[4],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[4]!=""&&buttons_plan_tuandui[4]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[4],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[4]==""&&buttons_plan_tuandui[4]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[4],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[5]!=""&&buttons_plan_tuandui[5]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[5]+'\n'+"团队计划:"+buttons_plan_tuandui[5],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[5]!=""&&buttons_plan_tuandui[5]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[5],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[5]==""&&buttons_plan_tuandui[5]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[5],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[6]!=""&&buttons_plan_tuandui[6]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[6]+'\n'+"团队计划:"+buttons_plan_tuandui[6],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[6]!=""&&buttons_plan_tuandui[6]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[6],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[6]==""&&buttons_plan_tuandui[6]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[6],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[7]!=""&&buttons_plan_tuandui[7]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[7]+'\n'+"团队计划:"+buttons_plan_tuandui[7],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[7]!=""&&buttons_plan_tuandui[7]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[7],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[7]==""&&buttons_plan_tuandui[7]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[7],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[8]!=""&&buttons_plan_tuandui[8]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[8]+'\n'+"团队计划:"+buttons_plan_tuandui[8],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[8]!=""&&buttons_plan_tuandui[8]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[8],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[8]==""&&buttons_plan_tuandui[8]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[8],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[9]!=""&&buttons_plan_tuandui[9]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[9]+'\n'+"团队计划:"+buttons_plan_tuandui[9],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[9]!=""&&buttons_plan_tuandui[9]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[9],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[9]==""&&buttons_plan_tuandui[9]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[9],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[10]!=""&&buttons_plan_tuandui[10]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[10]+'\n'+"团队计划:"+buttons_plan_tuandui[10],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[10]!=""&&buttons_plan_tuandui[10]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[10],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[10]==""&&buttons_plan_tuandui[10]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[10],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[11]!=""&&buttons_plan_tuandui[11]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[11]+'\n'+"团队计划:"+buttons_plan_tuandui[11],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[11]!=""&&buttons_plan_tuandui[11]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[11],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[11]==""&&buttons_plan_tuandui[11]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[11],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[12]!=""&&buttons_plan_tuandui[12]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[12]+'\n'+"团队计划:"+buttons_plan_tuandui[12],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[12]!=""&&buttons_plan_tuandui[12]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[12],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[12]==""&&buttons_plan_tuandui[12]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[12],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[13]!=""&&buttons_plan_tuandui[13]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[13]+'\n'+"团队计划:"+buttons_plan_tuandui[13],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[13]!=""&&buttons_plan_tuandui[13]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[13],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[13]==""&&buttons_plan_tuandui[13]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[13],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[14]!=""&&buttons_plan_tuandui[14]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[14]+'\n'+"团队计划:"+buttons_plan_tuandui[14],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[14]!=""&&buttons_plan_tuandui[14]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[14],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[14]==""&&buttons_plan_tuandui[14]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[14],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[15]!=""&&buttons_plan_tuandui[15]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[15]+'\n'+"团队计划:"+buttons_plan_tuandui[15],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[15]!=""&&buttons_plan_tuandui[15]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[15],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[15]==""&&buttons_plan_tuandui[15]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[15],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[16]!=""&&buttons_plan_tuandui[16]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[16]+'\n'+"团队计划:"+buttons_plan_tuandui[16],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[16]!=""&&buttons_plan_tuandui[16]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[16],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[16]==""&&buttons_plan_tuandui[16]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[16],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[17]!=""&&buttons_plan_tuandui[17]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[17]+'\n'+"团队计划:"+buttons_plan_tuandui[17],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[17]!=""&&buttons_plan_tuandui[17]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[17],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[17]==""&&buttons_plan_tuandui[17]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[17],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[18]!=""&&buttons_plan_tuandui[18]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[18]+'\n'+"团队计划:"+buttons_plan_tuandui[18],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[18]!=""&&buttons_plan_tuandui[18]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[18],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[18]==""&&buttons_plan_tuandui[18]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[18],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[19]!=""&&buttons_plan_tuandui[19]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[19]+'\n'+"团队计划:"+buttons_plan_tuandui[19],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[19]!=""&&buttons_plan_tuandui[19]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[19],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[19]==""&&buttons_plan_tuandui[19]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[19],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[20]!=""&&buttons_plan_tuandui[20]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[20]+'\n'+"团队计划:"+buttons_plan_tuandui[20],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[20]!=""&&buttons_plan_tuandui[20]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[20],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[20]==""&&buttons_plan_tuandui[20]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[20],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[21]!=""&&buttons_plan_tuandui[21]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[21]+'\n'+"团队计划:"+buttons_plan_tuandui[21],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[21]!=""&&buttons_plan_tuandui[21]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[21],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[21]==""&&buttons_plan_tuandui[21]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[21],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[22]!=""&&buttons_plan_tuandui[22]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[22]+'\n'+"团队计划:"+buttons_plan_tuandui[22],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[22]!=""&&buttons_plan_tuandui[22]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[22],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[22]==""&&buttons_plan_tuandui[22]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[22],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[23]!=""&&buttons_plan_tuandui[23]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[23]+'\n'+"团队计划:"+buttons_plan_tuandui[23],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[23]!=""&&buttons_plan_tuandui[23]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[23],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[23]==""&&buttons_plan_tuandui[23]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[23],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[24]!=""&&buttons_plan_tuandui[24]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[24]+'\n'+"团队计划:"+buttons_plan_tuandui[24],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[24]!=""&&buttons_plan_tuandui[24]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[24],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[24]==""&&buttons_plan_tuandui[24]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[24],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[25]!=""&&buttons_plan_tuandui[25]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[25]+'\n'+"团队计划:"+buttons_plan_tuandui[25],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[25]!=""&&buttons_plan_tuandui[25]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[25],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[25]==""&&buttons_plan_tuandui[25]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[25],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[26]!=""&&buttons_plan_tuandui[26]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[26]+'\n'+"团队计划:"+buttons_plan_tuandui[26],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[26]!=""&&buttons_plan_tuandui[26]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[26],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[26]==""&&buttons_plan_tuandui[26]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[26],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[27].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[27]!=""&&buttons_plan_tuandui[27]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[27]+'\n'+"团队计划:"+buttons_plan_tuandui[27],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[27]!=""&&buttons_plan_tuandui[27]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[27],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[27]==""&&buttons_plan_tuandui[27]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[27],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[28].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[28]!=""&&buttons_plan_tuandui[28]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[28]+'\n'+"团队计划:"+buttons_plan_tuandui[28],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[28]!=""&&buttons_plan_tuandui[28]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[28],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[28]==""&&buttons_plan_tuandui[28]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[28],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[29].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[29]!=""&&buttons_plan_tuandui[29]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[29]+'\n'+"团队计划:"+buttons_plan_tuandui[29],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[29]!=""&&buttons_plan_tuandui[29]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[29],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[29]==""&&buttons_plan_tuandui[29]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[29],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[30].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[30]!=""&&buttons_plan_tuandui[30]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[30]+'\n'+"团队计划:"+buttons_plan_tuandui[30],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[30]!=""&&buttons_plan_tuandui[30]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[30],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[30]==""&&buttons_plan_tuandui[30]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[30],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[31].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[31]!=""&&buttons_plan_tuandui[31]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[31]+'\n'+"团队计划:"+buttons_plan_tuandui[31],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[31]!=""&&buttons_plan_tuandui[31]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[31],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[31]==""&&buttons_plan_tuandui[31]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[31],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[32].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[32]!=""&&buttons_plan_tuandui[32]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[32]+'\n'+"团队计划:"+buttons_plan_tuandui[32],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[32]!=""&&buttons_plan_tuandui[32]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[32],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[32]==""&&buttons_plan_tuandui[32]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[32],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[33].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[33]!=""&&buttons_plan_tuandui[33]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[33]+'\n'+"团队计划:"+buttons_plan_tuandui[33],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[33]!=""&&buttons_plan_tuandui[33]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[33],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[33]==""&&buttons_plan_tuandui[33]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[33],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[34].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[34]!=""&&buttons_plan_tuandui[34]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[34]+'\n'+"团队计划:"+buttons_plan_tuandui[34],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[34]!=""&&buttons_plan_tuandui[34]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[34],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[34]==""&&buttons_plan_tuandui[34]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[34],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[35].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[35]!=""&&buttons_plan_tuandui[35]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[35]+'\n'+"团队计划:"+buttons_plan_tuandui[35],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[35]!=""&&buttons_plan_tuandui[35]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[35],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[35]==""&&buttons_plan_tuandui[35]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[35],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[36].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[36]!=""&&buttons_plan_tuandui[36]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[36]+'\n'+"团队计划:"+buttons_plan_tuandui[36],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[36]!=""&&buttons_plan_tuandui[36]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[36],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[36]==""&&buttons_plan_tuandui[36]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[36],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[37].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[37]!=""&&buttons_plan_tuandui[37]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[37]+'\n'+"团队计划:"+buttons_plan_tuandui[37],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[37]!=""&&buttons_plan_tuandui[37]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[37],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[37]==""&&buttons_plan_tuandui[37]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[37],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[38].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[38]!=""&&buttons_plan_tuandui[38]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[38]+'\n'+"团队计划:"+buttons_plan_tuandui[38],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[38]!=""&&buttons_plan_tuandui[38]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[38],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[38]==""&&buttons_plan_tuandui[38]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[38],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[39].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[39]!=""&&buttons_plan_tuandui[39]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[39]+'\n'+"团队计划:"+buttons_plan_tuandui[39],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[39]!=""&&buttons_plan_tuandui[39]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[39],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[39]==""&&buttons_plan_tuandui[39]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[39],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[40].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[40]!=""&&buttons_plan_tuandui[40]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[40]+'\n'+"团队计划:"+buttons_plan_tuandui[40],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[40]!=""&&buttons_plan_tuandui[40]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[40],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[40]==""&&buttons_plan_tuandui[40]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[40],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[41].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[41]!=""&&buttons_plan_tuandui[41]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[41]+'\n'+"团队计划:"+buttons_plan_tuandui[41],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[41]!=""&&buttons_plan_tuandui[41]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[41],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[41]==""&&buttons_plan_tuandui[41]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[41],Toast.LENGTH_SHORT).show();
            }
        });

        buttons[42].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[42]!=""&&buttons_plan_tuandui[42]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[42]+'\n'+"团队计划:"+buttons_plan_tuandui[42],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[42]!=""&&buttons_plan_tuandui[42]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[42],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[42]==""&&buttons_plan_tuandui[42]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[42],Toast.LENGTH_SHORT).show();
            }
        });


       /* buttons[].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttons_plan_geren[]!=""&&buttons_plan_tuandui[]!="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[]+'\n'+"团队计划:"+buttons_plan_tuandui[],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[]!=""&&buttons_plan_tuandui[]=="")Toast.makeText(MyPlan.this,"个人计划:"+buttons_plan_geren[],Toast.LENGTH_SHORT).show();
                else if(buttons_plan_geren[]==""&&buttons_plan_tuandui[]!="")Toast.makeText(MyPlan.this,"团队计划:"+buttons_plan_tuandui[],Toast.LENGTH_SHORT).show();
            }
        });*/


        /*mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);*/
    }

}
