package com.example.ntvyhau311_tablelayoutviewpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    Context context_311;
    List<Food> list_311;

    public FoodAdapter(Context context_311, List<Food> list_311) {
        this.context_311 = context_311;
        this.list_311 = list_311;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context_311).inflate(R.layout.item_food, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food food = list_311.get(position);
        holder.img_311.setImageResource(food.getImage());
        holder.name_311.setText(food.getName());
        holder.price_311.setText(food.getPrice());
    }

    @Override
    public int getItemCount() {
        return list_311.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_311;
        TextView name_311, price_311;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_311 = itemView.findViewById(R.id.foodImage_311);
            name_311 = itemView.findViewById(R.id.foodName_311);
            price_311 = itemView.findViewById(R.id.foodPrice_311);
        }
    }
}

