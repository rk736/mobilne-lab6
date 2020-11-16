package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            val layout = findViewById<CoordinatorLayout>(R.id.rootLayout)
            layout.setBackgroundColor(getRandomColor())
        }
    }

    private fun getRandomColor(): Int {
       return Color.argb(Random.nextInt(255),Random.nextInt(255),Random.nextInt(255),Random.nextInt(255))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_first_fragment -> {
                findNavController(R.id.nav_host_fragment).navigate(R.id.FirstFragment)
                true
            }
            R.id.action_second_fragment -> {
                findNavController(R.id.nav_host_fragment).navigate(R.id.SecondFragment)
                true
            }
            R.id.action_third_fragment -> {
                findNavController(R.id.nav_host_fragment).navigate(R.id.ThirdFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
