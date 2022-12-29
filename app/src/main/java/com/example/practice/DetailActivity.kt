package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.practice.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(R.layout.activity_detail) {
    private val binding : ActivityDetailBinding by viewBinding()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setData()
    }

    private fun setData() {
        binding.apply {
            val countries =intent.getParcelableExtra<Countries>(EXTRA_DETAIL)
            tvCountryName.text = countries?.name
            tvDetail.text = countries?.detail

            Glide.with(this@DetailActivity)
                .load(countries?.photo)
                .apply(RequestOptions())
                .into(ivCountry)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }
}