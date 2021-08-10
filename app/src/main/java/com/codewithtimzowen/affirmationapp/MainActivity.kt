package com.codewithtimzowen.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.RecyclerView
import com.codewithtimzowen.affirmationapp.adapter.ItemAdapter
import com.codewithtimzowen.affirmationapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadAffirmation()

        // initialize affirmation dataset
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.adapter = ItemAdapter(this,myDataset)
        recyclerView.hasFixedSize()
    }
}