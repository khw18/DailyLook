package com.example.dailylook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dailylook.databinding.ActivityAnotherBinding


class AnotherActivity : AppCompatActivity() {

    lateinit var binding: ActivityAnotherBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnotherBinding.inflate(layoutInflater)
        setContentView(binding.root)



//        var receiveData1 = intent.getStringExtra("data1")
//        var receiveData2 = intent.getIntExtra("data2", 0)

        var receiveData1 = intent.getStringExtra("image_name")
        var receiveName = intent.getStringExtra("name")
        var receiveDest = intent.getStringExtra("dest")

        if (receiveData1 != "") {
            val resourceId =
                resources.getIdentifier(receiveData1, "drawable", packageName)

            if (resourceId > 0) {
                binding.imageView1.setImageResource(resourceId)
                binding.textView1.setText(receiveName)
                binding.textView22.setText(receiveDest)
            } else {
                binding.imageView1.setImageResource(R.mipmap.ic_launcher_round)
            }
        } else {
            binding.imageView1.setImageResource(R.mipmap.ic_launcher_round)
        }

    }
}