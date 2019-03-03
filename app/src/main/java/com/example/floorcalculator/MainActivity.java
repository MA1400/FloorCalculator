package com.example.floorcalculator;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonShowResult;
    TextInputEditText roomWidth;
    TextInputEditText roomLength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonShowResult = (Button) findViewById(R.id.buttonShowResult);
        roomWidth = (TextInputEditText) findViewById(R.id.roomWidth);
        roomLength = (TextInputEditText) findViewById(R.id.roomLength);


        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String width = roomWidth.getText().toString();
            String length = roomLength.getText().toString();

            Intent detailActIntent = new Intent(v.getContext(), showResult.class);
            detailActIntent.putExtra("WIDTH", width);
            detailActIntent.putExtra("LENGTH", length);
            startActivity(detailActIntent);


            }
        });

    }

}
