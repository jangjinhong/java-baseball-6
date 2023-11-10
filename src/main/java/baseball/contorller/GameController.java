package baseball.contorller;

import baseball.service.ComputerService;
import java.util.*;
public class GameController {
    ComputerService computerService = new ComputerService();

    public List<Integer> makeRandom() {
        return computerService.makeRandom();
    }
}
