package com.example.admin.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LengthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        final EditText edit_meter = findViewById(R.id.edit_meter);
        final EditText edit_centimeter = findViewById(R.id.edit_centimeter);
        final EditText edit_kilometer = findViewById(R.id.edit_kilometer);
        final EditText edit_inch = findViewById(R.id.edit_inch);
        final EditText edit_foot = findViewById(R.id.edit_foot);
        final EditText edit_mile = findViewById(R.id.edit_mile);
        final EditText edit_yard = findViewById(R.id.edit_yard);
        Button button_calL = findViewById(R.id.button_calL);

        button_calL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double meter = Double.valueOf(edit_meter.getText().toString());
                double kilometer = meter * 0.0001;
                edit_kilometer.setText(String.valueOf(kilometer));
                double centimeter = meter * 100;
                edit_centimeter.setText(String.valueOf(centimeter));
                double inch = meter * 39.3701;
                edit_inch.setText(String.valueOf(inch));
                double foot = meter * 3.28084;
                edit_foot.setText(String.valueOf(foot));
                double mile = meter * 0.000621371;
                edit_mile.setText(String.valueOf(mile));
                double yard = meter * 1.09361;
                edit_yard.setText(String.valueOf(yard));
            }
        });
    }
}
