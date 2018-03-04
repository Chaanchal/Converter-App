package com.example.admin.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_weight;
    Button button_length;
    Button button_temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalWeight();
        CalLength();
        CalTemp();
    }
    public void CalWeight(){
        button_weight = findViewById(R.id.buttonW);
        button_weight.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent1 = new Intent("com.example.admin.converter.WeightActivity");
                        startActivity(intent1);
                    }
                }
        );

    }
    public void CalLength(){
        button_length = findViewById(R.id.buttonL);
        button_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent("com.example.admin.converter.LengthActivity");
                startActivity(intent2);
            }
        });

    }
    public void CalTemp(){
        button_temp = findViewById(R.id.buttonT);
        button_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent("com.example.admin.converter.TemperatureActivity");
                startActivity(intent3);
            }
        });
    }
}
