package com.ardakazanci.pitonyazilimmulakatcase.ui.input

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ardakazanci.pitonyazilimmulakatcase.R
import com.ardakazanci.pitonyazilimmulakatcase.commons.BaseFragment
import com.ardakazanci.pitonyazilimmulakatcase.databinding.FragmentInputBinding

class InputFragment : BaseFragment<FragmentInputBinding, InputViewModule>() {

    override fun getViewModel(): Class<InputViewModule> = InputViewModule::class.java

    override fun getLayoutRes(): Int = R.layout.fragment_input

}
