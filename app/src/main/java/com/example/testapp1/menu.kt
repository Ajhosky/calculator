package com.example.testapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.testapp1.databinding.ActivityMenuBinding

class menu : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        binding.btnOne.setOnClickListener{

        }
        binding.btnTwo.setOnClickListener{

        }
        binding.btnThree.setOnClickListener{

        }
        binding.btnFour.setOnClickListener{

        }
        binding.btnFive.setOnClickListener{

        }
        binding.btnSix.setOnClickListener{

        }
        binding.btnSeven.setOnClickListener{

        }
        binding.btnEight.setOnClickListener{

        }
        binding.btnNine.setOnClickListener{

        }
        binding.btnZero.setOnClickListener{

        }
        binding.txtInput.addTextChangedListener{

        }
        binding.txtSolution.addTextChangedListener{

        }
    }
}