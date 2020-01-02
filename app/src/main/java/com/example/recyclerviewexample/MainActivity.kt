package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewItems.layoutManager = LinearLayoutManager(this)
        val items = ArrayList<Item>()
        items.add(Item("Item 1", "This is the first added item"))
        items.add(Item("Item 2", "This is the second added item"))
        items.add(Item("Item 3", "This is the third added item"))
        recyclerViewItems.adapter = ItemsAdapter(items)
    }
}
