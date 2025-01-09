interface TaskRepo {
    /**
     * Create a new task with the given title, text, priority, and status.
     * Internally the task should be assigned a unique id.
     * @return the newly created task including the assigned id
     */
    fun add(title: String, text: String, priority: String, status: String): Task

    /**
     * Deletes a task with the given id.
     * @return true if the task was deleted, false if the task was not found
     */
    fun delete(task: Int): Boolean

    /**
        * Find a task by its id.
        * @return the task if found, null if not found
     */
    fun findById(taskId: Int): Task?

    /**
     * Find tasks by priority.
     * @return Found tasks with the given priority
     */
    fun findByPriority(priority: String): List<Task>

    /**
     * Update a task.
     * Throws an exception if the task is not found.
     */
    fun update(task: Task)
}