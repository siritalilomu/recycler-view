package com.siri.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private static final String URL_DATA = "https://simplifiedcoding.net/demos/marvel/";

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<Item> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            Item item = new Item(
                    " My Title " + i,
                    "Lorem ipsum dummy content text"
            );

            listItems.add(item);
        }
        adapter = new MyAdapter(listItems, this);

        recyclerView.setAdapter(adapter);
    }
}
