package br.com.dyuki.photocapture

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Request Code
    val requestCam = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCamera.setOnClickListener {
            //Camera Intent
            val callCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            //Implicit Intent
            startActivityForResult(callCamera, requestCam)
        }
    }

    //Use Photo Captured
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == requestCam){
            if (resultCode == Activity.RESULT_OK && data != null){
                imgResult.setImageBitmap(data.extras.get("data") as Bitmap)
            }
        }
    }
}
