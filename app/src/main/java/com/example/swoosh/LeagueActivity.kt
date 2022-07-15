package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton

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
            selectedLeague = "Men"
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
            selectedLeague = "Women"
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
            selectedLeague = "Co-Ed"
        else
            selectedLeague = ""
    }
}