package baseball.contorller;

import baseball.service.*;
import java.util.List;

public class GameController {
    static ComputerService computerService = new ComputerService();
    static PlayerService playerService = new PlayerService();
    static RefereeService refereeService = new RefereeService();

    public void gameStart() {
        generateRandomNumbers();
        refereeService.printGameStartMessage();
        compare();
        refereeService.printGameEndMessage();
        while(refereeService.shouldRestartGame()) {
            gameReStart();
        }
    }

    public void gameReStart() {
        generateRandomNumbers();
        compare();
    }

    public void compare() {
        do {
            refereeService.printNumberRequestMessage();
            inputPlayerNumbers();
            getHint();
        } while(getStrikeCount() != 3);
    }

    public void generateRandomNumbers() {
        computerService.generateRandomNumbers();
    }

    public String inputPlayerNumbers() {
        return playerService.inputPlayerNumbers();
    }

    public void getHint() {
        StrikeOrBallCount(computerService.getRandomNumbers(), playerService.getPlayerNumbers());
    }

    public void StrikeOrBallCount(List<Integer> computerNumbers, String playerNumbers) {
        refereeService.printHintMessage(computerService.getHint(computerNumbers, playerNumbers));
    }

    public int StrikeCount(List<Integer> computerNumbers, String playerNumbers) {
        return computerService.countStrike(computerNumbers, playerNumbers);
    }

    public int getStrikeCount() {
        return StrikeCount(computerService.getRandomNumbers(), playerService.getPlayerNumbers());
    }
}