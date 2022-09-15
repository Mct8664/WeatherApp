package com.example.weatherapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class ForecastFragment : Fragment(R.layout.fragment_forecast){

    private lateinit var binding : FragmentForecastBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentForecastBinding.bind(view)
    }
}