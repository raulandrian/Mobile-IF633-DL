package umn.ac.id.week10_31733;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openA(View view){
        Intent intent = new Intent(MainActivity.this, Week10AActivity.class);
        startActivity(intent);
    }

    public void openB(View view){
        Intent intent = new Intent(MainActivity.this, Week10BActivity.class);
        startActivity(intent);
    }

    public void openC(View view){
        Intent intent = new Intent(MainActivity.this, Week10CActivity.class);
        startActivity(intent);
    }
}