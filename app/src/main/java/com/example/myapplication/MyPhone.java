package com.example.myapplication;


import java.io.Serializable;

// 为了让java能够传递自定义的参数类型，有时需要对其进行序列化
// java 是通过java.io.Serializable 和 java.lang.CharSequence
// android 提供 android.os.Parcelabel
// 做法很简单，只需要让我们的类继承自 上面两个就ok了，系统会帮我们自动序列化好数据
// 或者通过 (Serializable) new MyPhone
public class MyPhone  implements Serializable{
    private String name;
    private String seriral;
    private String system;
    private int age;
    private boolean isRun;

    // 构造函数
    public MyPhone(String name, String seriral, String system, int age, boolean isRun)
    {
        this.name = name;
        this.age =age;
        this.isRun = isRun;
        this.seriral = seriral;
        this.system = system;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeriral() {
        return seriral;
    }

    public void setSeriral(String seriral) {
        this.seriral = seriral;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    public boolean isRun() {
        return isRun;
    }



}
