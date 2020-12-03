package com.example.latihanbnv

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // kita set default nya Home Fragment
        loadFragment(JadwalFragment())
        // inisialisasi BottomNavigaionView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bnv)
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (menuItem.itemId) {
            R.id.menu_home -> fragment = HomeFragment()
            R.id.menu_profile -> fragment = ProfileFragment()
            R.id.menu_exit -> fragment = JadwalFragment()
        }
        return loadFragment(fragment)
    }
}