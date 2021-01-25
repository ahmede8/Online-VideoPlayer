package com.example.simplevp;
import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.VideoView;
import android.widget.MediaController;
import android.util.Log;
import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

public class videoact extends AppCompatActivity {
    private VideoView videoView;
    private MediaController mediaController;
    String TAG = "VideoPlayer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoact);
        ArrayAdapter<String>adapter;
        Intent x=getIntent();
        String url= x.getStringExtra("movie");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        configureVideoView(url);

    }



    private void configureVideoView(String url)
    {
        final VideoView videoView =
                findViewById(R.id.videoView1);
        videoView.setVideoURI(Uri.parse(url));
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
                                                    @Override
                                                    public void onPrepared(MediaPlayer mp)
                                                    {
                                                        mp.setLooping(true);
                                                        Log.i(TAG, "Duration = " +videoView.getDuration());
                                                    }
        });
        videoView.start();
    }
}