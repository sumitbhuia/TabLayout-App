package com.example.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutapp.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    // This array will display the tab names
    val arrayTabs = arrayOf("Books","Movies","Games")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)


        //creating instance as well as  initializing adapter
        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)

        //3- connecting Adapter
        viewPager.adapter =adapter

        //connecting viewPager with tabLayout
        //this remains constant
        TabLayoutMediator(tabLayout,viewPager){
            tab, position->tab.text=arrayTabs[position]
        }.attach()
    }

}