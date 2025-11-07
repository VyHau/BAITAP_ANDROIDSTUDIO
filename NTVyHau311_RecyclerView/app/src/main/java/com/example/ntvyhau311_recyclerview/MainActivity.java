package com.example.ntvyhau311_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener {

    private RecyclerView recyclerView_311;
    private List<MyModel> myModelList_311;
    private DishAdapter dishAdapter_311;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_311 = findViewById(R.id.recyclerView);
        recyclerView_311.setLayoutManager(new LinearLayoutManager(this));
        myModelList_311 = new ArrayList<>();
        myModelList_311.add(new MyModel("Mì Quảng", "Mì Quảng đậm vị với tôm thịt", "42k"));
        myModelList_311.add(new MyModel("Gà lá giang", "Món truyền thống với gia vị đậm đà", "45k"));
        myModelList_311.add(new MyModel("Bún Nạm", "Bún ăn kèm thịt thơm lừng", "31k"));
        myModelList_311.add(new MyModel("Bánh Mì", "Bánh mì thịt nguội với rau củ tươi", "25k"));
        myModelList_311.add(new MyModel("Cơm Tấm", "Cơm tấm sườn bì chả trứng", "32k"));
        myModelList_311.add(new MyModel("Cao Lầu", "Đặc sản của Hội An", "40k"));
        myModelList_311.add(new MyModel("Bánh Xèo", "Bánh xèo ăn kèm rau sống nước sốt", "30k"));
        myModelList_311.add(new MyModel("Bún Bò Huế", "Bún bò cay nồng đậm đà", "45k"));
        dishAdapter_311 = new DishAdapter(this, myModelList_311, this);
        recyclerView_311.setAdapter(dishAdapter_311);
    }
    @Override
    public void onItemClicked(MyModel myModel) {
        Toast.makeText(this, myModel.getFoodName_311() + " - " + myModel.getPrice_311(), Toast.LENGTH_SHORT).show();
    }
}
