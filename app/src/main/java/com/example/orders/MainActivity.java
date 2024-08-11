package com.example.orders;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orders.adapter.ProductAdapter;
import com.example.orders.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView productRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(0, "java", "Товар 1", "#424345", "Товар 1", "4р", "java"));
        productList.add(new Product(1, "java", "Товар 2", "#424345", "Товар 2", "4.5р", "java"));
        productList.add(new Product(2, "java", "Товар 3", "#424345", "Товар 3", "3.5р", "java"));

        setProductRecycler(productList);

    }

    private void setProductRecycler(List<Product> productList) {
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

    productRecycler = findViewById(R.id.productRecycler);
    productRecycler.setLayoutManager(layoutManager);

    productAdapter = new ProductAdapter(this, productList);
    productRecycler.setAdapter(productAdapter);
    }
}