package com.example.esfahan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        videoView = findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("android.resource://com.example.esfahan/" + R.raw.video1);

        Intent intent = getIntent();
        Integer video = intent.getIntExtra("video", 0);
        if (video == 0) {
            uri = Uri.parse("android.resource://com.example.esfahan/" + R.raw.video1);
        } else if (video == 1) {
            uri = Uri.parse("android.resource://com.example.esfahan/" + R.raw.video2);
        } else if (video == 2) {
            uri = Uri.parse("android.resource://com.example.esfahan/" + R.raw.video3);
        } else if (video == 3) {
            uri = Uri.parse("android.resource://com.example.esfahan/" + R.raw.video4);
        }


        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();

    }
}