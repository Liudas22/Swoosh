package com.example.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.Model.Player
import com.example.swoosh.R

class SkillActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }
    fun onBeginnerBtnClicked(view: View)
    {
        val ballerBtn = findViewById<ToggleButton>(R.id.ballerBtn)
        ballerBtn.isChecked = false;
        if(player.skill == "" || player.skill != "beginner")
            player.skill = "beginner"
        else
            player.skill = ""
    }

    fun onBallerBtnClicked(view: View)
    {
        val beginnerBtn = findViewById<ToggleButton>(R.id.beginnerBtn)
        beginnerBtn.isChecked = false;
        if(player.skill == "" || player.skill != "baller")
            player.skill = "baller"
        else
            player.skill = ""

    }
    fun onSkillFinishClicked(view: View)
    {
        if(player.skill != "")
        {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }
        else
            Toast.makeText(this, "Please select a skill.", Toast.LENGTH_LONG).show()

    }
}