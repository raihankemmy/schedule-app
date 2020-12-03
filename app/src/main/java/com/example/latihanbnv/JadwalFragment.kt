package com.example.latihanbnv;

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_jadwal_matkul.*

class JadwalFragment : Fragment(){

private var layoutManager:RecyclerView.LayoutManager?=null
private lateinit var adapter: JadwalAdapter
private val list=ArrayList<JadwalItem>()

        override fun onViewCreated(view:View,savedInstanceState:Bundle?){
        super.onViewCreated(view,savedInstanceState)

        list.add(JadwalItem("Senin","Sistem Operasi","Praktikum Basis Data Lanjut","Teori Bahasa dan Automata", "10:00 - 11:40", "13:00 - 14:40","15:30 - 17:10"))
        list.add(JadwalItem("Selasa","Praktikum Sistem Operasi","Pemrograman Berorientasi Objek","", "10:00 - 11:10", "15:00 - 16:40",""))
        list.add(JadwalItem("Rabu","Praktikum Pemrograman Berorientasi Objek","Analisis Algoritma","", "08:00 - 09:40", "10:30 - 12:10",""))
        list.add(JadwalItem("Kamis","Statistik dan Probabilitas","Basis Data Lanjut","Arsitektur dan Organisasi Komputer", "08:00 - 09:40", "13:00 - 14:40","15:00 - 17:30"))
        list.add(JadwalItem("Jumat","Technopreneurship","Praktikum Statistik dan Probabilitas","", "08:00 - 09:40", "10:00 - 11:30",""))

        rv_jadwal_matkul.setHasFixedSize(true)
        rv_jadwal_matkul.layoutManager=LinearLayoutManager(activity)

        val adapter=JadwalAdapter(list)
        rv_jadwal_matkul.adapter=adapter
        }

        override fun onCreateView(
        inflater:LayoutInflater,
        container:ViewGroup?,
        savedInstanceState:Bundle?
        ):View?{
        return inflater.inflate(R.layout.fragment_jadwal_matkul,container,false)
        }
}
