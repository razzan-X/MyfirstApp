package com.example.myfirstapp

import android.app.Activity
import android.content.Intent
import android.content.Intent.*
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       button.setOnClickListener{ contacts()}
        button5.setOnClickListener{ share()}
    }
    
   /* fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun toastFunc(){
        val firstToast = editText.text.toString()
        Toast.makeText(this, "my name is $firstToast", Toast.LENGTH_LONG).show()
    }*/
    companion object{
       const val STARREX = 1
//       const val EXTRA_IMAGE = "com.example.myfirstapp"
   }
    //first syntax of implicit intent
    fun contacts(){
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type="vnd.android.cursor.item/*"
        startActivityForResult(intent, STARREX)
        }
/*    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK){
            imageView3.setImageURI(data?.data)
        }
    }*/
    //second syntax of implicit intent
    fun share(){
        val sendIntent = Intent().apply {
            action = ACTION_SEND_MULTIPLE
            type = "image/*"
//            putExtra(Intent.)
        }
        if (sendIntent.resolveActivity(packageManager) != null){
            startActivity(sendIntent)
        }
    }
}


