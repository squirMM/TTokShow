package com.example.test_ttokshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int count=0;
    boolean visible =false;
    ImageButton open_bu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        open_bu=(ImageButton)findViewById(R.id.open);
        //open_bu.setOnClickListener(this::onClick) ;
    }
    public void onClick(View view) {
        count++;
        if(!visible)
        {
            LinearLayout inflatedLayout = (LinearLayout)findViewById(R.id.inflatedlayout);
            LayoutInflater inflater =  (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(R.layout.inflated_layout, inflatedLayout);
            visible = true;
        }
    }
}
