package com.latiihan_chapter3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.latiihan_chapter3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d("MainActivity","onCreate aktif")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart aktif")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume aktif")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause aktif")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop aktif")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart aktif")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy aktif")
    }

}