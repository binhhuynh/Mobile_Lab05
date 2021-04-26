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

public class ChairCategoryAdapter extends RecyclerView.Adapter<ChairCategoryAdapter.ViewHolder>{

    private Chair[] chairs;
    private Listener listener;

    interface Listener {
        void onClick(int position);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public ChairCategoryAdapter(Chair[] chairs) {
        this.chairs = chairs;
    }

    @NonNull
    @Override
    public ChairCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chair_category_card_view, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ChairCategoryAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView chairName = (TextView) cardView.findViewById(R.id.tvChairName);
        TextView chairPrice = (TextView) cardView.findViewById(R.id.tvChairPrice);
        ImageView chairImg = (ImageView) cardView.findViewById(R.id.imgChair);

        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), chairs[position].getImageResourceId());
        chairImg.setImageDrawable(drawable);

        chairName.setText(chairs[position].getName());
        chairPrice.setText("$" + String.valueOf(chairs[position].getPrice()));

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
        return chairs.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
}
