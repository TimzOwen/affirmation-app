package com.codewithtimzowen.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.codewithtimzowen.affirmationapp.adapter.ItemAdapter
import com.codewithtimzowen.affirmationapp.data.DataSource

class MainActivity : AppCompatActivity() , ItemAdapter.OnItemClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadAffirmation()

        // initialize affirmation dataset
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.adapter = ItemAdapter(this,myDataset,this)
        recyclerView.hasFixedSize()


    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, "Clicked image $position", Toast.LENGTH_SHORT).show()
    }
}