package br.com.dyuki.simplelogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //default user password
        var user = "dyuki"
        var password = "123"

        //new user and password
        btnSignUp.setOnClickListener {
            user = edtTextUser.text.toString()
            password = edtTextPassword.text.toString()
        }

        //checks if the user/password are correct and checks if the textboxes are empty
        btnSignIn.setOnClickListener {
            if(((edtTextUser.text.toString() != "") && (edtTextPassword.text.toString() != "")) && ((edtTextUser.text.toString() == user) && (edtTextPassword.text.toString() == password)) ){
                txvResults.text = "welcome"
            }else{
                txvResults.text = "ur stupid"
            }
        }
    }
}
