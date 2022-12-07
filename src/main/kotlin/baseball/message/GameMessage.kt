package baseball.message

object GameMessage {
    //게임 지시문
    const val GAME_START = "숫자 야구 게임을 시작합니다.\n"
    const val CORRECT_ANSWER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
    const val PLEASE_INPUT = "숫자를 입력해주세요 : "
    const val RETRY_OR_END = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."

    //게임 결과
    const val NOTHING = "낫싱"
    const val BALL_MESSAGE = "%d볼"
    const val STRIKE_MESSAGE = "%d스트라이크"
    const val BALL_STRIKE_MESSAGE = "%d볼 %d스트라이크"
    const val RETRY_GAME = 1
    const val END_GAME = 2
}