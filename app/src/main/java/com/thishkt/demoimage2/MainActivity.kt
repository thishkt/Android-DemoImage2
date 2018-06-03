package com.thishkt.demoimage2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val dice_imgs = arrayOf(R.drawable.dice_one, R.drawable.dice_two, R.drawable.dice_three, R.drawable.dice_four, R.drawable.dice_five, R.drawable.dice_six)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val r = Random()
        var x = 0
        btn_random.setOnClickListener {
            x = r.nextInt(6)
            iv_dice.setImageResource(dice_imgs[x])
        }
    }
}
