package com.hfad.mobile_lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

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

        TextView tvQuantity = (TextView) findViewById(R.id.tvDChairQuantity);

        Button btnAddToCart = (Button) findViewById(R.id.btnAddToCart);
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chair item = new Chair(Chair.chairs[position].getName(), Chair.chairs[position].getPrice(), Integer.parseInt(String.valueOf(tvQuantity.getText())), Chair.chairs[position].getImageResourceId());
                List<Chair> listItem = Chair.listItem;
                listItem.add(item);
                startCartActivity();
            }
        });
    }

    public void startCartActivity() {
        Intent intent = new Intent(this, ChairCartActivity.class);
        startActivity(intent);
    }

    public void onClickIncreaseQuantity(View view) {
        TextView tvQuantity = (TextView) findViewById(R.id.tvDChairQuantity);
        int tempQuantity = Integer.parseInt(String.valueOf(tvQuantity.getText()));
        tvQuantity.setText(String.valueOf(++tempQuantity));
    }

    public void onClickDecreaseQuantity(View view) {
        TextView tvQuantity = (TextView) findViewById(R.id.tvDChairQuantity);
        int tempQuantity = Integer.parseInt(String.valueOf(tvQuantity.getText()));
        tvQuantity.setText(String.valueOf(--tempQuantity));
    }

}