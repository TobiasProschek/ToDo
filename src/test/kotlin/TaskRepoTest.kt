import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

// TODO: Change TaskRepoImpl such that this unit test passes
class TaskRepoTest {
    // create unit tests for interface TaskRepo here

    private val subjectUnderTest: TaskRepo = TaskRepoImpl()

    @Test
    fun `Test basic operations of TaskRepo interface`() {
        val task = subjectUnderTest.add("Test", "Test", "3", "2")
        val task2 = subjectUnderTest.add("Test", "Test", "2", "2")

        val storedTask = subjectUnderTest.findById(task.id)
        assertNotNull(storedTask)
        assertEquals(task.id, storedTask.id)

        assertNotEquals(task.id, task2.id)

        val updatedTask = task.copy(title = "New Title")
        subjectUnderTest.update(updatedTask)
        assertEquals(updatedTask.title, subjectUnderTest.findById(task.id)?.title)

        val tasks = subjectUnderTest.findByPriority(updatedTask.priorityString)
        assertNotNull(tasks)
        assertEquals(1, tasks.size)
        assertEquals(updatedTask.id, tasks[0].id)

        assertTrue(subjectUnderTest.delete(updatedTask.id))
        assertNull(subjectUnderTest.findById(updatedTask.id))
    }
}