import mu.KotlinLogging
import kotlin.Int

class TaskRepoImpl : TaskRepo {

    private val log = KotlinLogging.logger { }

    private val map: MutableMap<Int, Task> = mutableMapOf()
    private var nextID = 1

    override fun add(title: String, text: String, priority: String, status: String): Task {
        val newTask = Task(nextID, title, text, priority, status)
        map[nextID] = newTask
        nextID++
        log.info {"New task created, ID = ${newTask.id}"}
        return newTask
    }

    override fun delete(task: Int): Boolean {
        if (map.containsKey(task)) {
            map.remove(task)
            log.info { "Removed task with id $task" }
            return true
        } else {
            log.info { "Task with ID $task not found" }
            return false
        }
    }

    override fun findById(taskId: Int): Task? {
        if (map.containsKey(taskId)) {
            log.info { "Found task with id $taskId" }
        } else {
            log.info { "Task with ID $taskId not found" }
        }
        return map[taskId]
    }

    override fun findByPriority(priority: String): List<Task> {
        log.debug { "Searching for tasks with priority $priority..." }

        val filteredList = map.filter { it.value.priorityString == priority }.values.toList()
        log.info { filteredList }
        return filteredList
    }

    override fun update(task: Task) {
        if (map.containsKey(task.id)) {
            map[task.id] = task
            log.info { "Task updated successfully." }
        } else {
            log.info { "Task not found" }
        }
    }
}