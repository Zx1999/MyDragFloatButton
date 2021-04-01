package com.zhaox.mydragfloatbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DragFloatActionButton button = (DragFloatActionButton) findViewById(R.id.dfa_btn);
        button.setOnClickListener(new DragFloatActionButton.OnClickListener() {
            @Override
            public void onClick() {

            }
        });
    }
}