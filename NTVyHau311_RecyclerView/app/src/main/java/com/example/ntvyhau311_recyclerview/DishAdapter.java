package com.example.ntvyhau311_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DishAdapter extends RecyclerView.Adapter<DishViewHolder> {

    private Context context_311;
    private List<MyModel> myModelList_311;
    private SelectListener listener_311;

    public DishAdapter(Context context, List<MyModel> myModelList, SelectListener listener) {
        this.context_311 = context;
        this.myModelList_311 = myModelList;
        this.listener_311 = listener;
    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_311 = LayoutInflater.from(context_311).inflate(R.layout.item, parent, false);
        return new DishViewHolder(view_311);
    }

    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        MyModel model_311 = myModelList_311.get(position);
        holder.tvFoodName_311.setText(model_311.getFoodName_311());
        holder.tvDescription_311.setText(model_311.getDescription_311());
        holder.tvPrice_311.setText(model_311.getPrice_311());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener_311.onItemClicked(model_311);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myModelList_311.size();
    }
}