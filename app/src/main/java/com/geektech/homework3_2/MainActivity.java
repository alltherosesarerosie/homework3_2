package com.geektech.homework3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_food;
    private ArrayList<String> food_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_food = findViewById(R.id.recycle_view);
        loadData();
        ClothesAdapter adapter = new ClothesAdapter(food_list);
        rv_food.setAdapter(adapter);
    }

    private void loadData() {
        food_list.add("jeans");
        food_list.add("t-shirt");
        food_list.add("coat");
        food_list.add("skirt");
        food_list.add("hoodie");
        food_list.add("blouse");
        food_list.add("scarf");
        food_list.add("socks");
        food_list.add("shirt");
    }
}