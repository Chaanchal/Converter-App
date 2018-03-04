package com.example.admin.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TemperatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        final EditText edit_celsius = findViewById(R.id.edit_celsius);
        final EditText edit_fahrenheit = findViewById(R.id.edit_fahrenheit);
        Button button_calT = findViewById(R.id.button_calT);

        button_calT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double celsius = Double.valueOf(edit_celsius.getText().toString());
                double fahrenheit = celsius * 1.8 + 32;
                edit_fahrenheit.setText(String.valueOf(fahrenheit));

            }
        });
    }
}
