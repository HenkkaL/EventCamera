package com.eventcamera.eventcamera;

import android.content.Intent;
import android.media.ExifInterface;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;

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
        //File omaKuva = new File(storagePath.toString() + "/main_900.jpg");
        File omaKuva = new File(storagePath.toString() + "/DCIM/Camera/IMG_20170715_151159.jpg");

        String kuvaus2 = String.valueOf(omaKuva.exists());

        TextView textView = (TextView) findViewById(R.id.metadataView);
        textView.setText(kuvaus2);

        String kuvaus3 = " ";
        String kuvaus6 = " ";

        try{
            ExifInterface exif = new ExifInterface(omaKuva.toString());
            kuvaus3 = "kuvaus:  " + exif.getAttribute(ExifInterface.TAG_X_RESOLUTION);
            //kuvaus6 = exif.toString();
        }catch(IOException e){

        }

        //TextView textView = (TextView) findViewById(R.id.metadataView);
        //textView.setText(kuvaus3);

    }
}
