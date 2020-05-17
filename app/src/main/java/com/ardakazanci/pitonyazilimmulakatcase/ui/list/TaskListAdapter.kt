package com.ardakazanci.pitonyazilimmulakatcase.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ardakazanci.pitonyazilimmulakatcase.R
import com.ardakazanci.pitonyazilimmulakatcase.data.model.Task
import com.ardakazanci.pitonyazilimmulakatcase.databinding.ItemTaskBinding

class TaskListAdapter() :
    RecyclerView.Adapter<TaskListAdapter.TaskListAViewHolder>() {

    private var list = mutableListOf<Task>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListAViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemTaskBinding>(
            inflater, R.layout.item_task, parent, false
        )
        return TaskListAViewHolder(binding)
    }

    fun updateContentList(taskList: List<Task>) {
        list.clear()
        list.addAll(taskList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: TaskListAViewHolder, position: Int) {
        val item = list[position]
        holder.binding.apply {
            content = item
            executePendingBindings()
        }
    }

    class TaskListAViewHolder(val binding: ItemTaskBinding) :
        RecyclerView.ViewHolder(binding.root)


}