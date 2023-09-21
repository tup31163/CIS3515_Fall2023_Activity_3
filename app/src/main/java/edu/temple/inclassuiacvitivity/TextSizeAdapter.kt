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
        val textView : TextView

        if (p1 != null) {
            textView = p1 as TextView
        } else {
            textView = TextView(context)
            textView.setPadding(5,10,0,10)
        }

        textView.text = textSizes[p0].toString()
        textView.textSize = textSizes[p0].toFloat()
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getDropDownView(position, convertView, parent)
    }
}