package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnNext);
        ImageView idImage = findViewById(R.id.image);

        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText edtTxtAge = findViewById(R.id.edtTxtAge);

        TextView title = findViewById(R.id.title);
        TextView txtView = findViewById(R.id.txtView);







        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                String name = (edtTxtName.getText().toString());
                String age = (edtTxtAge.getText().toString());





               if (edtTxtName.getText().toString().equals("")){


               }else if (edtTxtAge.getText().toString().equals("")){


               }else{
                   intent.putExtra("name", name);
                   intent.putExtra("age", age);

                   startActivity(intent);
               }








            }
        });






    }
}