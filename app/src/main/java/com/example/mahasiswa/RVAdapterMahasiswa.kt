package com.example.mahasiswa

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.mahasiswa_list.view.*

class RVAAdapterMahasiswa(private val context: Context, private val arrayList: ArrayList<Mahasiswa>) : RecyclerView.Adapter<RVAAdapterMahasiswa.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.mahasiswa_list,parent,false))
    }

    override fun getItemCount(): Int = arrayList!!.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.view.lbNimList.text = arrayList?.get(position)?.nim
        holder.view.lbNameList.text = "Nama : "+arrayList?.get(position)?.name
        holder.view.lbGenderList.text = "Fakultas : "+arrayList?.get(position)?.fakultas
        holder.view.lbAddressList.text = "Alamat : "+arrayList?.get(position)?.address


    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)

}