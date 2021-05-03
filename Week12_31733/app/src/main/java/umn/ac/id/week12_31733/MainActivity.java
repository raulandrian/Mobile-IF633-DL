package umn.ac.id.week12_31733;

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

    public void tutorialA(View view) {
        Intent intent = new Intent(MainActivity.this, DeteksiSensorActivity.class);
        startActivity(intent);
    }

    public void tutorialB(View view) {
        Intent intent = new Intent(MainActivity.this, PembacaanDataSensorActivity.class);
        startActivity(intent);
    }
}