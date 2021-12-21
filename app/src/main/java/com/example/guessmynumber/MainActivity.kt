package com.example.guessmynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.guessmynumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.guessTextView.text = String.format(resources.getString(R.string.str_guess_number), number)

    }

    fun onClickArrowDownward(view: android.view.View) {

        when (number) {
            5 -> {
                numberGuessDown(3)
            }
            3 -> {
                numberGuessDown(2)
            }
            2 -> {
                numberGuessDown(1)
            }
            8 -> {
                numberGuessDown(7)
            }
            7 -> {
                numberGuessDown(6)
            }
        }

    }

    fun onClickArrowUpward(view: android.view.View) {

        when (number) {
            3 -> {
                numberGuessUp(4)
            }
            5 -> {
                numberGuessUp(8)
            }
            8 -> {
                numberGuessUp(9)
            }
            9 -> {
                numberGuessUp(10)
            }
        }

    }

    fun onClickCheck(view: android.view.View) {
        binding.resultTextView.visibility = View.VISIBLE
        binding.guessTextView.visibility = View.INVISIBLE
        binding.resultTextView.text = String.format(resources.getString(R.string.str_success_number), number)

    }



    fun onClickResetButton(view: android.view.View) {
        binding.resultTextView.visibility = View.INVISIBLE
        binding.guessTextView.visibility = View.VISIBLE
        number = 5
        binding.guessTextView.text = String.format(resources.getString(R.string.str_guess_number),number)


    }

    private fun numberGuessUp (number2: Int){
        number = number2
        binding.guessTextView.text = String.format(resources.getString(R.string.str_guess_number), number)
    }

    private fun numberGuessDown (number2: Int){
        number = number2
        binding.guessTextView.text = String.format(resources.getString(R.string.str_guess_number), number)

    }

}