package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        val block = blockA.toList().filter { it::class==blockB }
        return when(blockB){
            Int::class -> block.sumBy {it.toString().toInt()}
            String::class ->block.joinToString("")
            LocalDate::class -> {
                blockA.filterIsInstance<LocalDate>().max()?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
            }
            else -> "error"
        }
    }
}
