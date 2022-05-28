package com.example.e_library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button LOGIN;
    private TextView info;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.etName);
        Password = findViewById(R.id.etPassword);
        LOGIN = findViewById(R.id.button);
        info = findViewById(R.id.textView);

        info.setText("No. of attempts remaining " + counter);

        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }
    private void validate(String UserName , String UserPassword){
        if ((UserName.equals("Admin 1")) && (UserPassword.equals("12345"))){
            Intent intent = new Intent(MainActivity.this , SecondActivity.class);
            startActivity(intent);
        }
        else{
            counter --;
            info.setText("No. of Attempts remaining " + counter );
            if (counter == 0){
                LOGIN.setEnabled(false);
            }
        }
    }
}