package baseball.view;

// Console에서 Player에게 보여줄 메세지
public class OutputView {
    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String NUMBER_REQUEST_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String DUPLICATE_ERROR_MESSAGE = "중복되지 않는 숫자를 입력해주세요.";
    private static final String TYPE_ERROR_MESSAGE = "정수를 입력해주세요.";
    private static final String OUT_OF_RANGE_ERROR_MESSAGE = "1~9까지의 정수를 입력해주세요.";

    public static void printStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }
    public static void NumberRequestMessage() {
        System.out.print(NUMBER_REQUEST_MESSAGE);
    }

    public static void TypeErrorMessage() {
        System.out.println(TYPE_ERROR_MESSAGE);
    }
    public static void DuplicateErrorMessage() {
        System.out.println(DUPLICATE_ERROR_MESSAGE);
    }

    public static void OutOfRangeErrorMessage() {
        System.out.println(OUT_OF_RANGE_ERROR_MESSAGE);
    }

}
