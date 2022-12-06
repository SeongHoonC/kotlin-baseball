package baseball.utils
import baseball.message.ErrorMessage.ERROR_NOT_NUMBER
import baseball.message.ErrorMessage.ERROR_NOT_LENGTH
import baseball.message.ErrorMessage.ERROR_NUMBERS_RANGE
import baseball.message.ErrorMessage.ERROR_REPEAT

fun String.inputTypeException(){
    try {
        this.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException(ERROR_NOT_NUMBER)
    }
}

//길이 체크
fun String.checkNumbersLength(size:Int){
    if(this.length != size)
        throw IllegalArgumentException(ERROR_NOT_LENGTH)
}

//1~9 숫자인지 체크
fun String.checkNumberRange(start:Int,end:Int){
    for(index in this.indices){
        if(this[index]-'0' !in start..end)
            throw IllegalArgumentException(ERROR_NUMBERS_RANGE)
    }
}

fun String.checkRepetition(){
    if (this.length != this.toSet().size)
        throw IllegalArgumentException(ERROR_REPEAT)
}