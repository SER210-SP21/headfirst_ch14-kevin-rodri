package edu.quinnipiac.ser210.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TasksViewModelFactory(private val dao: TaskDao): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TasksViewModel::class.java)){
            return  TasksViewModel(dao) as T
        }
        throw  java.lang.IllegalArgumentException("Unknown ViewModel")
    }
}