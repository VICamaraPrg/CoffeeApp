package com.example.coffeeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.coffeeapp.databinding.FragmentSecondChoiceBinding

class SecondChoiceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSecondChoiceBinding>(inflater,
            R.layout.fragment_second_choice, container, false)

        binding.buttonToThirdChoice2.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_secondChoiceFragment_to_thirdChoiceFragment)
        }

        val spinner: Spinner = binding.secondChoiceOptions
        getContext()?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.secondChoice_options,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinner.adapter = adapter
            }
        }

        return binding.root
    }
}
