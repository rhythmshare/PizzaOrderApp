package com.example.pizzaorderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.pizzaorderapp.databinding.ActivityMainBinding

class ViewStoreDataActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewStoreDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(R.layout.activity_view_store_data)
    }
}