package com.hfad.mobile_lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ChairCartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair_cart);

        List<Chair> listItem = Chair.listItem;

        RecyclerView recycler = (RecyclerView) findViewById(R.id.cart_recycler);

        CartAdapter adapter = new CartAdapter(listItem);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recycler.setAdapter(adapter);
        recycler.setLayoutManager(layoutManager);

        TextView subTotal = (TextView) findViewById(R.id.tvSubTotal);
        TextView orderTotal = (TextView) findViewById(R.id.tvTotalOrder);

        double sum = 0.0;
        for (Chair item: listItem
             ) {
            sum += (item.getQuantity()*item.getPrice());
        }

        subTotal.setText("$" + String.valueOf(sum));
        orderTotal.setText("$" + String.valueOf(sum));
    }
}