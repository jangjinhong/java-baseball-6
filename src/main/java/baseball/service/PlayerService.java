package baseball.service;

import java.util.*;
import camp.nextstep.edu.missionutils.Console;

import baseball.entity.Player;
import baseball.view.OutputView;
import static baseball.contorller.GameController.MAX_NUMBER_SIZE;

public class PlayerService {
    static Player player = new Player();

    public static List<Integer> inputPlayerNumber() {
        List<Integer> playerNumber = new ArrayList<>();
        String data = "";

        data = Console.readLine();
        checkValidation(data);

        String[] d = data.split(" ");
        for(int i = 0; i < MAX_NUMBER_SIZE; i++) {
            playerNumber.add(Integer.parseInt(d[i]));
        }
        player.setPlayerNumber(playerNumber);

        return player.getplayerNumber();
    }


    //예외처리 대상인지 체크
    private static void checkValidation(String data) {
        checkInteger(data);   // 정수체크
        checkDuplicate(data); // 중복체크
        checkOutOfRange(data); // 범위체크
    }

    private static void checkOutOfRange(String data) {
        if(!isOutOfRange(data)) {
            OutputView.OutOfRangeErrorMessage();
            throw new IllegalArgumentException();
        }
    }



    private static void checkInteger(String data) {
        if(!isInteger(data)) {
            OutputView.TypeErrorMessage();
            throw new IllegalArgumentException();
        }
    }

    private static void checkDuplicate(String data) {
        if(hasDuplicate(data)) {
            OutputView.DuplicateErrorMessage();
            throw new IllegalArgumentException();
        }
    }

    private static boolean isInteger(String data) {
        return data != null && data.matches("[-+]?\\d*\\.?\\d+");
        //if(data == null) return false;
    }

    private static boolean isOutOfRange(String data) {
        String[] numbers = data.split(" ");
        for(String s : numbers) {
            if(Integer.parseInt(s) >= 1 && Integer.parseInt(s) <= 9)
                return true;
        }
        return false;
    }

    private static boolean hasDuplicate(String data) {
        String[] d = data.split(" ");
        List<String> dataList = new ArrayList<>(Arrays.asList(d));
        Set<String> numberSet = new HashSet<>(dataList);
        if(numberSet.size() != MAX_NUMBER_SIZE)
            return true;
        return false;
    }

}
