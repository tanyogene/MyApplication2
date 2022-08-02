package com.example.myapplication2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//Practical 4
        setListeners()

//Practical 5
        setListeners2()

    }

    //Practical 4
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.boxOne)
        val boxTwoText: TextView = findViewById(R.id.boxTwo)
        val boxThreeText = findViewById<TextView>(R.id.boxThree)
        val boxFourText = findViewById<TextView>(R.id.boxFour)
        val boxFiveText = findViewById<TextView>(R.id.boxFive)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText
        )

        for (item in clickableViews){
            item.setOnClickListener{ makeColoured(it) }
        }
    }

    private fun  makeColoured(view: View){

        when(view.id){
        R.id.boxOne -> view.setBackgroundColor(Color.BLUE)
        R.id.boxTwo -> view.setBackgroundColor(Color.GREEN)
        R.id.boxThree -> view.setBackgroundColor(Color.CYAN)
        R.id.boxFour -> view.setBackgroundColor(Color.MAGENTA)
        R.id.boxFive -> view.setBackgroundColor(Color.YELLOW)
        else -> view.setBackgroundColor(Color.GRAY)
        }

    }

    //Practical 5
    private fun setListeners2(){
        val boxOneText = findViewById<TextView>(R.id.boxOne)
        val boxTwoText: TextView = findViewById(R.id.boxTwo)
        val boxThreeText = findViewById<TextView>(R.id.boxThree)
        val boxFourText = findViewById<TextView>(R.id.boxFour)
        val boxFiveText = findViewById<TextView>(R.id.boxFive)

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,
                redButton, greenButton, yellowButton
            )
        for (item in clickableViews){
            item.setOnClickListener{ makeColoured2(it) }
        }

    }
    private fun makeColoured2(view: View) {
        val box_three_text = findViewById<TextView>(R.id.boxThree)
        val box_four_text = findViewById<TextView>(R.id.boxFour)
        val box_five_text = findViewById<TextView>(R.id.boxFive)

        when (view.id) {

            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}