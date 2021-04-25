package com.hfad.mobile_lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TikiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiki);

        Product[] cables = Product.cables;
        Product[] books = Product.books;

        RecyclerView cable_recycler = (RecyclerView) findViewById(R.id.cable_recycler);

        ProductAdapter cableAdapter = new ProductAdapter(cables);

        LinearLayoutManager cableLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        cable_recycler.setAdapter(cableAdapter);
        cable_recycler.setLayoutManager(cableLayoutManager);

        RecyclerView book_recycler = (RecyclerView) findViewById(R.id.book_recycler);

        ProductAdapter bookAdapter = new ProductAdapter(books);

        GridLayoutManager bookLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);

        book_recycler.setAdapter(bookAdapter);
        book_recycler.setLayoutManager(bookLayoutManager);
    }
}