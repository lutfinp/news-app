package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            ger.setOnClickListener{
                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            }

            bbc.setOnClickListener{
                startActivity(Intent(this@MainActivity, ThirdActivity::class.java))
            }

            us.setOnClickListener{
                startActivity(Intent(this@MainActivity, FourActivity::class.java))
            }
        }
    }
}