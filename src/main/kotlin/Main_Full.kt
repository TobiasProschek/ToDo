//data class FirstTask(val Title: String, val Short_Text: String, val Priority: String, val Status: String)

fun main(){
    TaskRepoImpl()
//    val gson = Gson()
//    val file = File("C:\\Users\\proschek\\IdeaProjects\\Learning\\ToDo\\src\\main\\kotlin\\ToDo.json")
//    val tasks: MutableList<FirstTask> = if (file.exists()) {
//        val type = object : TypeToken<MutableList<FirstTask>>() {}.type
//        gson.fromJson(file.readText(), type)
//    } else { mutableListOf() }
//
//    if (file.exists()) {
//        println("Datei wurde erfolgreich initialisiert.")
//    } else {
//        println("Datei existiert nicht.")
//        // Datei erzeugen
//    }
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
            readln()
//            taskRepo.findById(firstedit)

        } else if (delete == true) {
            print("Welche Task möchten sie löschen: ")
            readln()
            //taskRepo.delete(firstDel)

//            if (firstDel in tasks.indices) {
//                tasks.removeAt(firstDel)
//                println("Task wurde gelöscht.")
//            } else {
//                println("Invalid index.")
//            }
//            val modifiedJsonString = gson.toJson(tasks)
//            file.writeText(modifiedJsonString)

        } else if (add == true) {
            print("Welche Task möchten sie hinzufügen: ")
            val Title: String  = readln()
            print("Welche Beschreibung soll die Task haben: ")
            val Short_Text = readln()
            print("Welche Priority hat diese Task: ")
            val Priority = readln()
            print("Welchen Status hat diese Task: ")
            val Status = readln()

            val addAll = Title + Short_Text + Priority + Status
            print(addAll)

            //taskRepo.add()

            println("Task wurde erstellt.")
//            val json = gson.toJson(tasks)
//            file.writeText(json)

        } else if (read == true) {
            print("Nach welcher Task suchst du?: ")
            readln().toIntOrNull()
            //taskRepo.findById(readFirst)
//            val index: Int? = eva
//
//            if (index != null && index in tasks.indices) {
//                tasks[index]
//                println("Title : ${tasks[index].Title}")
//                println("Short Text : ${tasks[index].Short_Text}")
//                println("Priority : ${tasks[index].Priority}")
//                println("Status : ${tasks[index].Status}")
//            } else {
//                println("Diese Task ist nicht verfügbar")
//            }
        }
    }

    // create the map
    //val toDoMap = mutableMapOf<>()

}

//        } else if (status == true) {
//            print("welchen status möchten sie suchen?: ")
//            val firststatus = readln()
//            Status == in Progress
/**
anfang nachfrage, ob suchen oder filtern oder neue eingabe.
wenn man am anfang suchen oder filtern möchte ohne eine existierende json file dann error
json file soll readable and writeable sein ✓
bei bearbeitung von taks soll die json umgeschrieben werden.
 */

/**
 * Add, Read and Delete works Fine ✓
 * Important Edit
 * Less Important Status or Filters
 * define priority with numbers f.e. input 3 = json "high"
 */



//
//Taskrepoimpl findbyprio

//        var i = 1
//        while (i < 5) {
//            print(".")
//            Thread.sleep(325)
//            print(".")
//            Thread.sleep(325)
//            print(".")
//            Thread.sleep(375)
//            print(".\n")
//            i++
//        }