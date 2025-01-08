data class Task(
    val title: String,
    val shortText: String,
    val priorityString: String,
    val statusString: String
)


enum class Priority(val code: Int) {
    HIGH(1),
    MID(2),
    LOW(3);

    companion object {
        fun fromCode(code: Int): String? {
            return Priority.entries.find { it.code == code }?.name
        }
    }
}

enum class TaskStatus(val code: Int) {
    OPEN(1),
    WAITNG(2),
    INPROGRESS(3),
    CLOSED(4);

    companion object {
        fun fromCode(code: Int): String? {
            return TaskStatus.entries.find { it.code == code }?.name
        }
    }
}