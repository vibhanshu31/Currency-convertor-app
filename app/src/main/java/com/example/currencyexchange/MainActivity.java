package com.example.currencyexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){

        EditText amount = (EditText) findViewById(R.id.amount);
        double a = Float.parseFloat(amount.getText().toString());        //convert string to float
        a = 71.57*a;

        Toast.makeText( this, "Rupee = " + a, Toast.LENGTH_SHORT).show();

    }
}
