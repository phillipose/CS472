package com.example.dinnerdecider


import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
    
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var llist = ArrayList<String>(arrayListOf("Hamburger","Pizza","Mexican","American","Chinese"))
   fun click (view : View){
       textView2.text = llist.random()

   }

    fun addClick(view: View) {

        llist.add("${addText.text}")


    }
}