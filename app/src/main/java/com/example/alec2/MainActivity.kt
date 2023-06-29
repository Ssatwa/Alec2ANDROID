package com.example.alec2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var add:TextView
    lateinit var dashboard:Button
    lateinit var frag:Button
    lateinit var maps:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add=findViewById(R.id.sum)
        dashboard=findViewById(R.id.button)
        frag=findViewById(R.id.fragments)
        maps=findViewById(R.id.maps)

        add.setOnClickListener {
            val mysum=Intent(this, ImageButtonActivity::class.java)
            startActivity(mysum)
        }
        dashboard.setOnClickListener {
            val dash=Intent(this, DashboardActivity::class.java)
            startActivity(dash)
        }
        frag.setOnClickListener {
            val intent=Intent(this, FragmentActivity::class.java)
            startActivity(intent)
        }
        maps.setOnClickListener {
            val mapp=Intent(this, MapsActivity::class.java)
            startActivity(mapp)
        }

        Handler(Looper.getMainLooper()).postDelayed({
            val intent=Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        },1000)


    }
}