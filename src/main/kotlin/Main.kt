fun main() {
    val taskRepo: TaskRepo = TaskRepoImpl()

    var repeat = true
    while (repeat == true) {
        print("was möchten sie tun? Edit = e, Delete = d, Adden = a, Read = r: ")
        val first = readln()

        var edit = false
        var delete = false
        var add = false
        var status = false
        var read = false

        when (first.lowercase()) {
            "e", "edit" -> edit = true
            "d", "delete" -> delete = true
            "a", "add" -> add = true
            "r", "read" -> read = true
            "s", "status" -> status = true
            else -> repeat = false
        }

        if (edit == true) {
            print("welche Task möchten sie Editieren: ")
            val editTask = readln().toInt()
            if (editTask == null) {
                println("Invalid task ID")
                return
                taskRepo.update(editTask)
            }
            } else if (delete == true) {
                print("Welche Task möchten sie löschen: ")
                val delTask = readln().toIntOrNull()
                if (delTask == null) {
                    println("Invalid task ID")
                    return
                }
                taskRepo.delete(delTask)

            } else if (add == true) {
                print("Welche Task möchten sie hinzufügen: ")
                val title = readln()
                print("Welche Beschreibung soll die Task haben: ")
                val shortText = readln()
                print("Welche Priority hat diese Task: ")
                val priority = readln().toInt()
                val priorityString = Priority.fromCode(priority)
                print("Welchen Status hat diese Task: ")
                val status = readln().toInt()
                val statusString = TaskStatus.fromCode(status)

                taskRepo.add(title, shortText, priorityString.toString(), statusString.toString())

            } else if (read == true) {
                var searchID = false
                var searchPriority = false
                print("Suchen Sie nach 'ID' oder 'Priority'? ")
                val read = readln()

                when (read.lowercase()) {
                    "id" -> searchID = true
                    "priority", "prio" -> searchPriority = true
                    else -> println("Error")
                }

                if (searchID == true) {
                    print("Nach Welcher 'ID' möchten sie suchen: ")
                    val readID = readln().toInt()
                    taskRepo.findById(readID)
                } else if (searchPriority == true) {
                    print("Nache Welcher 'Priority' möchten sie suchen: ")
                    val readPriority = readln().toInt()
                    if (readPriority <= 3) {
                        TODO("Fix following code")
//                        val prioString = Priority.fromCode(readPriority.toInt())
//                        taskRepo.findByPriority(prioString)
                    } else {
                        println("Error")
                    }
                }
            }
        }
}