package com.hfad.mobile_lab05;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;

public class DonutAdapter extends RecyclerView.Adapter<DonutAdapter.ViewHolder> {

    private Donut[] donuts;
    private Listener listener;

    interface Listener {
        void onClick(int position);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public DonutAdapter(Donut[] donuts) {
        this.donuts = donuts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_donut, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView donutImg = (ImageView) cardView.findViewById(R.id.imgDonut);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), donuts[position].getImageResourceId());
        donutImg.setImageDrawable(drawable);

        TextView donutName = (TextView) cardView.findViewById(R.id.tvDonutName);
        donutName.setText(donuts[position].getName());

        TextView donutType = (TextView) cardView.findViewById(R.id.tvDonutType);
        donutType.setText(donuts[position].getType());



        TextView donutPrice = (TextView) cardView.findViewById(R.id.tvDonutPrice);

        DecimalFormat myFormatter = new DecimalFormat("##.00");

        donutPrice.setText("$" + myFormatter.format(donuts[position].getPrice()));

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return donuts.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
}
