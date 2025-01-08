interface TaskRepo {
    fun add(title: String, text: String, priority: String, status: String): Unit

    fun delete(task: Int): Boolean

    fun findById(taskId: Int): Boolean

    fun findByPriority(priority: String?): Boolean

    fun update(task: Int): Unit
}