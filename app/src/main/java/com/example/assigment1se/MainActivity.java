package com.example.assigment1se;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText =findViewById(R.id.editTextTextPersonName);
        Button btn= findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= editText.getText().toString();
                TextView textView=findViewById(R.id.textView2);
                textView.setText("Hello, " + name);

            }


        });
    }
}