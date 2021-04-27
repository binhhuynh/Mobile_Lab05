package com.hfad.mobile_lab05;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

    private List<Chair> listItem;

    public CartAdapter(List<Chair> listItem) {
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chair_cart_card_view, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.ivCImage);
        TextView name = (TextView) cardView.findViewById(R.id.tvCChairName);
        TextView price = (TextView) cardView.findViewById(R.id.tvCChairPrice);
        TextView quantity = (TextView) cardView.findViewById(R.id.tvCChairQuantity);

        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), listItem.get(position).getImageResourceId());
        imageView.setImageDrawable(drawable);

        name.setText(listItem.get(position).getName());
        price.setText("$" + String.valueOf(listItem.get(position).getPrice()));
        quantity.setText(String.valueOf(listItem.get(position).getQuantity()));
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;


        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
}
