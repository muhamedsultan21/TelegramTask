package com.example.motionlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.ScrollView
import androidx.annotation.Dimension
import androidx.appcompat.widget.Toolbar
import androidx.core.widget.NestedScrollView
import com.example.motionlayouttest.databinding.ActivityMainBinding
import com.google.android.material.appbar.AppBarLayout
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbar=findViewById<Toolbar>(R.id.toolbar)
        val image=findViewById<CircleImageView>(R.id.circleImage)
        setSupportActionBar(toolbar)
        val nestedScrollView = findViewById<NestedScrollView>(R.id.scrolling)
        nestedScrollView.setOnScrollChangeListener { _, _, scrollY, _, _ ->
            if (scrollY == 0) {
                binding.circleImage.visibility = View.INVISIBLE
                binding.fab.visibility = View.VISIBLE
            } else {
                binding.circleImage.visibility = View.VISIBLE
                binding.fab.visibility = View.INVISIBLE
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return true
    }


}



