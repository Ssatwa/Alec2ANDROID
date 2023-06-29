package com.example.alec2

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable.cancel

class AlertDialogActivity : AppCompatActivity() {

    lateinit var btn:Button
    lateinit var log:TextView
    lateinit var home:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        btn=findViewById(R.id.close)
        log=findViewById(R.id.logout)
        home=findViewById(R.id.hom)


        btn.setOnClickListener {
            var box=AlertDialog.Builder(this)


            box.setMessage("Do you want to close this application?")
            box.setNegativeButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setPositiveButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alert=box.create()
            alert.setTitle("Alec App")
            alert.show()

        }

        log.setOnClickListener {
            var box=AlertDialog.Builder(this)


            box.setMessage("Do you want to close this application?")
            box.setNegativeButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setPositiveButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alert=box.create()
            alert.setTitle("Alec App")
            alert.show()
        }

        home=findViewById(R.id.hom)

        home.setOnClickListener {
            val home= Intent(this, DashboardActivity::class.java)
            startActivity(home)
        }


    }
}