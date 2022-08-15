package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn2 = findViewById(R.id.btnBack);

        TextView Name = findViewById(R.id.txtViewName);
        TextView Age = findViewById(R.id.txtViewAge);

        TextView userName = findViewById(R.id.userName);
        TextView userAge = findViewById(R.id.userAge);





        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        userName.setText(String.valueOf(name));

        String age = bundle.getString("age");
        userAge.setText(String.valueOf(age));




        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent2);

            }
        });

    }
}