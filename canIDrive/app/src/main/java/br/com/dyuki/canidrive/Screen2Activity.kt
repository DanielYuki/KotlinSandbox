package br.com.dyuki.canidrive

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        //Retrieve String from MainActivity and Using it
        val name = intent.getStringExtra("aName")
        txvName.text = "Welcome $name"

        //Age Array => (Spinner Content)
        val ageArray = arrayListOf("Ages:", 1)

        //Creating Spinner Content
        for(anAge in 2..100){
            //Adding Content to Array
            ageArray.add(anAge)
        }

        //Setting up Adapted Array for Spinner
        val adaptedArray = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ageArray)

        //Insert Adapted Array => Spinner
        spnAges.adapter = adaptedArray
    }
}
