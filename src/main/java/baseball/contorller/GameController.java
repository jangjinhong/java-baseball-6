package baseball.contorller;

import baseball.service.*;
import baseball.view.InputView;

import java.util.List;

public class GameController {
    public final static int MAX_NUMBER_SIZE = 3;
    ComputerService computerService;
    PlayerService playerService;

    public GameController() {
        computerService = new ComputerService();
        playerService = new PlayerService();
    }

    public void startGame() {
        InputView.run();
    }

    public static List<Integer> makeRandomNumbers() {
        return ComputerService.makeRandomNumbers();
    }

    public static List<Integer> inputPlayerNumber() {
        return PlayerService.inputPlayerNumber();
    }

}