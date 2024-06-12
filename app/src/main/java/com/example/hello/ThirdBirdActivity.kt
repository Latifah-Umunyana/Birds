package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityThirdBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener{finish()}
        binding.btnNext3.setOnClickListener{

            val intent = Intent(this,FourthBirdActivity::class.java)
            startActivity(intent)

        }

        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1516233758813-a38d024919c5?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGJpcmRzfGVufDB8fDB8fHww")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView11)

    }
}