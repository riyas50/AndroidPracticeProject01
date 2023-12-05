package com.effconint.mobileams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.effconint.mobileams.databinding.ActivityFragmentsBinding
import com.effconint.mobileams.databinding.ActivityMainBinding

class FragmentsActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityFragmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonFragment1 = findViewById<Button>(R.id.fragmentButton1)
        val buttonFragment2 = findViewById<Button>(R.id.fragmentButton2)

        buttonFragment1?.setOnClickListener {
            goToFragment(Fragment1())
        }

        buttonFragment2?.setOnClickListener {
            goToFragment(Fragment2())
        }

    }

    private fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
    }
}