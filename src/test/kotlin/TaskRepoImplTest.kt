import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class TaskRepoImplTest {
    @Test
    fun `repoImpl add Test`(){
        val taskRepoImpl: TaskRepoImpl = TaskRepoImpl()
        taskRepoImpl.add("Test","Test",3,2)
        taskRepoImpl.findById(1)
        assertTrue(taskRepoImpl.findById(1))
    }
}