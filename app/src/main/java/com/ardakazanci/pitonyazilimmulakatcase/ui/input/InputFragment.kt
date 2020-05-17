package com.ardakazanci.pitonyazilimmulakatcase.ui.input

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ardakazanci.pitonyazilimmulakatcase.R
import com.ardakazanci.pitonyazilimmulakatcase.commons.BaseFragment
import com.ardakazanci.pitonyazilimmulakatcase.databinding.FragmentInputBinding
import org.koin.android.viewmodel.ext.android.getViewModel

class InputFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding<FragmentInputBinding>(inflater, R.layout.fragment_input, container).apply {
            viewModel = getViewModel<InputViewModel>().apply {

            }
            lifecycleOwner = this@InputFragment
        }.root
    }

    
}
