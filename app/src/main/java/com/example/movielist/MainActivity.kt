package com.example.movielist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.movieListView)

        val items = arrayOf("Item 1", "Item 2", "Item 3")

        val adapter = ArrayAdapter<String>(this, R.layout.movie_list_item, R.id.movieItemTextView, items)

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            // Handle item click here

            val intent = Intent(this@MainActivity, MovieDetailActivity::class.java)
            // Pass any necessary data to the new activity using intent extras
            //intent.putExtra("selectedItem", listItems[position])
            startActivity(intent)
        }
    }
}