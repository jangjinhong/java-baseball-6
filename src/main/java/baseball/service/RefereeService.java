package baseball.service;

import baseball.view.InputView;
import baseball.view.OutputView;

public class RefereeService {
    public void printGameStartMessage() {
        OutputView.printStartMessage();
    }

    public void printNumberRequestMessage() {
        InputView.NumberRequestMessage();
    }

    public void printGameEndMessage() {
        OutputView.gameEndMessage();
    }

    public void printHintMessage(int[] hint) {
        OutputView.printHintMessage(hint);
    }

    public boolean shouldRestartGame() {
        String restartNumber = InputView.RestartNumberRequestMessage();
        return restartNumber.equals("1");
    }
}
