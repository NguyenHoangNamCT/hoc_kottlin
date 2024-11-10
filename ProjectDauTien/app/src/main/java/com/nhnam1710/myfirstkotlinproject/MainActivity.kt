package com.nhnam1710.myfirstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nhnam1710.myfirstkotlinproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Khai báo một biến lateinit cho View Binding
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo binding trong onCreate
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);// Sử dụng binding.root để setContentView thay vì gọi setContentView(R.layout.activity_main)

        var a : String = "";

    }
}