package com.eventcamera.eventcamera;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class DisplayExifMetadata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_exif_metadata);

        Intent intent = getIntent();
        String message = intent.getStringExtra(AddPhoto.EXTRA_MESSAGE);

        TextView textView2 = (TextView) findViewById(R.id.picDateView);
        textView2.setText(message);


        File storagePath = Environment.getExternalStorageDirectory();
        File omaKuva = new File(storagePath.toString() + "/101002-beer-garden.jpg");

        String kuvaus = " ";
        if(omaKuva.exists()){
            kuvaus = omaKuva.toString();
        }else{
            kuvaus = "ei tiedossa";
        }

        TextView textView = (TextView) findViewById(R.id.metadataView);
        textView.setText(kuvaus);


    }
}
