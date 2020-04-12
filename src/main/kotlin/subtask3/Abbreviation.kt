package subtask3

import java.lang.StringBuilder

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var aUpperCase = StringBuilder(a.toUpperCase())
        var tmp = 0
        while(tmp < b.length && b.length <= aUpperCase.length)
        {
            if(b[tmp] != aUpperCase[tmp]){
                aUpperCase.deleteCharAt(tmp)
                tmp--
            }
            tmp++
        }
        if(aUpperCase.length>b.length)
        aUpperCase= aUpperCase.removeRange(b.length,aUpperCase.length) as StringBuilder
        return if(aUpperCase.toString() == b)
            "YES"
        else
            "NO"
    }
}
