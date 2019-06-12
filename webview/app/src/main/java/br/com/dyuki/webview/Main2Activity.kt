package br.com.dyuki.webview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnGo.setOnClickListener {
            if (edtBrowse.editableText.toString().trim().isNotEmpty()){
                var search = edtBrowse.editableText.toString()
                val intent = Intent(this@Main2Activity, MainActivity::class.java)
                intent.putExtra("search",search)
                startActivity(intent)
            }

        }
    }
}