import mu.KotlinLogging
import kotlin.Int

class TaskRepoImpl : TaskRepo {

    private val log = KotlinLogging.logger {  }

    private val map: MutableMap<Int, Task> = mutableMapOf()
    private var nextID = 1

    override fun add(title: String, text: String, priority: String, status: String): Task {
        val newTask = Task(nextID, title, text, priority, status)
        map[nextID] = newTask
        nextID++
        log.info {"New task created, ID = ${newTask.id}"}
        TODO("Return the created task")
    }

    override fun delete(task: Int): Boolean {
        if (map.containsKey(task)) {
            map.remove(task)
            log.info { "Removed task with id $task" }
        } else {
            log.info { "Task with ID $task not found" }
        }
        TODO("Return the right boolean value")
    }

    override fun findById(taskId: Int): Task? {
        if (map.containsKey(taskId)) {
            log.info { "Found task with id $taskId" }
        } else {
            log.info { "Task with ID $taskId not found" }
        }
        TODO("Return the created task")
    }

    override fun findByPriority(priority: String): List<Task> {
        log.debug { "Searching for tasks with priority $priority..." }

        val filteredMap = map.filter { it.value.priorityString == priority }.keys
        TODO("Return list of matching tasks")
    }

    override fun update(task: Task) {
        TODO("Implement")
    }
}