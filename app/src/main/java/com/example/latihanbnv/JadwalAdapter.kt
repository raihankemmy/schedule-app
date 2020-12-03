package com.example.latihanbnv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihanbnv.R
import com.example.latihanbnv.JadwalItem
import kotlinx.android.synthetic.main.item_jadwal.view.*

class JadwalAdapter(private val items: List<JadwalItem>) :
        RecyclerView.Adapter<JadwalAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MainViewHolder =
            MainViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_jadwal, p0, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(p0: MainViewHolder, p1: Int) {
        p0.insert(items.get(p1), p1 + 1)
    }

    inner class MainViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun insert(item: JadwalItem, i: Int) {
            view.tv_hari.text = item.hari
            view.tv_matkul1.text = item.matkul1
            view.tv_matkul2.text = item.matkul2
            view.tv_matkul3.text = item.matkul3
            view.tv_jam1.text = item.jam1
            view.tv_jam2.text = item.jam2
            view.tv_jam3.text = item.jam3
        }
    }
}
