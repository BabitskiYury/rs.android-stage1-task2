package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val resultStr = inputString.replace("\\s+".toRegex(), " ")
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y')
        val consonantsSet = setOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
            'v', 'x', 'z', 'w', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
            'R', 'S', 'T', 'V', 'X', 'Z', 'W')

        val newSet = resultStr.toLowerCase().replace("[^a-z]".toRegex(), "").toSet()

        return if (newSet.size == 26) {
            sortWords(resultStr, vowels)
        } else {
            sortWords(resultStr, consonantsSet)
        }
    }

    private fun sortWords(inputString: String, set: Set<Char>):String {
        val pairs = mutableListOf<Pair<Int, String>>()
        val words = inputString.split(" ")

        for (strItem in words) {
            if (strItem.trimIndent().isNotEmpty()) {
                val characters = mutableListOf<Char>()
                var count = 0
                for (i in strItem.indices) {
                    val ichar = strItem[i]
                    if (set.contains(ichar)) {
                        count++
                        characters.add(ichar.toUpperCase())
                    } else {
                        characters.add(ichar)
                    }
                }

                val resultWord = "$count${characters.joinToString("")}"
                val pair = Pair(count, resultWord)
                pairs.add(pair)
            }
        }

        val positionComparator = compareBy<Pair<Int, String>> {it.first}
        val sortedList = pairs.sortedWith(positionComparator)
        val listOfStrings = sortedList.map { it.second }
        return listOfStrings.joinToString(separator = " ") { it }
    }

}
