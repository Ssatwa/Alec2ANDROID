package com.example.alec2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class WebviewActivity : AppCompatActivity() {

    lateinit var webpage:WebView
    lateinit var btn:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)


        webpage=findViewById(R.id.web)
        btn=findViewById(R.id.button)

        webpage.webViewClient= WebViewClient()
        webpage.loadUrl("https://traveltriangle.com/blog/places-to-visit-in-kenya/")
        webpage.settings.javaScriptEnabled=true
        webpage.settings.setSupportZoom(true)



        btn.setOnClickListener {
            val intent=Intent(this, MapActivity::class.java)
            startActivity(intent)

        }
    }
}