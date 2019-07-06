package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("a is create");
        // 两个activity之间切换的启动顺序：a:create start resume pause[是可见的] b:create start resume
        // a:stop 【activity不可见】
        // 找到按钮，监听点击事件，并重新运行一个activity
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent参数说明：上下文，启动activity的类名.class
                Intent intent = new Intent(MainActivity.this, TheAct.class);
                // 两个activity之间传递数据
                // 方法一：通过Intent
                // 必须先传递参数，最后startActivity
                // 多个不同类型的值传递，按照name来解析
                intent.putExtra("data","hello world");// key值，value值
                intent.putExtra("data2", 3);

                // 方法二：通过Bundle
//                Bundle bundle = new Bundle();
//                bundle.putString("name", "wangbai");
//                bundle.putInt("age", 33);

                // 传递自定义类型
                intent.putExtra("myClass", new MyPhone("huawei", "123", "7.1", 12, true));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("a is start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("a is resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("a is restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("a is stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("a is destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("a is pause");
    }
}
