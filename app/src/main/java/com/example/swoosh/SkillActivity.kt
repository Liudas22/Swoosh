package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : AppCompatActivity() {

    var getLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        getLeague = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(getLeague)
    }
}