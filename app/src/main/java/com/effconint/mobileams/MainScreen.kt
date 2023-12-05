package com.effconint.mobileams

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlin.math.exp

//Tutorial Video link: https://www.youtube.com/watch?v=cDo7KM4DP94&t=4514s&ab_channel=AndroidKnowledge

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()

        setContentView(R.layout.activity_main_screen)

        //Explicit intent
        val loginButton = findViewById<Button>(R.id.appLoginButton)

        loginButton.setOnClickListener {
            val explicitIntent = Intent(this, MainActivity::class.java)
            startActivity(explicitIntent)
            //finish()
        }

        //Implicit intent
        val url = "https://www.google.ae"
        val implicitIntentButton = findViewById<Button>(R.id.appExternalIntButton)

        implicitIntentButton.setOnClickListener {
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicitIntent)
            //finish()
        }

        //Open list view activity
        val listOpenListViewButton = findViewById<Button>(R.id.openListView)

        listOpenListViewButton.setOnClickListener {
            val listIntend = Intent(this, ListViewItems::class.java)
            startActivity(listIntend)
            //finish()
        }

        //Recycler View activity

        val recyclerViewButton = findViewById<Button>(R.id.openRecycleView)

        recyclerViewButton.setOnClickListener {
            val explicitIntentRecycler = Intent(this,RecyclerViewActivity::class.java)
            startActivity(explicitIntentRecycler)
            //finish()
        }

        //spinner page
        val spinnerPageButton = findViewById<Button>(R.id.openSpinnerViewButton)

        spinnerPageButton.setOnClickListener {
            val explicitIntent = Intent(this,SpinnerActivity::class.java)
            startActivity(explicitIntent)
            //finish()
        }

        //show dialog box
        val showButton : Button = findViewById(R.id.showDialogButton)

        showButton.setOnClickListener {
            showAlertDialog()
        }

        //show fragment activity
        val showFragmentButtonA : Button = findViewById(R.id.startFragmentActivityButton)

        showFragmentButtonA.setOnClickListener {
            val newExplicitIntent = Intent(this, FragmentsActivity::class.java)
            startActivity(newExplicitIntent)
        }

        //show view pager
        val showViewPagerButton : Button = findViewById(R.id.viewPagerActivityButton)

        showViewPagerButton.setOnClickListener {

            val explicitIntent = Intent(this, ViewPager2Activity::class.java)
            startActivity(explicitIntent)
        }

        //show nav drawer activity
        val navDrawerAcitivityButton : Button = findViewById(R.id.navigationDrawerActivityButton)

        navDrawerAcitivityButton.setOnClickListener {
            val explicitIntent = Intent(this, NavigationDrawerActivity::class.java)
            startActivity(explicitIntent)
        }

        //show bottom nav activity
        val bottomNavButton : Button = findViewById(R.id.bottomNavActivityButton)
        bottomNavButton.setOnClickListener{
            val explicitIntent = Intent(this, BottomNavActivity::class.java)
            startActivity(explicitIntent)
        }

    }

    private fun showAlertDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("MobileAMS")
            .setMessage("Do you want to uninstall the app?")
            .setPositiveButton("Yes"){ _, _ ->
                Toast.makeText(this,"The app is successfully uninstalled",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ dialog, _ ->
                dialog.dismiss()
            }
        var alertDialog : AlertDialog = builder.create()
        alertDialog.show()
    }
}