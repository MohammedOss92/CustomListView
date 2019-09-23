package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.muhammed.myapplication7.MyListAdapter
import com.example.muhammed.myapplication7.Persons

class MainActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView1)
        var list = mutableListOf<Persons>()

        list.add(Persons("Muhammed" , "Essa"  ,"Kirkuk" , R.drawable.person1  ))
        list.add(Persons("Ahmed" , "Walid"  ,"Baghdad" , R.drawable.person2  ))
        list.add(Persons("Osama" , "Samir"  ,"Erbil" , R.drawable.person3  ))
        list.add(Persons("Ali" , "Mahmood"  ,"Sulymaniya" , R.drawable.person4  ))
        list.add(Persons("Omer" , "Sami"  ,"Wasit" , R.drawable.person5  ))


        val adapter = MyListAdapter(this,R.layout.my_list,list)

        listView.adapter = adapter
    }
}
