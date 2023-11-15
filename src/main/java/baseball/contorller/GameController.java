package baseball.contorller;

import baseball.service.*;
import baseball.view.OutputView;

import java.util.List;

public class GameController {
    public final static int MAX_NUMBER_SIZE = 3;

    public void startGame() {
        OutputView.printStartMessage();
    }

    public static List<Integer> makeRandomNumber() {
        return ComputerService.makeRandomNumber();
    }

    public static List<Integer> inputPlayerNumber() {
        return PlayerService.inputPlayerNumber();
    }

}