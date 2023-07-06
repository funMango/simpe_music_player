package com.example.simplemusicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AudioPlayerService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_player_service)

        val mPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.chocolate)
        mPlayer?.start()
    }
}