package com.effconint.mobileams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class ViewPager2Activity : AppCompatActivity() {

    //step 1
    private lateinit var viewPager: ViewPager2
    private lateinit var pagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager2)


        //step 6 - Set the adapter
        viewPager = findViewById(R.id.viewPager)
        pagerAdapter = ViewPagerAdapter()
        viewPager.adapter = pagerAdapter
    }
}

//step 2
class ViewPagerAdapter : RecyclerView.Adapter<ViewHolder>() {
    //step 4
    private val itemList = listOf("Fantastic Offer","Amazing Deals!!", "Super Deals", "Surprise Deal Bonanza", "Another Quick Deals")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.page_layout, parent, false)
        return ViewHolder(view)
    }

    //step 5 - implement members
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}

//step 3
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private  val pagerText : TextView = itemView.findViewById(R.id.pagerText)

    fun bind(item:String){
        pagerText.text = item
    }
}

