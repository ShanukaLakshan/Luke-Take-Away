package com.unique.luketakeaway.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.unique.luketakeaway.Adapter.*;
import com.unique.luketakeaway.Domain.*;
import com.unique.luketakeaway.R;

import java.util.ArrayList;

public class MybagActivityTest extends AppCompatActivity {

    private RecyclerView.Adapter adapter,adapter2;
    private  RecyclerView recyclerViewCategoryList,recyclerViewPopularList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mybag);

        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView2);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Pizza","cat_1"));
        categoryList.add(new CategoryDomain("Burger","cat_2"));
        categoryList.add(new CategoryDomain("HotDog","cat_3"));
        categoryList.add(new CategoryDomain("Drink","cat_4"));
        categoryList.add(new CategoryDomain("Donut","cat_5"));

        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);

    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = findViewById(R.id.recyclerView3);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<FoodDomain>();
        foodList.add(new FoodDomain("peperoni Pizza","pizza1","slices peperoni,mozzarella cheese, fresh oregano",13.0,5,20,16,1000));
        foodList.add(new FoodDomain("Cheese Burger","burger","slices peperoni,mozzarella cheese, fresh oregano",22.5,2,13,3,2500));
        foodList.add(new FoodDomain("Vegetable Pizza","pizza3","slices peperoni,mozzarella cheese, fresh oregano",25.4,3,6,3,350));
        foodList.add(new FoodDomain("Chicken Pizza","pizza1","slices peperoni,mozzarella cheese, fresh oregano",17.8,5,42,2,4500));

        adapter2 = new PopularAdapter(foodList);
        recyclerViewPopularList.setAdapter(adapter2);

    }


}