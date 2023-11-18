package baseball.contorller;

import baseball.service.*;
import java.util.List;

public class GameController {
    static ComputerService computerService = new ComputerService();
    static PlayerService playerService = new PlayerService();
    static RefereeService refereeService = new RefereeService();

    public void gameStart() {
        generateRandomNumbers();
        getRandomNumbers();
        // System.out.println("computerNumbers: " + getRandomNumbers());
        refereeService.gameStart();
        compare();
        refereeService.gameEnd();
        do {
            gameReStart();
        } while(refereeService.gameReStart());
    }

    public void gameReStart() {
        generateRandomNumbers();
        // System.out.println("computerNumbers: " + getRandomNumbers());
        compare();
    }

    public void compare() {
        do {
            refereeService.NumberRequest();
            inputPlayerNumbers();
            getHint();
        } while(getStrikeCount() != 3);
    }

    public void generateRandomNumbers() {
        computerService.generateRandomNumbers();
    }

    public List<Integer> getRandomNumbers() {
        return computerService.getRandomNumbers();
    }

    public List<Integer> inputPlayerNumbers() {
        return playerService.inputPlayerNumbers();
    }

    public void StrikeOrBallCount(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        refereeService.printHintMessage(computerService.getHint(computerNumbers, playerNumbers));
    }

    public int StrikeCount(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        return computerService.countStrike(computerNumbers, playerNumbers);
    }

    public void getHint() {
        StrikeOrBallCount(computerService.getRandomNumbers(), playerService.getPlayerNumbers());
    }

    public int getStrikeCount() {
        return StrikeCount(computerService.getRandomNumbers(), playerService.getPlayerNumbers());
    }
}