package umn.ac.id.week08_31733;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn8a, btn8b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn8a = findViewById(R.id.btn8a);
        btn8b = findViewById(R.id.btn8b);

        btn8a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeek8a();
            }
        });

        btn8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeek8b();
            }
        });
    }

    public void openWeek8a (){
        Intent intent = new Intent(MainActivity.this, Week08AActivity.class);
        startActivity(intent);
    }

    public void openWeek8b (){
        Intent intent = new Intent(MainActivity.this, Week08BActivity.class);
        startActivity(intent);
    }

}