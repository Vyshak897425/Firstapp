package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_dialog.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val nextbutton = findViewById(R.id.button4) as Button

        nextbutton.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        dialog.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.login_dialog, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView)
                .setTitle("Login Form")
            val alertDialog = mBuilder.show()
            mDialogView.dialogloginbtn.setOnClickListener{
                alertDialog.dismiss()

                val name = mDialogView.dialognameet.text.toString()
                val email = mDialogView.dialogemailet.text.toString()
                val password = mDialogView.dialogpasswordet.text.toString()
                info.text = "Name: "+name+"Email: "+email+"password: "+password
            }

            mDialogView.dialogcancelbtn.setOnClickListener{
                alertDialog.dismiss()

            }


        }
    }
}