package baseball.view;

// Console에서 Player에게 보여줄 메세지
public class OutputView {
    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static String ball = "볼";
    private static String strike = "스트라이크";
    private static String nothing = "낫싱";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    // Error
    private static final String DUPLICATE_ERROR_MESSAGE = "중복되지 않는 숫자를 입력해주세요.";
    private static final String TYPE_ERROR_MESSAGE = "정수를 입력해주세요.";
    private static final String OUT_OF_RANGE_ERROR_MESSAGE = "1~9까지의 정수를 입력해주세요.";
    private static final String DIGIT_ERROR_MESSAGE = "정수를 입력해주세요.";

    public static void printStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static void printHintMessage(int[] hint) {   // ball, strike
        if(hint[0] != 0)
            System.out.print(hint[0] + ball + " ");
        if(hint[1] != 0)
            System.out.println(hint[1] + strike);
        if(hint[0] == 0 && hint[1] == 0)
            System.out.println(nothing);
    }
    public static void gameEndMessage() {
        System.out.println(GAME_END_MESSAGE);
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
    public static void DigitErrorMessage() {
        System.out.println(DIGIT_ERROR_MESSAGE);
    }
}
