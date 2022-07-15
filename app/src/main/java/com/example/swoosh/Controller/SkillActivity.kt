package com.example.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.EXTRA_SKILL
import com.example.swoosh.R

class SkillActivity : AppCompatActivity() {

    var getLeague = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        getLeague = intent.getStringExtra(EXTRA_LEAGUE).toString()
    }
    fun onBeginnerBtnClicked(view: View)
    {
        val ballerBtn = findViewById<ToggleButton>(R.id.ballerBtn)
        ballerBtn.isChecked = false;
        if(skill == "")
            skill = "beginner"
        else
            skill = ""
    }

    fun onBallerBtnClicked(view: View)
    {
        val beginnerBtn = findViewById<ToggleButton>(R.id.beginnerBtn)
        beginnerBtn.isChecked = false;
        if(skill == "")
            skill = "baller"
        else
            skill = ""

    }
    fun onSkillFinishClicked(view: View)
    {
        if(skill != "")
        {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, getLeague)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }
        else
            Toast.makeText(this, "Please select a skill.", Toast.LENGTH_LONG)

    }
}