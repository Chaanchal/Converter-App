package com.example.admin.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        final EditText edit_gram = findViewById(R.id.edit_gram);
        final EditText edit_kilogram =  findViewById(R.id.edit_kilogram);
        final EditText edit_tonne =  findViewById(R.id.edit_tonne);
        final EditText edit_Ounce = findViewById(R.id.edit_Ounce);
        Button button_calW =  findViewById(R.id.button_calW);

        button_calW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double gram = Double.valueOf(edit_gram.getText().toString());
                double kilogram = gram * 0.001;
                edit_kilogram.setText(String.valueOf(kilogram));
                double tonne = gram * 0.0000001;
                edit_tonne.setText(String.valueOf(tonne));
                double ounce = gram * 0.035274;
                edit_Ounce.setText(String.valueOf(ounce));
            }
        });
    }
}
