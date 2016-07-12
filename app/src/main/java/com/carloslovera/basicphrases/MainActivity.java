package com.carloslovera.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view){

            // getting the button id
        int button_id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(button_id);

        int audioId = getResources().getIdentifier(ourId, "raw", "com.carloslovera.basicphrases");

        // creating the media player
        MediaPlayer mplayer = MediaPlayer.create(this, audioId);
        mplayer.start();


       // Log.i("Tapped: ", ourId);

    }

}
