package baseball.service;

import java.util.*;
import camp.nextstep.edu.missionutils.Console;

import baseball.entity.Player;
import baseball.view.OutputView;
import static baseball.entity.Constant.MAX_NUMBER_SIZE;

public class PlayerService {
    static Player player = new Player();

    public List<Integer> inputPlayerNumbers() {
        return stringToListNumbersChange(Console.readLine());
    }

    public static List<Integer> stringToListNumbersChange(String InputNumbers) {
        List<Integer> playerNumber = new ArrayList<>();

        checkValidation(InputNumbers);

        String[] InputNumbersArr = InputNumbers.split(" ");
        for(int i = 0; i < MAX_NUMBER_SIZE; i++) {
            playerNumber.add(Integer.parseInt(InputNumbersArr[i]));
        }
        player.setPlayerNumbers(playerNumber);

        return player.getplayerNumbers();
    }

    public static List<Integer> getPlayerNumbers() {
        return player.getplayerNumbers();
    }

    private static void checkValidation(String data) {
        //checkDigitNumber(data); // 자릿수체크
        checkOutOfRange(data); // 범위체크
        //checkInteger(data);   // 정수체크
        //checkDuplicate(data); // 중복체크
    }

    /*      ------------    예외처리를 위한 메소드     ------------       */
    private static void checkDigitNumber(String data) {
        for (int i = 0; i < data.length(); i++) {
            isDigitNumber(data, i);
        }
    }

    private static boolean isDigitNumber(String data, int idx) {
        if (!Character.isDigit(data.charAt(idx))) {
            OutputView.DigitErrorMessage();
            throw new IllegalArgumentException();
        }
        return true;
    }

    private static void checkInteger(String data) {
        if(!isInteger(data)) {
            OutputView.TypeErrorMessage();
            throw new IllegalArgumentException();
        }
    }

    private static boolean isInteger(String data) {
        String value = data.replace(" ", "");
        // if(data == null) return false;
        try {
            Integer integer = Integer.parseInt(value);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    private static void checkOutOfRange(String data) {
        if(isOutOfRange(data)) {
            OutputView.OutOfRangeErrorMessage();
            throw new IllegalArgumentException();
        }
    }

    private static boolean isOutOfRange(String data) {
        String value = data.replace(" ", "");
        if(value.length() != MAX_NUMBER_SIZE)
            return true;
        return false;
    }

    private static void checkDuplicate(String data) {
        if(playerNumbersHasDuplicate(data)) {
            OutputView.DuplicateErrorMessage();
            throw new IllegalArgumentException();
        }
    }

    private static boolean playerNumbersHasDuplicate(String data) {
        String[] value = data.split(" ");
        List<String> dataList = new ArrayList<>(Arrays.asList(value));
        Set<String> numberSet = new HashSet<>(dataList);
        if(numberSet.size() != MAX_NUMBER_SIZE)
            return true;
        return false;
    }
}
