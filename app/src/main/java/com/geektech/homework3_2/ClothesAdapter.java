package com.geektech.homework3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClothesAdapter extends RecyclerView.Adapter<ClothesHolderView> {

    public ArrayList<String> clothes_list;
    public ClothesAdapter(ArrayList<String> clothes_list) {
        this.clothes_list = clothes_list;
    }

    @NonNull
    @Override
    public ClothesHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClothesHolderView(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_clothes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClothesHolderView holder, int position) {
        holder.bind(clothes_list.get(position));
    }

    @Override
    public int getItemCount() {
        return clothes_list.size();
    }
}
