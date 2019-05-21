package br.com.dyuki.simplelogin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //default user password
        var realUser = "dyuki"
        var realPassword = "123"

        //new user and password
        btnSignUp.setOnClickListener {
            realUser = edtTextUser.text.toString()
            realPassword = edtTextPassword.text.toString()
        }

        //checks if the user/password are correct and checks if the textboxes are empty
        btnSignIn.setOnClickListener {
            //handling outputs
            var user = edtTextUser.editableText.toString().trim().toLowerCase()
            var password = edtTextPassword.editableText.toString().trim().toLowerCase()

            if(((user == realUser) && (password == realPassword)) && ((user != "") && (password != ""))){
                //explicit intent -> change screen
                val intent = Intent(this@MainActivity, Main2Activity::class.java)
                intent.putExtra("User", user)
                startActivity(intent)
            }else{
                txvResult.text = "ur stupid"
            }
        }
    }
}
