package baseball.utils;

import baseball.view.ValidatorOutputView;
import java.util.HashSet;
import java.util.Set;
import static baseball.utils.Constant.MAX_NUMBER_SIZE;

public class Validator {
    /*      ------------    예외처리를 위한 메소드     ------------       */
    public static boolean checkNumbersLength(String data) throws IllegalArgumentException {
        if(data.length() != MAX_NUMBER_SIZE) {
            ValidatorOutputView.LengthErrorMessage();
            throw new IllegalArgumentException();
        }
        return true;
    }

    public static boolean checkInteger(String data) {
        if(!isInteger(data)) {
            ValidatorOutputView.TypeErrorMessage();
            throw new IllegalArgumentException();
        }
        return true;
    }

    private static boolean isInteger(String data) {
        String value = data.replace(" ", "");
        try {
            Integer integer = Integer.parseInt(value);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkOutOfRange(String data) {
        if(isOutOfRange(data)) {
            ValidatorOutputView.OutOfRangeErrorMessage();
            throw new IllegalArgumentException();
        }
        return true;
    }

    private static boolean isOutOfRange(String data) {
        String value = data.replace(" ", "");
        if(value.length() != MAX_NUMBER_SIZE)
            return true;
        return false;
    }

    public static boolean checkDuplicate(String data) throws IllegalArgumentException {
        if(!isUniqueNumbers(data)) {
            ValidatorOutputView.DuplicateErrorMessage();
            throw new IllegalArgumentException();
        }
        return true;
    }

    private static boolean isUniqueNumbers(String data) {
        Set<Character> numberSet = new HashSet<>();
        for(int i=0; i<data.length(); i++)
            numberSet.add(data.charAt(i));
        if(numberSet.size() != MAX_NUMBER_SIZE)
            return false;
        return true;
    }
}
