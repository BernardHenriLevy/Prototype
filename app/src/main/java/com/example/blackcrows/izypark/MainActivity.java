package com.example.blackcrows.izypark;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {


    Button connec=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Recupere l'interface
        setContentView(R.layout.activity_main);

        // Recuperation des vues#IHM#Dagorret
        connec = (Button) findViewById(R.id.connec);
        //On Attribue a l'objet connec un listener : lors d'un click sur bouton le listener se déclanche
        connec.setOnClickListener(connecListener);

    }




//Methode qui s'execute lors d'un clic sur bouton connec
    private OnClickListener connecListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            //Intent Objet permettant de communiquer entre acti
            Intent ActiviteeSuivante = new Intent(MainActivity.this, OptionDeRecherche.class);
            startActivity(ActiviteeSuivante);
        }
    };
}