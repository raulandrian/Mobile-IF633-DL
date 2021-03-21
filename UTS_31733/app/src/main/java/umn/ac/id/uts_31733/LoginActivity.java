package umn.ac.id.uts_31733;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText loginText, passwordText;
    Button btnLogin;
    //Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginText = findViewById(R.id.Email);
        passwordText = findViewById(R.id.Pass);

        btnLogin = findViewById(R.id.buttonMusic);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = loginText.getText().toString();
                String password = passwordText.getText().toString();

                if(username.equals("uasmobile") && (password.equals("uasmobilegenap"))) {
                    Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                    openMusicActivity();
                    //TampilDialog();
                }else{
                    Toast.makeText(LoginActivity.this, "Invalid Pass", Toast.LENGTH_SHORT).show();
                }
            }
        });

        getSupportActionBar().setTitle("Login Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openMusicActivity(){
        Intent intent = new Intent(LoginActivity.this, MusicActivity.class);
        startActivity(intent);
    }
}