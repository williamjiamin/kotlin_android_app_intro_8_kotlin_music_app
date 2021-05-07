package com.lexueoude.williammusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
//import kotlinx.android.synthetic.main.activity_main.*

import com.lexueoude.williammusic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMainBinding

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val array :Array<String> = arrayOf(
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20"
        )

//        BaseAdapter
//        ArrayAdapter
//        Custom Adapter
//        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
//        list_view.adapter = adapter

        val arrayList : ArrayList<Data> = ArrayList()
        arrayList.add(Data("0《乐学偶得之歌》","audio_000"))
        arrayList.add(Data("1《我爱你Kotlin》","audio_001"))
        arrayList.add(Data("2《Java还是要学》","audio_002"))
        arrayList.add(Data("3《Python是个好语言》","audio_003"))
        arrayList.add(Data("4《爱你C语言》","audio_004"))
        arrayList.add(Data("5《难忘JS》","audio_005"))
        arrayList.add(Data("6《我不是VBA之歌》","audio_006"))
        arrayList.add(Data("7《C#，夏普-man！》","audio_007"))
        arrayList.add(Data("8《汇编！汇编！！！》","audio_008"))
        arrayList.add(Data("9《一千个学习的理由》","audio_009"))
        arrayList.add(Data("10《乐学偶得荣誉出品》","audio_010"))


        val customAdapter : CustomAdaptor = CustomAdaptor(arrayList)
        binding.listView.adapter = customAdapter

    }


}