//package com.example.sqlite
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.sqlite.databinding.ActivityMainBinding
//
//private lateinit var binding: ActivityMainBinding
//class RecyclerAdapter : RecyclerView.Adapter<>{
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Hours {
//        val binding = HoursListItemsBinding
//            .inflate(LayoutInflater.from(parent.context), parent, false)
//    }
//
//    override fun onBindViewHolder(holder: ???, position: Int) {
//        TODO("Not yet implemented")
//    }
//
//    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
//    }
//
//}
//
//class Holder(itemView:View) : RecyclerView.ViewHolder(itemView){
//    fun setMemo(memo:Memo){
//        binding = ResultProfileBinding.inflate(LayoutInflater)
//        itemView.textNo.text = "${memo.no}"
//
//
//    }
//}
