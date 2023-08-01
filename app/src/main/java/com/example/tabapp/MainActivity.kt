package com.example.tabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.tabapp.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val tabArray = arrayOf("Books","Games","Movies")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout:TabLayout = findViewById(R.id.tablayout)
        val myAdapter = ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )
        viewPager.adapter = myAdapter

        //Connect tablayout with viewpager
        TabLayoutMediator (tabLayout,viewPager){
            tab,position->tab.text = tabArray[position]

        }.attach()

    }
}