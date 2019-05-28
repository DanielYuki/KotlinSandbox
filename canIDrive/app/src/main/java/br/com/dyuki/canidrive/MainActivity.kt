package br.com.dyuki.canidrive

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Enter Action
        btnEnter.setOnClickListener {

            //Filtering...
            if(edtName.text.isNotEmpty()){
                //Receiving Text
                val name = edtName.text.toString()

                //Intent => Screen2
                val intentScreen2 = Intent(this@MainActivity, Screen2Activity::class.java)

                //Load text to intent
                intentScreen2.putExtra("aName", name)

                //Execute Intent
                startActivity(intentScreen2)

            }else{

                Toast.makeText(this, "R u Stupid ?", Toast.LENGTH_LONG).show()
            }

        }
    }
}
