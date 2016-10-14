package com.example.blackcrows.izypark;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends Activity {

    Button map = null;
    Button connec=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Recupere l'interface
        setContentView(R.layout.activity_main);

        // Recuperation des vues#IHM#Dagorret

        map = (Button) findViewById(R.id.map);
        connec = (Button) findViewById(R.id.connec);
        map.setOnClickListener(mapListener);
        connec.setOnClickListener(connecListener);

    }




    private OnClickListener mapListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent ActiviteeSuivante = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(ActiviteeSuivante);
        }
    };

    private OnClickListener connecListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent ActiviteeSuivante = new Intent(MainActivity.this, AfficherDetailsParking.class);
            startActivity(ActiviteeSuivante);
        }
    };
}