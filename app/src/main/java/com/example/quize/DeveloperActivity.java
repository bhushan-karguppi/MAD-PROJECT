package com.example.quize;
import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class DeveloperActivity extends AppCompatActivity {
    Button btnRestart;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        btnRestart = (Button) findViewById(R.id.button4);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new
                        Intent(getApplicationContext(),MainActivity.class);
                startActivity(in2);
            }
        });
    }
}

