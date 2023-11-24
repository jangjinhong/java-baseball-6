package baseball.service;

import camp.nextstep.edu.missionutils.Console;
import baseball.entity.Player;
import static baseball.utils.Validator.*;

public class PlayerService {
    static Player player = new Player();

    public String inputPlayerNumbers() {
        String InputNumbers = Console.readLine();
        checkValidation(InputNumbers);
        setPlayerNumbers(InputNumbers);
        return getPlayerNumbers();
    }

    public static void setPlayerNumbers(String InputNumbers) {
        player.setPlayerNumbers(InputNumbers);
    }

    public static String getPlayerNumbers() {
        return player.getplayerNumbers();
    }

    private static boolean checkValidation(String data) {
        if(checkNumbersLength(data) && checkOutOfRange(data) && checkInteger(data) && checkDuplicate(data))
            return true;
        return false;
    }
}
