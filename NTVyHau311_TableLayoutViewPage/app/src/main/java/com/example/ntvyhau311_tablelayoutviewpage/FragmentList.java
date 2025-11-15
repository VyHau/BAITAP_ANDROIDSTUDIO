package com.example.ntvyhau311_tablelayoutviewpage;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentList extends Fragment {

    RecyclerView rcv;
    ArrayList<Food> list;
    public FragmentList() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        rcv = view.findViewById(R.id.recyclerList_311);
        rcv.setLayoutManager(new LinearLayoutManager(getContext()));
        loadData();
        rcv.setAdapter(new FoodAdapter(getContext(), list));
        return view;
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Food(R.drawable.tom, "Tôm sú hấp", "120.000đ"));
        list.add(new Food(R.drawable.muc, "Mực nướng", "150.000đ"));
        list.add(new Food(R.drawable.hau, "Hàu nướng phô mai", "90.000đ"));
        list.add(new Food(R.drawable.oc, "Ốc hương rang muối", "180.000đ"));
        list.add(new Food(R.drawable.ghe, "Ghẹ hấp bia", "250.000đ"));
    }
}
