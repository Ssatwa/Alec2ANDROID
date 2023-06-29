package com.example.alec2

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class DashboardActivity : AppCompatActivity() {

    lateinit var home:CardView
    lateinit var chat:CardView
    lateinit var profile:CardView
    lateinit var widgets:CardView
    lateinit var settings:CardView
    lateinit var logout:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home=findViewById(R.id.cardHome)
        chat=findViewById(R.id.cardChat)
        profile=findViewById(R.id.cardProfile)
        widgets=findViewById(R.id.cardWidgets)
        settings=findViewById(R.id.cardSettings)
        logout=findViewById(R.id.cardLogout)

        home.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked home", Toast.LENGTH_LONG).show()

            var intent=Intent(this, WebviewActivity::class.java)
            startActivity(intent)
        }
        chat.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked chat", Toast.LENGTH_LONG).show()
        }
        profile.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked profile", Toast.LENGTH_LONG).show()
        }
        widgets.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked widgets", Toast.LENGTH_LONG).show()

            var intent=Intent(this, AlertDialogActivity::class.java)
            startActivity(intent)
        }
        settings.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked settings", Toast.LENGTH_LONG).show()
        }
        logout.setOnClickListener {
            //Toast.makeText(applicationContext, "You have logged out", Toast.LENGTH_LONG).show()

            var box= AlertDialog.Builder(this)


            box.setMessage("Do you want to close this application?")
            box.setNegativeButton("CONTINUE", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setPositiveButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Alec App")
            alert.show()
        }
    }
}