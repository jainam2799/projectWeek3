package com.ceng319.projectw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hover(View view) {
        Toast.makeText(getApplicationContext(), "Hello,this is my first APP", Toast.LENGTH_SHORT).show();
    }
}
