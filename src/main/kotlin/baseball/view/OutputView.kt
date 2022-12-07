package baseball.view

import baseball.message.GameMessage.BALL_MESSAGE
import baseball.message.GameMessage.BALL_STRIKE_MESSAGE
import baseball.message.GameMessage.NOTHING
import baseball.message.GameMessage.STRIKE_MESSAGE

class OutputView {

    fun printBallStrike(strike: Int, ball: Int) {
        when {
            ball == 0 && strike ==0 -> println(NOTHING)
            ball > 0 && strike == 0 -> println(BALL_MESSAGE.format(ball))
            ball == 0 && strike >0 -> println(STRIKE_MESSAGE.format(strike))
            ball > 0 && strike >0 -> println(BALL_STRIKE_MESSAGE.format(ball,strike))

        }
    }

    fun printMessage(message: String) {
        print(message)
    }

}