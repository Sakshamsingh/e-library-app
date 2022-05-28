package com.example.e_library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button Library;
    private Button MITS;
    private Button Book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MITS =  findViewById(R.id.button3);
        MITS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second = new Intent(SecondActivity.this , ThirdActivity.class);
                startActivity(second);
            }
        });

        Library = findViewById(R.id.button2);
        Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first = new Intent(SecondActivity.this , LibraryActivity.class);
                startActivity(first);
            }
        });

        Book = findViewById(R.id.button4);
        Book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent third = new Intent(SecondActivity.this , PdfActivity.class);
                startActivity(third);
            }
        });
    }
}