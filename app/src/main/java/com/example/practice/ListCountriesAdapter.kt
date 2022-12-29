package com.example.practice

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.practice.databinding.ItemRowCountriesBinding

class ListCountriesAdapter(private val list : ArrayList<Countries>) :
    RecyclerView.Adapter<ListCountriesAdapter.ListViewHolder>() {
    inner class ListViewHolder(private val binding : ItemRowCountriesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(countries: Countries){
            with(binding){
                tvCountryName.text=countries.name
                tvCountryDetail.text=countries.detail
                Glide.with(itemView.context)
                    .load(countries.photo)
                    .apply(RequestOptions().override(250,250))
                    .into(tvCountry)
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DETAIL, countries)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowCountriesBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}