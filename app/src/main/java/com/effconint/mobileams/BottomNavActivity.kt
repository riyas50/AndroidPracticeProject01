package com.effconint.mobileams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.bottom_home -> {
                    replaceFragment(HomeBottNavFragment())
                    true
                }
                R.id.bottom_search -> {
                    replaceFragment(SearchBottNavFragment())
                    true
                }
                R.id.bottom_add -> {
                    Toast.makeText(this,"Add pressed!",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.bottom_reels-> {
                    replaceFragment(ReelsBottNavFragment())
                    true
                }
                R.id.bottom_profile -> {
                    replaceFragment(ProfileBottNavFragment())
                    true
                }
                else -> false
            }
        }

        replaceFragment(HomeBottNavFragment())
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
        }
}