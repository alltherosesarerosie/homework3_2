package com.geektech.homework3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClothesHolderView extends RecyclerView.ViewHolder {
    private TextView tv_clot;
    
    public ClothesHolderView(@NonNull View itemView) {
        super(itemView);
        tv_clot = itemView.findViewById(R.id.tv_clothes);

    }

    public void bind(String clothes) {
        tv_clot.setText(clothes);
    }
}
