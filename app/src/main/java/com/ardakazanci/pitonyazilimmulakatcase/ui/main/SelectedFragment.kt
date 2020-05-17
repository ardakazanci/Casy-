package com.ardakazanci.pitonyazilimmulakatcase.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.ardakazanci.pitonyazilimmulakatcase.R
import com.ardakazanci.pitonyazilimmulakatcase.commons.BaseFragment
import com.ardakazanci.pitonyazilimmulakatcase.databinding.FragmentSelectedBinding
import kotlinx.android.synthetic.main.fragment_selected.*


class SelectedFragment : BaseFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding<FragmentSelectedBinding>(
            inflater,
            R.layout.fragment_selected,
            container
        ).apply {

            this.goToAddedTask.setOnClickListener {
                view?.findNavController()?.navigate(R.id.action_selectedFragment_to_inputFragment)
            }

            this.goToAllTaskList.setOnClickListener {
                view?.findNavController()?.navigate(R.id.action_selectedFragment_to_listFragment)
            }
            lifecycleOwner = this@SelectedFragment
        }.root




    }

}
