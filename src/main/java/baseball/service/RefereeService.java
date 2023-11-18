package baseball.service;

import baseball.view.InputView;
import baseball.view.OutputView;

public class RefereeService {
    public void gameStart() {
        OutputView.printStartMessage();
        //InputView.NumberRequestMessage();
    }
    public void NumberRequest() {
        InputView.NumberRequestMessage();
    }

    public void gameEnd() {
        OutputView.gameEndMessage();
        InputView.RestartNumber();
    }

    public boolean gameReStart() {
        String retryNumber = InputView.RestartNumber();
        if(retryNumber.equals("1"))
            return true;
        return false;
    }

    public void printHintMessage(int[] hint) {
        OutputView.printHintMessage(hint);
    }
}
