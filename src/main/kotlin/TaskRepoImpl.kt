import kotlin.Int

class TaskRepoImpl : TaskRepo {

    private val map: MutableMap<Int, Task> = mutableMapOf()
    private var nextID = 1

    override fun add(title: String, text: String, priority: String, status: String) {
        map[nextID] = Task(title, text, priority, status)
//        println("Task wurde erfolgreich erstellt, ID = $nextID")
//        println(map)
        nextID++
    }

    override fun delete(taskID: Int): Boolean {
        if (map.containsKey(taskID)) {
            map.remove(taskID)
//            println("Task mit der ID: $taskID wurde gelöscht")
        } else {
//            println("Task mit der ID: $taskID wurde nicht gefunden!")
//            println(map.containsKey(taskID))
        }
        return true
    }

    override fun findById(taskId: Int): Boolean {
        if (map.containsKey(taskId)) {
//            println("Die Task mit der ID: $taskId ist: ")
//            println("Title: ${map[taskId]?.title}")
//            println("Short_Text: ${map[taskId]?.shortText}")
//            println("Status: ${map[taskId]?.statusString}")
//            println("Priority: ${map[taskId]?.priorityString}")
        } else {
//            println("Task mit der ID: $taskId konnte nicht gefunden werden!")
        }
        return true
    }

    override fun findByPriority(priority: String?): Boolean {
//        println("Task mit der Priorität $priority werden gesucht.")

        val filteredMap = map.filter { it.value.priorityString == priority }.keys
//        println(filteredMap)
        return true
    }

    override fun update(task: Int) {
//        map[task] =
    }
}