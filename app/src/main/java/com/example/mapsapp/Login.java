package com.example.mapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;
    private int count = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        Login = findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Username.getText().toString().equals("Root") && Password.getText().toString().equals("1234")){
                    Intent intent = new Intent(Login.this, MainActivity.class); //(Source, Destination)
                    startActivity(intent);
                    //Toast.makeText(Login.this,"Redirecting...", Toast.LENGTH_LONG).show();
                    count = 3;
                }
                else{
                    count = count - 1;
                    Toast.makeText(Login.this,"Wrong credentials. You have " + count + " attempts left.", Toast.LENGTH_LONG).show();
                    if(count == 0){
                        Login.setEnabled(false);
                    }

                }




            }
        });
    }
}
