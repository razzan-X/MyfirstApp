package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        button2.setOnClickListener{sendMessage()}
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        textView.apply {
            text = message
        }
    }
    private fun sendMessage(){
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
