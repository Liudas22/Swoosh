package com.example.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.R

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_league)
    }
    fun onLeagueNextClicked(view: View){
        if(selectedLeague == "")
        {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }
        else
        {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }
    }
    fun onMenLeagueClicked(view: View)
    {
        val womenLeagueBtn = findViewById<ToggleButton>(R.id.womenLeagueBtn)
        womenLeagueBtn.isChecked = false
        val coedleagueBtn = findViewById<ToggleButton>(R.id.coedLeagueBtn)
        coedleagueBtn.isChecked = false

        if(selectedLeague == "")
            selectedLeague = "men"
        else
            selectedLeague = ""
    }

    fun onWomenLeagueClicked(view: View)
    {
        val coedleagueBtn = findViewById<ToggleButton>(R.id.coedLeagueBtn)
        coedleagueBtn.isChecked = false
        val menLeagueBtn = findViewById<ToggleButton>(R.id.mensLeagueBtn)
        menLeagueBtn.isChecked = false

        if(selectedLeague == "")
            selectedLeague = "women"
        else
            selectedLeague = ""
    }

    fun onCoedLeagueClicked(view: View)
    {
        val womenLeagueBtn = findViewById<ToggleButton>(R.id.womenLeagueBtn)
        womenLeagueBtn.isChecked = false
        val menLeagueBtn = findViewById<ToggleButton>(R.id.mensLeagueBtn)
        menLeagueBtn.isChecked = false

        if(selectedLeague == "")
            selectedLeague = "co-ed"
        else
            selectedLeague = ""
    }
}