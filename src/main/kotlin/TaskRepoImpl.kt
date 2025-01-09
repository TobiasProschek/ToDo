import mu.KotlinLogging
import kotlin.Int

class TaskRepoImpl : TaskRepo {

    private val log = KotlinLogging.logger {  }

    private val map: MutableMap<Int, Task> = mutableMapOf()
    private var nextID = 1

    override fun add(title: String, text: String, priority: String, status: String): Task {
        map[nextID] = Task(nextID, title, text, priority, status)
        log.info {"Task wurde erfolgreich erstellt, ID = $nextID"}
        nextID++
        TODO("Return the created task")
    }

    override fun delete(task: Int): Boolean {
        if (map.containsKey(task)) {
            map.remove(task)
            log.info { "Task mit der ID: $task wurde gelöscht" }
        } else {
            log.info { "Task mit der ID: $task wurde nicht gefunden!" }
        }
        TODO("Return the right boolean value")
    }

    override fun findById(taskId: Int): Task? {
        if (map.containsKey(taskId)) {
            log.info { "Die Task mit der ID: $taskId ist: " }
            log.info { "Title: ${map[taskId]?.title}" }
            log.info { "Short_Text: ${map[taskId]?.shortText}" }
            log.info { "Status: ${map[taskId]?.statusString}" }
            log.info { "Priority: ${map[taskId]?.priorityString}" }
        } else {
            log.info { "Task mit der ID: $taskId konnte nicht gefunden werden!" }
        }
        TODO("Return the created task")
    }

    override fun findByPriority(priority: String): List<Task> {
        log.info { "Task mit der Priorität $priority werden gesucht." }

        val filteredMap = map.filter { it.value.priorityString == priority }.keys
        TODO("Return list of matching tasks")
    }

    override fun update(task: Task) {
        TODO("Implement")
    }
}