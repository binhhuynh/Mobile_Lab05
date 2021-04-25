package com.hfad.mobile_lab05;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{
    private Product[] products;

    public ProductAdapter(Product[] products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_product, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView productImage = (ImageView) cardView.findViewById(R.id.imgProduct);
        TextView productName = (TextView) cardView.findViewById(R.id.tvProductName);
        RatingBar productRating = (RatingBar) cardView.findViewById(R.id.tvProductRating);
        TextView productReview = (TextView) cardView.findViewById(R.id.tvProductReview);
        TextView productPrice = (TextView) cardView.findViewById(R.id.tvProductPrice);
        TextView productDiscount = (TextView) cardView.findViewById(R.id.tvProductDiscount);

        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), products[position].getImageResourceId());
        productImage.setImageDrawable(drawable);

        productName.setText(products[position].getName());
        productRating.setRating(products[position].getRating());
        productReview.setText("(" + String.valueOf(products[position].getReview()) + ")");

        DecimalFormat decimalFormat = new DecimalFormat(("#.000"));

        int tempDiscount = (int) (products[position].getDiscount() * 100);

        productPrice.setText(decimalFormat.format(products[position].getPrice()) + " đ");
        productDiscount.setText("-" + String.valueOf(tempDiscount) + "%");
    }

    @Override
    public int getItemCount() {
        return products.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
}
