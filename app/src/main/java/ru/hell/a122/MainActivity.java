package ru.hell.a122;

import androidx.appcompat.app.AppCompatActivity;

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


        Init();
        int randome = (int) (Math.random()*100);

        TextView http = findViewById(R.id.link);
        http.setText("http://myfile.org/"+ String.valueOf(randome));
    }


    public void Init() {
        ImageView back = findViewById(R.id.imageBack);
        ImageView forward = findViewById(R.id.imageForward);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Back", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(MainActivity.this, "Forward", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
