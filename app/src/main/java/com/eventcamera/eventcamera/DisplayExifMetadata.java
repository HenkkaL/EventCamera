package com.eventcamera.eventcamera;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayExifMetadata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // alkuperäinen
        setContentView(R.layout.activity_display_exif_metadata);
        //setContentView(R.layout.activity_add_photo);

        Intent intent = getIntent();
        String message = intent.getStringExtra(AddPhoto.EXTRA_MESSAGE);

        // alkuperäinen versio
        TextView textView = (TextView) findViewById(R.id.metadataView);
        textView.setText(message);




    }
}
