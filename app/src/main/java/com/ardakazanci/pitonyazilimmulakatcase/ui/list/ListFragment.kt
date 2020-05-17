package com.ardakazanci.pitonyazilimmulakatcase.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ardakazanci.pitonyazilimmulakatcase.R
import com.ardakazanci.pitonyazilimmulakatcase.commons.BaseFragment
import com.ardakazanci.pitonyazilimmulakatcase.databinding.FragmentListBinding
import org.koin.android.viewmodel.compat.ScopeCompat.getViewModel
import org.koin.android.viewmodel.ext.android.getViewModel


class ListFragment : BaseFragment() {

    private lateinit var viewModelList: ListViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding<FragmentListBinding>(inflater, R.layout.fragment_list, container).apply {
            viewModelList = getViewModel()
            viewmodel = viewModelList
            adapter = TaskListAdapter()
            lifecycleOwner = this@ListFragment
        }.root
    }

}
