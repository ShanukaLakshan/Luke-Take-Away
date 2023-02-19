package com.unique.luketakeaway.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.unique.luketakeaway.R;
import com.unique.luketakeaway.Domain.*;
import com.unique.luketakeaway.Adapter.*;


import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter,adapter2,adapter3;
    private  RecyclerView recyclerViewList,recyclerViewListMainItems,recyclerViewListMainCategoryItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView();
        recyclerViewMainCategoryItems();
        recyclerViewMainItems();
    }

    private void recyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewList = findViewById(R.id.recyclerView4);
        recyclerViewList.setLayoutManager(linearLayoutManager);
        ArrayList<UpperDomain> upperList = new ArrayList<>();
        upperList.add(new UpperDomain("location","Delivery","49/1 Moscow, France"));
        upperList.add(new UpperDomain("card","Card","4574 7894 7868 8794"));
        adapter = new UpperAdapter(upperList);
        recyclerViewList.setAdapter(adapter);
    }

    private void recyclerViewMainCategoryItems() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewListMainCategoryItems = findViewById(R.id.recyclerView6);
        recyclerViewListMainCategoryItems.setLayoutManager(linearLayoutManager);
        ArrayList<MainCategoryDomain> mainCategoryList = new ArrayList<>();
        mainCategoryList.add(new MainCategoryDomain("All","pizza1"));
        mainCategoryList.add(new MainCategoryDomain("Fish","pizza1"));
        mainCategoryList.add(new MainCategoryDomain("Chicken","pizza1"));
        mainCategoryList.add(new MainCategoryDomain("Chips","pizza1"));
        mainCategoryList.add(new MainCategoryDomain("Drinks","pizza1"));
        mainCategoryList.add(new MainCategoryDomain("Juice","pizza1"));
        mainCategoryList.add(new MainCategoryDomain("Liquor","pizza1"));
        adapter3 = new MainCategoryAdapter(mainCategoryList);
        recyclerViewListMainCategoryItems.setAdapter(adapter3);


    }

    private void recyclerViewMainItems() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerViewListMainItems = findViewById(R.id.recyclerView5);
        recyclerViewListMainItems.setLayoutManager(linearLayoutManager);
        ArrayList<MainItemDomain> mainItemList = new ArrayList<>();
        mainItemList.add(new MainItemDomain("Delivery","Available","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","54.0"));
        mainItemList.add(new MainItemDomain("Card","Pending","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","835"));
        mainItemList.add(new MainItemDomain("Delivery","Available","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","54.0"));
        mainItemList.add(new MainItemDomain("Card","Pending","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","835"));
        mainItemList.add(new MainItemDomain("Delivery","Available","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","54.0"));
        mainItemList.add(new MainItemDomain("Card","Pending","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","835"));
        mainItemList.add(new MainItemDomain("Delivery","Available","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","54.0"));
        mainItemList.add(new MainItemDomain("Card","Pending","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","835"));
        adapter2 = new MainItemAdapter(mainItemList);
        recyclerViewListMainItems.setAdapter(adapter2);


    }
}