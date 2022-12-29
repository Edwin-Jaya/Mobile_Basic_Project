package com.example.practice

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.practice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding : ActivityMainBinding by viewBinding()
    private val list : ArrayList<Countries> = arrayListOf()
    private lateinit var listCountriesAdapter: ListCountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val btn = findViewById<Button>(R.id.aboutusButton);

        btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, AboutUsActivity::class.java)
                startActivity(intent)
            }
        })
        binding.rvCountries.setHasFixedSize(true)
        list.addAll(CountriesData.listData)

        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        binding.apply{
            rvCountries.layoutManager = LinearLayoutManager(this@MainActivity)
            listCountriesAdapter = ListCountriesAdapter(list)
            rvCountries.adapter = listCountriesAdapter
        }
    }
}