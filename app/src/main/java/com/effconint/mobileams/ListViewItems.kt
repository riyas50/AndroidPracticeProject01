package com.effconint.mobileams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewItems : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_items)

        val listView: ListView = findViewById(R.id.assetlists)

        var assets = arrayOf("Laptop", "Dock", "Camera", "Monitor", "External Storage")

        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, assets)

        listView.adapter = listAdapter
        
        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this,"You have clicked on : $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}