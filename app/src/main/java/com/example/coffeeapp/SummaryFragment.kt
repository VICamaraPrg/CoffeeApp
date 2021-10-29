package com.example.coffeeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.coffeeapp.databinding.FragmentSummaryBinding

class SummaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSummaryBinding>(inflater,
            R.layout.fragment_summary, container, false)
        
        val args = SummaryFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(context, "Dessert: ${args.dessert}", Toast.LENGTH_LONG).show()

        return binding.root
    }

}
