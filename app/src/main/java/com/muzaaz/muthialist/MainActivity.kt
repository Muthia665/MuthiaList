package com.muzaaz.muthialist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView
    private var list:ArrayList<Model> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.recyclerView)

        list.addAll(Data.listData)
        rv.layoutManager = LinearLayoutManager(this)
        val adapterList = AdapterList(list)
        rv.adapter = adapterList
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId
        )
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.menuAbout -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)

                startActivity(intent)
            }
        }
    }
}
