package toon.cuyvers.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.math.min

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val increaseButton = findViewById<Button>(R.id.increase_button)
        increaseButton.setOnClickListener { increaseNumber() }

        val resetButton = findViewById<Button>(R.id.reset_button)
        resetButton.setOnClickListener { resetNumber() }


    }

    private fun getRandomDieImage() : Int {
        return when((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
    }

    private fun rollDice() {
        diceImage1.setImageResource(getRandomDieImage())
        diceImage2.setImageResource(getRandomDieImage())


    }

    private fun increaseNumber() {
    }

    private fun resetNumber() {
    }
}
