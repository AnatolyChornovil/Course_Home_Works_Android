package com.triare.home_work_071

import android.content.ClipData
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_071, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        val radio1 = findViewById<RadioButton>(R.id.radioButton1)
        val radio2 = findViewById<RadioButton>(R.id.radioButton2)

        menu?.setGroupVisible(R.id.hommed, radio1.isChecked)
        menu?.setGroupVisible(R.id.wild, radio2.isChecked)

        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var imgMain = findViewById<ImageView>(R.id.imgMain)
        var nameTxt = findViewById<TextView>(R.id.nameTxt)
        var aboutTxt = findViewById<TextView>(R.id.aboutTxt)

        when (item.itemId) {
            R.id.hduck -> {
                imgMain.setImageResource(R.drawable.hduck_imj)
                nameTxt.setText(R.string.hduck)
                aboutTxt.setText(R.string.aboutHduck)
            }
            R.id.hgoose -> {
                imgMain.setImageResource(R.drawable.hgoose_imj)
                nameTxt.setText(R.string.hgoose)
                aboutTxt.setText(R.string.aboutHgoose)
            }
            R.id.hchick -> {
                imgMain.setImageResource(R.drawable.hchick_imj)
                nameTxt.setText(R.string.hchick)
                aboutTxt.setText(R.string.aboutHchick)
            }
            R.id.hpig -> {
                imgMain.setImageResource(R.drawable.hpig_imj)
                nameTxt.setText(R.string.hpig)
                aboutTxt.setText(R.string.aboutHpig)
            }
            R.id.hcow -> {
                imgMain.setImageResource(R.drawable.hcow_imj)
                nameTxt.setText(R.string.hcow)
                aboutTxt.setText(R.string.aboutHcow)
            }
            R.id.hsheep -> {
                imgMain.setImageResource(R.drawable.hsheep_imj)
                nameTxt.setText(R.string.hsheep)
                aboutTxt.setText(R.string.aboutHsheep)
            }
            R.id.hcat -> {
                imgMain.setImageResource(R.drawable.hcat_imj)
                nameTxt.setText(R.string.hcat)
                aboutTxt.setText(R.string.aboutHcat)
            }
            R.id.hdog -> {
                imgMain.setImageResource(R.drawable.hdog_imj)
                nameTxt.setText(R.string.hdog)
                aboutTxt.setText(R.string.aboutHdog)
            }
            R.id.hfish -> {
                imgMain.setImageResource(R.drawable.hfish_imj)
                nameTxt.setText(R.string.hfish)
                aboutTxt.setText(R.string.aboutHfish)
            }
            R.id.wduck -> {
                imgMain.setImageResource(R.drawable.wduck_imj)
                nameTxt.setText(R.string.wduck)
                aboutTxt.setText(R.string.abouWduck)
            }
            R.id.wgoose -> {
                imgMain.setImageResource(R.drawable.wgoose_imj)
                nameTxt.setText(R.string.wgoose)
                aboutTxt.setText(R.string.aboutWgoose)
            }
            R.id.wchick -> {
                imgMain.setImageResource(R.drawable.wchick_imj)
                nameTxt.setText(R.string.wchick)
                aboutTxt.setText(R.string.aboutWchick)
            }
            R.id.wpig -> {
                imgMain.setImageResource(R.drawable.wpig_imj)
                nameTxt.setText(R.string.wpig)
                aboutTxt.setText(R.string.aboutWpig)
            }
            R.id.wcow -> {
                imgMain.setImageResource(R.drawable.wcow_imj)
                nameTxt.setText(R.string.wcow)
                aboutTxt.setText(R.string.aboutWcow)
            }
            R.id.wsheep -> {
                imgMain.setImageResource(R.drawable.wsheep_imj)
                nameTxt.setText(R.string.wsheep)
                aboutTxt.setText(R.string.aboutWsheep)
            }
            R.id.wcat -> {
                imgMain.setImageResource(R.drawable.wcat_imj)
                nameTxt.setText(R.string.wcat)
                aboutTxt.setText(R.string.aboutWcat)
            }
            R.id.wdog -> {
                imgMain.setImageResource(R.drawable.wdog_imj)
                nameTxt.setText(R.string.wdog)
                aboutTxt.setText(R.string.aboutWdog)
            }
            R.id.wfish -> {
                imgMain.setImageResource(R.drawable.wfish_imj)
                nameTxt.setText(R.string.wfish)
                aboutTxt.setText(R.string.aboutWfish)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}