package umn.ac.id.uts_31733;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button, button2;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonLogin);
        button2 = findViewById(R.id.buttonProfile);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();
            }
        });
   }

   public void openLoginActivity(){
       Intent intent = new Intent(MainActivity.this, LoginActivity.class);
       startActivity(intent);
   }

   public void openProfileActivity() {
       Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
       startActivity(intent);
   }

}