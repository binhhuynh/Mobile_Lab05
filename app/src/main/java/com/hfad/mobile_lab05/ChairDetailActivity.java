package com.hfad.mobile_lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChairDetailActivity extends AppCompatActivity {
    public static final String EXTRA_CHAIR_ID = "chairId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair_detail);

        int position = (int) getIntent().getExtras().get(EXTRA_CHAIR_ID);

        TextView tvDName = (TextView) findViewById(R.id.tvDChairName);
        TextView tvDPrice = (TextView) findViewById(R.id.tvDChairPrice);
        TextView tvDDescription = (TextView) findViewById(R.id.tvDChairDescription);
        ImageView ivD = (ImageView) findViewById(R.id.ivChair);

        tvDName.setText(Chair.chairs[position].getName());
        tvDPrice.setText("$" + String.valueOf(Chair.chairs[position].getPrice()));
        tvDDescription.setText((Chair.chairs[position].getDescription()));

        int chairImg = Chair.chairs[position].getImageResourceId();

        ivD.setImageDrawable(ContextCompat.getDrawable(this, chairImg));
    }
}