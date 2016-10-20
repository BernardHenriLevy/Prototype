package com.example.blackcrows.izypark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionDeRecherche extends Activity {

   Button parAdresse=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Obligatoire dans une Activité secondaire que l'on accede via une activité
    Intent i = getIntent();
    setContentView(R.layout.activity_option_de_recherche);

    parAdresse =(Button) findViewById(R.id.buttonParAdresse);
    parAdresse.setOnClickListener(parAdresseListener);

}


    private View.OnClickListener parAdresseListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent ActiviteeSuivante = new Intent(OptionDeRecherche.this, AfficherDetailsParking.class);
            startActivity(ActiviteeSuivante);
        }
    };

}