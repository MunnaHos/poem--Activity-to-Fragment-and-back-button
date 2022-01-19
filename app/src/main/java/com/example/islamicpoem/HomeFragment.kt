package com.example.islamicpoem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamicpoem.databinding.FragmentHomeBinding


class HomeFragment : Fragment(),View.OnClickListener {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(inflater)


        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button7.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button9.setOnClickListener(this)
        binding.button10.setOnClickListener(this)
        binding.button11.setOnClickListener(this)
        binding.button12.setOnClickListener(this)
        binding.button13.setOnClickListener(this)
        binding.button14.setOnClickListener(this)
        binding.button15.setOnClickListener(this)
        binding.button16.setOnClickListener(this)
        binding.button17.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View) {

        val communicat = activity as Communicat

        when(v.id){

            R.id.button1 ->{

                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button2 ->{

                val bonDona = getString(R.string.BonDona2)
                communicat.dataPass(bonDona)
            }
            R.id.button3 ->{

                val bonDona2 = getString(R.string.BonDona2)
                communicat.dataPass(bonDona2)
            }
            R.id.button4 -> {
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }

            R.id.button5 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button6 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button7 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button8 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button9 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button10 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button11 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button12 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button13 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button14 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button15 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button16 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }
            R.id.button17 ->{
                val bonDona = getString(R.string.BonDona)
                communicat.dataPass(bonDona)
            }


        }
    }



}