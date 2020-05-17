package com.ardakazanci.pitonyazilimmulakatcase.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ardakazanci.pitonyazilimmulakatcase.data.model.Task
import com.ardakazanci.pitonyazilimmulakatcase.ui.list.TaskListAdapter

@BindingAdapter("adapter")
fun bindAdapter(view: RecyclerView, adapter: TaskListAdapter) {

    view.adapter = adapter

}

@BindingAdapter("adapterTaskList")
fun bindTaskList(view: RecyclerView, list: List<Task>?) {


    list!!.let {
        (view.adapter as TaskListAdapter).updateContentList(it)
    }


}