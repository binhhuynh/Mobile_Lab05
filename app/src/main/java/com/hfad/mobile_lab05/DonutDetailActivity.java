package com.hfad.mobile_lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DonutDetailActivity extends AppCompatActivity {
    public static final String EXTRA_DONUT_ID = "donutId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_detail);

        int donutId = (Integer) getIntent().getExtras().get(EXTRA_DONUT_ID);
        String name = Donut.donuts[donutId].getName();
        String type = Donut.donuts[donutId].getType();
        double price = Donut.donuts[donutId].getPrice();
        int donutImage = Donut.donuts[donutId].getImageResourceId();

        TextView donutName = (TextView) findViewById(R.id.tvDDonutName);
        TextView donutPrice = (TextView) findViewById(R.id.tvDDonutPrice);
        TextView donutType = (TextView) findViewById((R.id.tvDDonutType));
        ImageView donutImg = (ImageView) findViewById(R.id.imgDDonut);

        donutName.setText(name);

        DecimalFormat decimalFormat = new DecimalFormat("##.00");

        donutPrice.setText("$" + String.valueOf(decimalFormat.format(price)));
        donutType.setText(type);
        donutImg.setImageDrawable(ContextCompat.getDrawable(this, donutImage));
    }
}