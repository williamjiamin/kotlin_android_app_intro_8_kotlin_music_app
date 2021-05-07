package com.lexueoude.williammusic

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdaptor(var arrayList: ArrayList<Data>) : BaseAdapter() {
    override fun getCount() = arrayList.size

    override fun getItem(position: Int) = arrayList[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context
        var rowview: View? = convertView
        var mediaPlayer: MediaPlayer? = null

        val inflater: LayoutInflater =
            context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        if (rowview == null)
            rowview = inflater.inflate(R.layout.item_list, parent, false)

        val item = arrayList[position]
        val numberTextView = rowview?.findViewById<TextView>(R.id.number_text_view)
        numberTextView?.text = item.number

        val audioImageView = rowview?.findViewById<ImageView>(R.id.audio_image_view)
        audioImageView?.setOnClickListener {
            if (mediaPlayer == null)
                mediaPlayer = MediaPlayer.create(
                    context,
                    context.resources.getIdentifier(item.audioFileName, "raw", context.packageName)
                )

            mediaPlayer?.start()

        }

        return rowview!!


//        val context = parent?.context
//        val inflater: LayoutInflater =
//            context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//
//        val rowView: View = inflater.inflate(R.layout.item_list, parent, false)
//
//        val item = arrayList[position]
//
//        val numberTextView = rowView.findViewById<TextView>(R.id.number_text_view)
//        numberTextView.text = item.number
//
//        val audioImagaView = rowView.findViewById<ImageView>(R.id.audio_image_view)
//        audioImagaView.setOnClickListener {
//
//            val mediaPlayer = MediaPlayer.create(
//                context,
//                context.resources.getIdentifier(item.audioFileName, "raw", context.packageName)
//            )
//
//            mediaPlayer.start()
//
//
//        }
//
//
//        return rowView

    }

}