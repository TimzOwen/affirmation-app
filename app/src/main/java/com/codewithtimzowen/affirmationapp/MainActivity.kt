package com.codewithtimzowen.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.codewithtimzowen.affirmationapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSize : TextView = findViewById(R.id.textview)

        tvSize.text = DataSource().loadAffirmation().size.toString()
    }
}