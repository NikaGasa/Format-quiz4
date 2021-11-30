package com.example.format

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navView = findViewById<BottomNavigationView>(R.id.bottomNavigaionView)

        val controler = findNavController(R.id.nav_host_fragment)

        val appbarconfig = AppBarConfiguration(
            setOf(
                R.id.homefragment,
                R.id.dashboartfragment,
                R.id.notifsfragment,
                R.id.fragmentsetting
            )
        )

        setupActionBarWithNavController(controler,appbarconfig)
        navView.setupWithNavController(controler)

    }
}