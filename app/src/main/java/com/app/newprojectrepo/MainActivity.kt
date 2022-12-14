package com.app.newprojectrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.newprojectrepo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val repository = Repository()
    private var RC_SIGN_IN = 100
    private var socialEmail: String? = null
     private var socialName: String? = null
    private var ankita:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    private fun init(){

    }

    private fun setObserver(){
    }
}