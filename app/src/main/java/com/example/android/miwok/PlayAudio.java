package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by chris on 05-03-17.
 */

public final class PlayAudio {

    private MediaPlayer mediaPlayer;

    public void playAudio(Context context, ListView listView) {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = (Word) parent.getItemAtPosition(position);
                int rawAudioResourceId = word.getAudioResourceId();

//                mediaPlayer = MediaPlayer.create(context, rawAudioResourceId);
                mediaPlayer.start();
            }
        });
    }

}
