package com.app.newprojectrepo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.newprojectrepo.R
import com.app.newprojectrepo.utils.UserSharedPrefrences

class SplashActivity : AppCompatActivity() {
    private lateinit var userSharedPreferences: UserSharedPrefrences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //     userSharedPreferences= UserSharedPrefrences

    }
}