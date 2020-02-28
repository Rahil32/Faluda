package com.rahil.faluda.fragment


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rahil.faluda.R
import com.rahil.faluda.adapter.HomeRecyclerAdapter

class HomeFragment : Fragment() {

    lateinit var recyclerHome: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val bookList = arrayListOf(
        "Park Terrace",
        "The Great Gatsby",
        "Hot & Chill",
        "Bovary Eats",
        "Unity",
        "Arsalan",
        "Spice Tower",
        "Kichukkhan",
        "Hungery",
        "South Delight"
    )

    lateinit var recyclerAdapter: HomeRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerHome = view.findViewById(R.id.recyclerHome)

        layoutManager = LinearLayoutManager(activity)

        recyclerAdapter = HomeRecyclerAdapter(activity as Context, bookList)

        recyclerHome.adapter = recyclerAdapter

        recyclerHome.layoutManager = layoutManager

        recyclerHome.addItemDecoration(
            DividerItemDecoration(
                recyclerHome.context,
                (layoutManager as LinearLayoutManager).orientation)
        )

        return view
    }



}
