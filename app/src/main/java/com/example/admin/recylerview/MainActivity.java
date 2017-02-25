package com.example.admin.recylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Student> Al=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.rv1);

        MyAdapter obj=new MyAdapter(this,R.layout.card,Al);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(obj);

        Student s1=new Student();
        s1.setImg(R.mipmap.ic_launcher);
        s1.setName("Anoop");
        Al.add(s1);
        Al.add(s1);
        Al.add(s1);
        Al.add(s1);
        Al.add(s1);
        Al.add(s1);
        Al.add(s1);
        Al.add(s1);
        Al.add(s1);
        Al.add(s1);


    }
}
