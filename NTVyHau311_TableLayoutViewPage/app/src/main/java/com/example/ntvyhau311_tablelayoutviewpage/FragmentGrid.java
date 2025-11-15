package com.example.ntvyhau311_tablelayoutviewpage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class FragmentGrid extends Fragment {
    RecyclerView recyclerGrid;
    ArrayList<Food> list;
    public FragmentGrid() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid, container, false);
        recyclerGrid = view.findViewById(R.id.recyclerGrid_311);
        recyclerGrid.setLayoutManager(new GridLayoutManager(getContext(), 2));
        loadData();
        FoodAdapter adapter = new FoodAdapter(getContext(), list);
        recyclerGrid.setAdapter(adapter);
        return view;
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Food(R.drawable.tom, "Tôm sú hấp", "120.000đ"));
        list.add(new Food(R.drawable.muc, "Mực nướng", "150.000đ"));
        list.add(new Food(R.drawable.hau, "Hàu phô mai", "90.000đ"));
        list.add(new Food(R.drawable.oc, "Ốc hương rang muối", "180.000đ"));
        list.add(new Food(R.drawable.ghe, "Ghẹ hấp bia", "250.000đ"));
        list.add(new Food(R.drawable.muc, "Mực chiên giòn", "140.000đ"));
        list.add(new Food(R.drawable.tom, "Tôm tít rang me", "200.000đ"));
        list.add(new Food(R.drawable.hau, "Hàu sống", "70.000đ"));
    }
}
