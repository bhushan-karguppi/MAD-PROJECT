package com.example.quize;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText nametext;
    private DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nametext = findViewById(R.id.editName);
        Button startbutton = findViewById(R.id.button);
        Button aboutbutton = findViewById(R.id.button2);
        databaseHelper = new DatabaseHelper(this);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nametext.getText().toString();
                Intent intent = new Intent(getApplicationContext(),
                        QuestionsActivity.class);
                intent.putExtra("myname", name);
                startActivity(intent);
            }
        });
        aboutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        DeveloperActivity.class);
                startActivity(intent);
            }
        });
    }
}
