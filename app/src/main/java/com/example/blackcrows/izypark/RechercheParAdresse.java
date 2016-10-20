package com.example.blackcrows.izypark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RechercheParAdresse extends Activity {
    public final static String EXTRA_MESSAGE =
            "Parking Glain";
    EditText val1 = null;
    Button next = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        setContentView(R.layout.activity_recherche_par_adresse);
        val1 =(EditText) findViewById(R.id.adresseEntree);
        next =(Button) findViewById(R.id.boutonRechercher);
        next.setOnClickListener(nextListener);
    }

    private OnClickListener nextListener= new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i1 = new Intent( RechercheParAdresse.this, ResultatsParAdresse.class );
            i1.putExtra(EXTRA_MESSAGE, val1.getText().toString());
            startActivityForResult(i1, 0);


        }
    };


}
