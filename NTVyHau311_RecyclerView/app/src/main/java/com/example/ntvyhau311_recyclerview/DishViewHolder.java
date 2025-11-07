package com.example.ntvyhau311_recyclerview;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DishViewHolder extends RecyclerView.ViewHolder {

    public TextView tvFoodName_311;
    public TextView tvDescription_311;
    public TextView tvPrice_311;
    public DishViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFoodName_311 = itemView.findViewById(R.id.tvFoodName_311);
        tvDescription_311 = itemView.findViewById(R.id.tvDescription_311);
        tvPrice_311 = itemView.findViewById(R.id.tvPrice_311);
    }
}