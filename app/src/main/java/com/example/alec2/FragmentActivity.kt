package com.example.alec2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class FragmentActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var bar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        pager=findViewById(R.id.viewPager)
        tab=findViewById(R.id.tabs)
        bar=findViewById(R.id.toolbar)

        setSupportActionBar(bar)

        //initializing the ViewPagerAdapter

        val adapter = ViewPagerAdapter(supportFragmentManager)

        //add fragment to the list
        adapter.addFragment(SignupFragment(), "Signup")
        adapter.addFragment(LoginFragment(), "Login")
        adapter.addFragment(HomeFragment(), "Home")

        //Adding the Adapter to the Viewpager
        pager.adapter = adapter

        //bind the ViewPager with the TabLayout
        tab.setupWithViewPager(pager)





    }
}