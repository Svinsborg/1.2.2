package ru.hell.a122;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        int randome = (int) (Math.random()*100);

        TextView http = findViewById(R.id.link);
        String text = getString(R.string.wwwwAdres, randome);
        http.setText(text);
    }


    public void init() {
        ImageView back = findViewById(R.id.imageBack);
        ImageView forward = findViewById(R.id.imageForward);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);

                /*Toast.makeText(MainActivity.this, "Back", Toast.LENGTH_SHORT).show();*/
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

                /*Toast.makeText(MainActivity.this, "Forward", Toast.LENGTH_SHORT).show();*/
            }
        });
    }
}
