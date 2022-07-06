package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// This activity allows the user to roll a die and view the result on the screen
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    //Roll the dice and update the screen with the result
    private fun rollDice() {
        // create a new dice object with 6 sides and roll it
        val diceOne = Dice(6)
        val diceOneRoll = diceOne.roll()
        // create a new dice object with 20 sides and roll it
        val diceTwo = Dice(20)
        val diceTwoRoll = diceTwo.roll()

        //update the screen with the dice rolls
        val resultDiceOneView: TextView = findViewById(R.id.diceOne)
        resultDiceOneView.text = diceOneRoll.toString()

        val resultDiceTwoView: TextView = findViewById(R.id.diceTwo)
        resultDiceTwoView.text = diceTwoRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}