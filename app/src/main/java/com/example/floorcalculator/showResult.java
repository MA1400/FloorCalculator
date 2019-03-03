package com.example.floorcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showResult extends AppCompatActivity {
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        textViewResult = findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();
        String width = extras.getString("WIDTH");
        String length = extras.getString("LENGTH");

        Double floorReq = Double.parseDouble(width)*Double.parseDouble(length);
        String Result = "Width is " + width + " and " + length + " flooring needed is " + floorReq;
        textViewResult.setText(Result);








    }
}
