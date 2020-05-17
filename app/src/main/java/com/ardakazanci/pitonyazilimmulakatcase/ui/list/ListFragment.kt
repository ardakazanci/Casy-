package com.ardakazanci.pitonyazilimmulakatcase.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ardakazanci.pitonyazilimmulakatcase.R
import com.ardakazanci.pitonyazilimmulakatcase.commons.BaseFragment
import com.ardakazanci.pitonyazilimmulakatcase.databinding.FragmentListBinding


class ListFragment : BaseFragment<FragmentListBinding, ListViewModule>() {

    override fun getViewModel(): Class<ListViewModule> = ListViewModule::class.java

    override fun getLayoutRes(): Int = R.layout.fragment_list

}
