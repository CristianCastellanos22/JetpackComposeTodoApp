package com.cristian.jetpackcomposetodoapp.todoapp.domain

import com.cristian.jetpackcomposetodoapp.todoapp.data.TaskRepository
import com.cristian.jetpackcomposetodoapp.todoapp.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}