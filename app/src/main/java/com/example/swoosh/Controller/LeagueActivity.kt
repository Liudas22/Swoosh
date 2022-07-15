package com.example.swoosh.Controller

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.Model.Player
import com.example.swoosh.R

class LeagueActivity : AppCompatActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_league)
    }
    fun onLeagueNextClicked(view: View){
        if(player.league == "")
        {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }
        else
        {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }
    }
    fun onMenLeagueClicked(view: View)
    {
        val womenLeagueBtn = findViewById<ToggleButton>(R.id.womenLeagueBtn)
        womenLeagueBtn.isChecked = false
        val coedleagueBtn = findViewById<ToggleButton>(R.id.coedLeagueBtn)
        coedleagueBtn.isChecked = false

        if(player.league == "" || player.league != "men")
            player.league = "men"
        else
            player.league = ""
    }

    fun onWomenLeagueClicked(view: View)
    {
        val coedleagueBtn = findViewById<ToggleButton>(R.id.coedLeagueBtn)
        coedleagueBtn.isChecked = false
        val menLeagueBtn = findViewById<ToggleButton>(R.id.mensLeagueBtn)
        menLeagueBtn.isChecked = false

        if(player.league == "" || player.league != "women")
        {
            player.league = "women"
        }
        else
            player.league = ""
    }

    fun onCoedLeagueClicked(view: View)
    {
        val womenLeagueBtn = findViewById<ToggleButton>(R.id.womenLeagueBtn)
        womenLeagueBtn.isChecked = false
        val menLeagueBtn = findViewById<ToggleButton>(R.id.mensLeagueBtn)
        menLeagueBtn.isChecked = false

        if(player.league == "" || player.league != "co-ed")
            player.league = "co-ed"
        else
            player.league = ""
    }
}