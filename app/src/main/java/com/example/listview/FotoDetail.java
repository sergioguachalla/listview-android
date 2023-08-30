package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FotoDetail extends AppCompatActivity {

    TextView textViewTitle,textViewDescription;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_detail);

        textViewDescription = findViewById(R.id.tvDescription);
        textViewTitle = findViewById(R.id.tvTitle);
        imageView = findViewById(R.id.ivFoto);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int image = getIntent().getIntExtra("image", 0);
        textViewDescription.setText(description);
        imageView.setImageResource(image);
        textViewTitle.setText(title);


    }
}