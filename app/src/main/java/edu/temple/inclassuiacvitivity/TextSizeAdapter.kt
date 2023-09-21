package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val textSizes: Array<Int>) : BaseAdapter() {


    override fun getCount(): Int {
        return textSizes.size
    }
//    override fun getCount = textSizes.size

    override fun getItem(p0: Int): Any {
        return textSizes[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        return (getDropDownView(p0, p1, p2) as TextView).apply { this.textSize = 22f }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if (convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)
            textView.setPadding(5,10,0,10)
        }

        textView.text = textSizes[position].toString()
        textView.textSize = textSizes[position].toFloat()
        return textView
    }
}