package baseball.view

import baseball.utils.checkNumberRange
import baseball.utils.checkNumbersLength
import baseball.utils.checkRepetition
import baseball.utils.inputTypeException
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readNumbers(): List<Int> {
        while (true) {
            try {
                val input = Console.readLine()
                with(input) {
                    numberInputException()
                    return map { it.toString().toInt() }.toList()
                }
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    fun readRetry(): Int {
        while (true) {
            try {
                val input = Console.readLine()
                with(input) {
                    retryInputException()
                }
                return input.toInt()
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    private fun String.numberInputException() {
        inputTypeException()
        checkNumbersLength(NUMBERS_LENGTH)
        checkNumberRange(LOWER_NUMBER, UPPER_NUMBER)
        checkRepetition()
    }

    private fun String.retryInputException() {
        inputTypeException()
        checkNumbersLength(RETRY_END_LENGTH)
        checkNumberRange(RETRY, END)
    }

    companion object {
        const val NUMBERS_LENGTH = 3
        const val RETRY_END_LENGTH = 1
        const val UPPER_NUMBER = 9
        const val LOWER_NUMBER = 1
        const val RETRY = 1
        const val END = 2
    }
}