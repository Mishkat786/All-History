package com.example.mishkat_world.allhistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
       Intent intent1 =  getIntent();

        ListView listView = (ListView)findViewById(R.id.listview);
    }
}
