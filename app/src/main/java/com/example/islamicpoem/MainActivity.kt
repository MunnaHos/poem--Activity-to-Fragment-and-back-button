package com.example.islamicpoem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController


class MainActivity : AppCompatActivity(),Communicat {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val fragmentA = HomeFragment()

        supportFragmentManager.beginTransaction().replace(R.id.container,fragmentA).commit()
*/
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun dataPass(edittext: String) {
        val bundle = Bundle()
        bundle.putString("key",edittext)

        val fragmentB = BackFragment()
        val transition = this.supportFragmentManager.beginTransaction()

        fragmentB.arguments= bundle
        transition.replace(R.id.container,fragmentB)
        transition.addToBackStack(null).commit()

        //.addToBackStack(null) -  not destroy app by back button
    }




}