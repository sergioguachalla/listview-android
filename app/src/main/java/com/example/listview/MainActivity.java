package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

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

        listViewData.setOnItemClickListener((adapterView, view, i, l) -> {
            ItemModel itemModel = itemModelArrayList.get(i);
            Toast.makeText(this, itemModel.getName(), Toast.LENGTH_SHORT).show();
            goToActivityB(view, itemModel);
        }

        );

    }

    void loadList(){
        itemModelArrayList.add(new ItemModel("Ferrari", "Italian luxury sports car.", R.drawable.item_1));
        itemModelArrayList.add(new ItemModel("Tesla", "Electric car manufacturer.", R.drawable.item_2));
        itemModelArrayList.add(new ItemModel("Toyota", "Japanese automotive manufacturer.", R.drawable.item_3));
        itemModelArrayList.add(new ItemModel("BMW", "German luxury automobile brand.", R.drawable.item_4));
        itemModelArrayList.add(new ItemModel("Ford", "American multinational automaker.", R.drawable.item_5));

        itemModelArrayList.add(new ItemModel("Item 1", "Description 1", R.drawable.item_1));
        itemModelArrayList.add(new ItemModel("Item 2", "Description 2", R.drawable.item_2));
        itemModelArrayList.add(new ItemModel("Item 3", "Description 3", R.drawable.item_3));
        itemModelArrayList.add(new ItemModel("Item 4", "Description 4", R.drawable.item_4));
        itemModelArrayList.add(new ItemModel("Item 5", "Description 5", R.drawable.item_5));
    }
    public void goToActivityB(View view, ItemModel itemModel){
        String title = itemModel.getName();
        String description = itemModel.getDescription();
        int image = itemModel.getImage();
        Intent intent = new Intent(this, FotoDetail.class);

        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("image", image);
        startActivity(intent);
    }
}