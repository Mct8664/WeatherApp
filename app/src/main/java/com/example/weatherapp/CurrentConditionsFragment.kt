package com.example.weatherapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CurrentConditionsFragment : Fragment( ) {

   /// private lateinit var  binding: FragmentCurrentConditionsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      //  binding = FragmentCurrentConditionsBinding.bind(view)
        binding.forecastButton.setOnClickListenr{
            findNavController()
        }
    }
}