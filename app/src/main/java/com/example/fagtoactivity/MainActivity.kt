package com.example.fagtoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonOpen : Button = findViewById(R.id.btn_openFragment)
            ButtonOpen.setOnClickListener {
                val myFragment = MyFragment()
                val fragment: Fragment? =
                    supportFragmentManager.findFragmentByTag(MyFragment::class.java.simpleName)
                if (fragment !is MyFragment){
                    supportFragmentManager.beginTransaction()
                        .add(R.id.LinearFragment_Container, myFragment, MyFragment::class.java.simpleName)
                        .commit()

                }
                ButtonOpen.visibility = View.GONE
            }
    }
}