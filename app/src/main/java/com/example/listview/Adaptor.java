package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptor extends BaseAdapter {

    Context context;

    ArrayList<ItemModel> itemModelArrayList;

    public Adaptor(Context context, ArrayList<ItemModel> itemModelArrayList) {
        this.context = context;
        this.itemModelArrayList = itemModelArrayList;
    }

    @Override
    public int getCount() {
        return itemModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return itemModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemModel itemModel = itemModelArrayList.get(i);
        view = LayoutInflater.from(context).inflate(R.layout.layout_item, viewGroup, false);

        ImageView imageView = view.findViewById(R.id.ivFoto);
        imageView.setImageResource(itemModel.getImage());


        TextView tvName = view.findViewById(R.id.tvTitulo);
        tvName.setText(itemModel.getName());

        TextView tvDescription = view.findViewById(R.id.tvDescripcion);
        tvDescription.setText(itemModel.getDescription());
        return view;
    }
}
