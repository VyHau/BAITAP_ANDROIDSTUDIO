package com.example.ntvyhau311_tablelayoutviewpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout_311;
    ViewPager2 viewPager_311;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout_311 = findViewById(R.id.tabLayout_311);
        viewPager_311 = findViewById(R.id.viewPager_311);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager_311.setAdapter(adapter);
        new TabLayoutMediator(tabLayout_311, viewPager_311, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Dạng danh sách");
                    break;
                case 1:
                    tab.setText("Dạng lưới");
                    break;
            }
        }).attach();
    }
}
