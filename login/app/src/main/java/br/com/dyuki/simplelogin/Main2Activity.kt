package br.com.dyuki.simplelogin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.txvResult
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // gets the explicit intent content
        val user = intent.getStringExtra("User")
        txvResult.text = "Welcome $user"

        // go back (aka super useless button)
        btnReturn.setOnClickListener {
            /* u dont need that... just use the finish() function and thats it
            val intentReturn = Intent(this@Main2Activity, MainActivity::class.java)
            startActivity(intentReturn)
             */

            finish()
            //onBackPressed()

            txvResult.text = "Bye ^.^"
        }
    }
}
