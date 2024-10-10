package com.example.a10_10_fragmentdemo

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ColorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment, returns a view
        //Within this view, create an onClickListener
        //When the view is clicked, the background color is randomly set
        return inflater.inflate(R.layout.fragment_color, container, false).apply {
            setOnClickListener{
                setBackgroundColor(Color.parseColor(
                    arrayOf("red", "blue", "cyan", "magenta", "yellow", "green").random()
                ))
            }
        }
    }

}