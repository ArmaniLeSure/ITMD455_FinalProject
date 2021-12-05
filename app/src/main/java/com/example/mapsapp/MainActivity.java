package com.example.mapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button maps;
    private Button NoGunZone;
    private Button HomeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView am_textbox = findViewById(R.id.textView2);
        NoGunZone = findViewById(R.id.button2);
        HomeB = findViewById(R.id.button3);
        TextView head_textbox = findViewById(R.id.textView);
        am_textbox.setText("The purpose of this app is to help inform users (concealed carry users, firearm users and law-abiding users) of common sense gun knowledge (currently limited to: Gun legislation & the gun map) The Gun map will take you to a page where certain businesses in Bridgeport Chicago, IL “allows” for the use of concealed carry. [Please note I am not a lawyer but I didn’t see anything at these businesses specifically barring Concealed Carry. Please CCW responsibly and make your best judgement when carrying in certain areas.] ");


        maps = findViewById(R.id.button);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //setContentView(R.layout.activity_maps);
                Intent intent = new Intent(MainActivity.this,MapsActivity.class); //(Source, Destination)
                startActivity(intent);
            }

        });

        NoGunZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //setContentView(R.layout.activity_maps);
                am_textbox.setText("One of the general rules of CCW is knowing where you can and cannot carry and those areas below HAVE NO EXCEPTIONS:\n" +
                        "Federal and State Buildings (Post Office, Courthouses)\n" +
                        "Airports\n" +
                        "College or Academic Institutions (College, Library)\n" +
                        "Bars or Restaurants which sales account for more than 50% alcohol\n" +
                        "Public areas (Public parks, Transit)\n" +
                        "Just to name about 80% of them, there are a few more.\n");
                NoGunZone.setText("About This App");
                head_textbox.setText("No Gun Zones");





            }

        });

        HomeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                am_textbox.setText("The purpose of this app is to help inform users (concealed carry users, firearm users and law-abiding users) of common sense gun knowledge (currently limited to: Gun legislation & the gun map) The Gun map will take you to a page where certain businesses in Bridgeport Chicago, IL “allows” for the use of concealed carry. [Please note I am not a lawyer but I didn’t see anything at these businesses specifically barring Concealed Carry. Please CCW responsibly and make your best judgement when carrying in certain areas.] ");
                NoGunZone.setText("No Gun Zones");
                head_textbox.setText("About This App");


            }

        });


    }

}
