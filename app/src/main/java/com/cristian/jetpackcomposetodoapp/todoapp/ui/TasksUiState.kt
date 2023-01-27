package com.cristian.jetpackcomposetodoapp.todoapp.ui

import com.cristian.jetpackcomposetodoapp.todoapp.ui.model.TaskModel

sealed interface TasksUiState {
    object Loading : TasksUiState
    data class Success(val tasks: List<TaskModel>) : TasksUiState
    data class Error(val throwable: Throwable) : TasksUiState
}