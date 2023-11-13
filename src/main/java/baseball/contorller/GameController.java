package baseball.contorller;

import baseball.service.ComputerService;

import java.util.List;

public class GameController {
    static ComputerService computerService;

    public static List<Integer> makeRandomNumber() {
        return computerService.makeRandomNumber();
    }

}