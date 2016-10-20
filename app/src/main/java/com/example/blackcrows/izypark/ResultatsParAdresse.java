/*TAF :
Ajouter bd
Recuperer infos parking dont la latitude et longitude correspondent au  rayon de recherche
Comprendre et ajouter liste qui contient les parking correspondants

*/
package com.example.blackcrows.izypark;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class ResultatsParAdresse extends Activity {
    TextView result=null;
    double latitude=0;
    double longitude=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultats_par_adresse);

        final Intent intent = getIntent();
        //On recupere le message contenu dans l'intent qui ici contient l'adresse entrée precedement
        String message = intent.getStringExtra(RechercheParAdresse.EXTRA_MESSAGE);

        getLocationFromAddress(getApplicationContext(),message);
        result = (TextView)findViewById(R.id.latResultat);
        result.setText(String.valueOf(latitude));

        result = (TextView)findViewById(R.id.lngResultat);
        result.setText(String.valueOf(longitude));
    }


    public LatLng getLocationFromAddress(Context context, String strAddress) {

        Geocoder coder = new Geocoder(context);
        List<Address> address;
        LatLng p1 = null;

        try {
            address = coder.getFromLocationName(strAddress, 5);
            if (address == null) {
                return null;
            }
            Address location = address.get(0);
            location.getLatitude();
            location.getLongitude();

            p1 = new LatLng(location.getLatitude(), location.getLongitude());
            latitude=p1.latitude;
            longitude=p1.longitude;

        } catch (Exception ex) {

            ex.printStackTrace();
        }
        return p1;
    }
}


