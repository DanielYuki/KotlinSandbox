package br.com.dyuki.canidrive

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        //Retrieve String from MainActivity and Using it
        val name = intent.getStringExtra("aName")
        txvName.text = "Welcome $name"

        //Age Array => (Spinner Content)
        val ageArray = arrayListOf("Ages", 1)

        //Creating Spinner Content
        for (anAge in 2..100) {
            //Adding Content to Array
            ageArray.add(anAge)
        }

        //Setting up Adapted Array for Spinner
        val adaptedArray = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ageArray)

        //Insert Adapted Array => Spinner
        spnAges.adapter = adaptedArray as SpinnerAdapter?

        //Verify and Validator
        btnVerify.setOnClickListener {
            val ageSelected = spnAges.selectedItem

            if (ageSelected != String){
                ageSelected as Int
                if (ageSelected >= 18){
                    txvResult.text = "Deja Vu"
                }else if (ageSelected == 100){
                    txvResult.text = "Rly ???"
                }else{
                    txvResult.text = "No Deja Vu"
                }
            }else{
                Toast.makeText(this, "R u Stupid ?", Toast.LENGTH_LONG).show()
            }
        }



        /*
        GAMBIARRA 10000
        var response = ""

        //Select Spinner Item
        spnAges.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (ageArray[position] < 18) {
                    response = "U cant do that"
                }else if(ageArray[position] == 100){
                    response = "Deja vu\n" +
                            "I've just been in this place before\n" +
                            "Higher on the street\n" +
                            "And I know it's my time to go\n" +
                            "Calling you and the search is mystery\n" +
                            "Standing on my feet\n" +
                            "It's so hard when I try to be me uoooh!\n" +
                            "Deja vu"
                }else{
                    response = "Just Do It!!!"
                }
            }
        }

        //Show Response
        btnVerify.setOnClickListener {
            txvResult.text = response
        }

        */
    }

}