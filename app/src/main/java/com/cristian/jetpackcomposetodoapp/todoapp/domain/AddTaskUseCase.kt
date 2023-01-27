package com.cristian.jetpackcomposetodoapp.todoapp.domain

import com.cristian.jetpackcomposetodoapp.todoapp.data.TaskRepository
import com.cristian.jetpackcomposetodoapp.todoapp.ui.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.add(taskModel)
    }
}