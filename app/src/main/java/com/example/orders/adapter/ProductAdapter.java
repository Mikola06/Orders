package com.example.orders.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orders.R;
import com.example.orders.model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    Context context;
    List<Product> products;

    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View productItem = LayoutInflater.from(context).inflate(R.layout.product_item, parent, false);
        return new ProductAdapter.ProductViewHolder(productItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {
        holder.productBg.setCardBackgroundColor(Color.parseColor(products.get(position).getColor()));

        int imageId = context.getResources().getIdentifier("ic_" + products.get(position).getImg(), "drawable", context.getPackageName());
        holder.productImage.setImageResource(imageId);

        holder.productTitle.setText(products.get(position).getText());
        holder.productText.setText(products.get(position).getText());
        holder.productPrice.setText(products.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder {

        CardView productBg;
        ImageView productImage;
        TextView productTitle, productText, productPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            productBg = itemView.findViewById(R.id.productBg);
            productImage = itemView.findViewById(R.id.productImage);
            productTitle = itemView.findViewById(R.id.productTitle);
            productText = itemView.findViewById(R.id.productText);
            productPrice = itemView.findViewById(R.id.productPrice);
        }
    }
}
