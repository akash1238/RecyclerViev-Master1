package com.master.recyclerviev_master;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView vertical_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        vertical_recyclerview = findViewById(R.id.vertical_recyclerview);
     //   recyclerView.setNestedScrollingEnabled(false);
       // vertical_recyclerview.setNestedScrollingEnabled(false);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        MainAdaper adaper = new MainAdaper(this,true);
        recyclerView.setAdapter(adaper);

        vertical_recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        MainAdaper adaper1 = new MainAdaper(this,false);
        vertical_recyclerview.setAdapter(adaper1);
    }
}
