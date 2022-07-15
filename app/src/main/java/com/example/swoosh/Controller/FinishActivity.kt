package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.EXTRA_SKILL
import com.example.swoosh.R

var getLeague = ""
var getSkill = ""

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        getLeague = intent.getStringExtra(EXTRA_LEAGUE).toString()
        getSkill = intent.getStringExtra(EXTRA_SKILL).toString()

        val searchLeagueTxt = findViewById<TextView>(R.id.searchLeagueTxt)
        searchLeagueTxt.text = "Looking for $getLeague $getSkill league near you..."
    }
}