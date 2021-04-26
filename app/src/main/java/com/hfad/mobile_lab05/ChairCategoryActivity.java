package com.hfad.mobile_lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class ChairCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair_category);

        RecyclerView chairCategoryRecycler = (RecyclerView) findViewById(R.id.chair_category_recycler);

        Chair[] chairs = Chair.chairs;

        ChairCategoryAdapter adapter = new ChairCategoryAdapter(chairs);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        chairCategoryRecycler.setAdapter(adapter);
        chairCategoryRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new ChairCategoryAdapter.Listener() {
            @Override
            public void onClick(int position) {
                sendId(position);
            }
        });
    }

    public void sendId(int position) {
        Intent intent = new Intent(this, ChairDetailActivity.class);
        intent.putExtra(ChairDetailActivity.EXTRA_CHAIR_ID, position);
        startActivity(intent);
    }
}