package com.ardakazanci.pitonyazilimmulakatcase.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.ardakazanci.pitonyazilimmulakatcase.R
import com.ardakazanci.pitonyazilimmulakatcase.commons.BaseFragment
import com.ardakazanci.pitonyazilimmulakatcase.databinding.FragmentSelectedBinding
import kotlinx.android.synthetic.main.fragment_selected.*


class SelectedFragment : BaseFragment<FragmentSelectedBinding, SelectedViewModule>() {


    override fun getViewModel(): Class<SelectedViewModule> = SelectedViewModule::class.java

    override fun getLayoutRes(): Int = R.layout.fragment_selected

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        goToAddedTask.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_selectedFragment_to_inputFragment)
        }

        goToAllTaskList.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_selectedFragment_to_listFragment)
        }


    }

}
