package com.xyz.binarycoderslogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_login.setOnClickListener {
            // check if  email is empty/null

            // check if  password is empty/null

            //  check if  password is greater than or equal to 6 chars

            if(et_email.text.isNullOrEmpty()){
                Toast.makeText(this,"Please enter your email id", Toast.LENGTH_SHORT).show();
                return@setOnClickListener
            }

            if(et_password.text.isNullOrEmpty()){
                Toast.makeText(this,"Please enter your password", Toast.LENGTH_SHORT).show();
                return@setOnClickListener
            }

            if(et_password.text.toString().length<6){
                Toast.makeText(this,"Make sure your password is greater than 6 chars", Toast.LENGTH_SHORT).show();
                return@setOnClickListener
            }

            var intent = Intent(this,WelcomeActivity::class.java)
            intent.putExtra("email",et_email.text.toString());
            startActivity(intent);

        }


    }
}
