package baseball.view;

public class ValidatorOutputView {
    // Error
    private static final String DUPLICATE_ERROR_MESSAGE = "중복되지 않는 숫자를 입력해주세요.";
    private static final String TYPE_ERROR_MESSAGE = "정수를 입력해주세요.";
    private static final String OUT_OF_RANGE_ERROR_MESSAGE = "1~9까지의 정수를 입력해주세요.";
    private static final String LENGTH_ERROR_MESSAGE = "3개의 숫자를 입력해주세요.";

    public static void TypeErrorMessage() {
        System.out.println(TYPE_ERROR_MESSAGE);
    }
    public static void DuplicateErrorMessage() {
        System.out.println(DUPLICATE_ERROR_MESSAGE);
    }
    public static void OutOfRangeErrorMessage() {
        System.out.println(OUT_OF_RANGE_ERROR_MESSAGE);
    }
    public static void LengthErrorMessage() {
        System.out.println(LENGTH_ERROR_MESSAGE);
    }
}
