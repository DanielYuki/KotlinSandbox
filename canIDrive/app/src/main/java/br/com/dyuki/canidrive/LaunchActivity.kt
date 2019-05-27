package br.com.dyuki.canidrive

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        //Splash Screen But Only for 3 Seconds
        Handler().postDelayed({

            //Creating Intent
            val intentMain = Intent(this@LaunchActivity, MainActivity::class.java)
            //Executing Intent
            startActivity(intentMain)
            //Finishing Launcher
            finish()

        }, 5000)

    }
}
