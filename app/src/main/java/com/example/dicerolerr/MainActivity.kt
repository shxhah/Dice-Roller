package com.example.dicerolerr

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ...

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOne.setOneClickListener { it View
                rollDice()

        }
    }
 private fun rollDice()
 {
     val dice = Dice ()
     val sides = dice.diceRoll()
     val dR = when(sides)
     {
         1->R.drawable.perspective_dice_six_faces_one
         2->R.drawable.perspective_dice_six_faces_two
         3->R.drawable.perspective_dice_six_faces_three
         4->R.drawable.perspective_dice_six_faces_four
         5->R.drawable.perspective_dice_six_faces_five
         else ->R.drawable.dice_six__1_
     }
     binding.imageView.SetImageView.(dR)
 }

}
class Dice(private numSides : Int)
{
    fun diceRoll( : Int )
    {
        return(1...numSides).random ()

    }
}