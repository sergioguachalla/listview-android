package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewData;
    ArrayList<ItemModel> itemModelArrayList;
    Adaptor adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemModelArrayList = new ArrayList<ItemModel>();

        adaptor = new Adaptor(this, itemModelArrayList);

        listViewData = findViewById(R.id.lvData);
        listViewData.setAdapter(adaptor);

        loadList();

    }

    void loadList(){
        itemModelArrayList.add(new ItemModel("Item 1", "Description 1", R.drawable.item_1));
        itemModelArrayList.add(new ItemModel("Item 2", "Description 2", R.drawable.item_2));
        itemModelArrayList.add(new ItemModel("Item 3", "Description 3", R.drawable.item_3));
        itemModelArrayList.add(new ItemModel("Item 4", "Description 4", R.drawable.item_4));
        itemModelArrayList.add(new ItemModel("Item 5", "Description 5", R.drawable.item_5));
        itemModelArrayList.add(new ItemModel("Item 1", "Description 1", R.drawable.item_1));
        itemModelArrayList.add(new ItemModel("Item 2", "Description 2", R.drawable.item_2));
        itemModelArrayList.add(new ItemModel("Item 3", "Description 3", R.drawable.item_3));
        itemModelArrayList.add(new ItemModel("Item 4", "Description 4", R.drawable.item_4));
        itemModelArrayList.add(new ItemModel("Item 5", "Description 5", R.drawable.item_5));
    }
}