package com.example.calci;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btadd,btsub,btdiv,btmul,btequ,btdot,btac,btper,btsign;
    private TextView Display;

    String a = "";
    String num;
    String str="";
    float num1;
    float num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Display = (TextView) findViewById(R.id._Display);

        bt0 = (Button) findViewById(R.id._0);
        bt1 = (Button) findViewById(R.id._1);
        bt2 = (Button) findViewById(R.id._2);
        bt3 = (Button) findViewById(R.id._3);
        bt4 = (Button) findViewById(R.id._4);
        bt5 = (Button) findViewById(R.id._5);
        bt6 = (Button) findViewById(R.id._6);
        bt7 = (Button) findViewById(R.id._7);
        bt8 = (Button) findViewById(R.id._8);
        bt9 = (Button) findViewById(R.id._9);
        btdot = (Button) findViewById(R.id._Dot);
        btadd = (Button) findViewById(R.id._Add);
        btsub = (Button) findViewById(R.id._Sub);
        btmul = (Button) findViewById(R.id._mult);
        btdiv = (Button) findViewById(R.id._Div);
        btsign = (Button) findViewById(R.id._Sign);
        btac = (Button) findViewById(R.id._C);
        btequ = (Button) findViewById(R.id._Ans);
        btper = (Button) findViewById(R.id._Per);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            num = "0";
            str = Display.getText().toString();
            Display.setText(String.valueOf(str+num));

            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "1";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "2";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "3";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "4";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "5";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "6";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "7";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "8";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "9";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+num));

            }
        });

        btsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "-";
                str = Display.getText().toString();
                Display.setText(String.valueOf(num+str));

            }
        });

        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = ".";
                str = Display.getText().toString();
                Display.setText(String.valueOf(str+"."));

            }
        });



        btac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(String.valueOf(""));
                num1 = 0;
                num2 = 0;
            }
        });



        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(Display.getText().toString());
                    a="+";
                    Display.setText(String.valueOf(""));
                }
                catch (Exception E){
                    a="+";
                    Display.setText(String.valueOf(""));
                }

            }
        });

        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(Display.getText().toString());
                    a = "-";
                    Display.setText(String.valueOf(""));
                }
                catch (Exception E){
                    a = "-";
                    Display.setText(String.valueOf(""));
                }

            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(Display.getText().toString());
                    a = "*";
                    Display.setText(String.valueOf(""));
                }
                catch (Exception E){
                    a = "*";
                    Display.setText(String.valueOf(""));
                }

            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(Display.getText().toString());
                    a = "/";
                    Display.setText(String.valueOf(""));
                }
                catch (Exception E){
                    a = "/";
                    Display.setText(String.valueOf(""));
                }
            }
        });

        btper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(Display.getText().toString());
                    num1 = (num1/100);
                    Display.setText(String.valueOf(num1));
                }
                catch (Exception E){
                    num1 = (num1/100);
                    Display.setText(String.valueOf(num1));
                }
            }
        });


        btequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (a == "+"){
                        num2 = Float.parseFloat(Display.getText().toString());
                        if (num1+num2 == (int)(num1+num2)){
                            Display.setText(String.valueOf((int)(num1+num2)));
                        }
                        else {
                            Display.setText(String.valueOf(num1+num2));
                        }

                    } else if (a =="-") {
                        num2 = Float.parseFloat(Display.getText().toString());
                        if(num1-num2 == (int)(num1-num2)){
                            Display.setText(String.valueOf((int)(num1-num2)));
                        }
                        else {
                            Display.setText(String.valueOf(num1-num2));
                        }

                    } else if (a == "*") {
                        num2 = Float.parseFloat(Display.getText().toString());
                        if (num1*num2 == (int)(num1*num2)){
                            Display.setText(String.valueOf((int)(num1*num2)));
                        }
                        else {
                            Display.setText(String.valueOf(num1*num2));
                        }

                    } else if (a == "/") {
                        num2 = Float.parseFloat(Display.getText().toString());
                        if(num1/num2 == (int)(num1/num2)){
                            Display.setText(String.valueOf((int)(num1/num2)));
                        }
                        else {
                            Display.setText(String.valueOf(num1/num2));
                        }
                    }
                }
                catch (Exception E){
                    Display.setText(String.valueOf("Error"));
                }

            }
        });


    }
}