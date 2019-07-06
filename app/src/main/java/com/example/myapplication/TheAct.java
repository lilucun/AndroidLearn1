package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TheAct extends AppCompatActivity {
    // 显示标签【相当于指针，保存界面的textview句柄】
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the);
        System.out.println("b is create");

        tv = findViewById(R.id.textView);//返回显示标签句柄
        // 方式一：获取数据
        Intent actIntent = getIntent();
        String value = actIntent.getStringExtra("data");
        int num = actIntent.getIntExtra("data2", 0);
        // 获取自定义数据 效率低，但是特别好用
        MyPhone phone = (MyPhone) actIntent.getSerializableExtra("myClass");

        System.out.println("value:" + value + " num:" + num);
        System.out.println("name:" + phone.getName() + " serial: "+ phone.getSeriral());
        tv.setText(value);
         //java里的sprintf 或者直接使用 + 号 或者 concat函数
        tv.setText(String.format("name = %s, age = %d", value, num));

        // 方式二获取数据：
//        Bundle b = actIntent.getExtras();// 获取所有数据 只能获取bundle传递的数据
//        System.out.println(b.getString("name") + " age: " + b.getInt("age"));

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("b is start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("b is resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("b is restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("b is stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("b is destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("b is pause");
    }
}
