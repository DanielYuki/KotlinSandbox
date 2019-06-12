package br.com.dyuki.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var search = intent.getStringExtra("search")
        var url = "https://www.${search}.com/"

        wbvBrowser.settings.javaScriptEnabled = true
        wbvBrowser.loadUrl(url)

    }
}
