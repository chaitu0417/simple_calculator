package com.example.calc_ammu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calc_ammu1.databinding.ActivityMainBinding // Replace with your generated binding class


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // Replace with your generated binding class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.plus.setOnClickListener {
            val input1Text = binding.inp1.text.toString().trim()
            val input2Text = binding.inp2.text.toString().trim()

            if (input1Text.isEmpty() || input2Text.isEmpty()) {
                // Display a toast message
                Toast.makeText(
                    this,
                    "Please enter valid values for input1 and input2",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val input1 = input1Text.toIntOrNull()
                val input2 = input2Text.toIntOrNull()

                if (input1 == null || input2 == null) {
                    // Display a toast message
                    Toast.makeText(this, "Please enter numeric values only", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    val result = input1 + input2
                    binding.output.text = result.toString()
                }
            }
        }
        binding.minus.setOnClickListener {
            val input1Text = binding.inp1.text.toString().trim()
            val input2Text = binding.inp2.text.toString().trim()

            if (input1Text.isEmpty() || input2Text.isEmpty()) {
                // Display a toast message
                Toast.makeText(this, "Please enter valid values for input1 and input2", Toast.LENGTH_SHORT).show()
            } else {
                val input1 = input1Text.toIntOrNull()
                val input2 = input2Text.toIntOrNull()

                if (input1 == null || input2 == null) {
                    // Display a toast message
                    Toast.makeText(this, "Please enter numeric values only", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    val result = input1 - input2
                    binding.output.text = result.toString()
                }
            }
        }
        binding.mul.setOnClickListener {
            val input1Text = binding.inp1.text.toString().trim()
            val input2Text = binding.inp2.text.toString().trim()

            if (input1Text.isEmpty() || input2Text.isEmpty()) {
                // Display a toast message
                Toast.makeText(this, "Please enter valid values for input1 and input2", Toast.LENGTH_SHORT).show()
            } else {
                val input1 = input1Text.toIntOrNull()
                val input2 = input2Text.toIntOrNull()

                if (input1 == null || input2 == null) {
                    // Display a toast message
                    Toast.makeText(this, "Please enter numeric values only", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    val result = input1 * input2
                    binding.output.text = result.toString()
                }
            }
        }
        binding.div.setOnClickListener {
            val input1Text = binding.inp1.text.toString().trim()
            val input2Text = binding.inp2.text.toString().trim()

            if (input1Text.isEmpty() || input2Text.isEmpty()) {
                // Display a toast message
                Toast.makeText(this, "Please enter valid values for input1 and input2", Toast.LENGTH_SHORT).show()
            } else {
                val input1 = input1Text.toIntOrNull()
                val input2 = input2Text.toIntOrNull()

                if (input1 == null || input2 == null) {
                    // Display a toast message
                    Toast.makeText(this, "Please enter numeric values only", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    val result = input1 / input2
                    binding.output.text = result.toString()
                }
            }
        }
    }
}
