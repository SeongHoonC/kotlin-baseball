package baseball.message

object ErrorMessage {
    private const val ERROR_MESSAGE = "[ERROR]"
    const val ERROR_NUMBERS_RANGE = ERROR_MESSAGE.plus(" 1과 9 사이의 숫자를 입력해야합니다.")
    const val ERROR_NOT_NUMBER = ERROR_MESSAGE.plus(" 숫자만 입력해야 합니다.")
    const val ERROR_NOT_LENGTH = ERROR_MESSAGE.plus(" 입력할 숫자 개수를 초과하였습니다.")
    const val ERROR_REPEAT = ERROR_MESSAGE.plus(" 숫자가 중복 입력되었습니다.")
}