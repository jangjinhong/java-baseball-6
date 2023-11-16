package baseball.view;

// Console에서 Player에게 보여줄 메세지
public class OutputView {
    private static String ball = "볼";
    private static String strike = "스트라이크";
    private static String nothing = "낫싱";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    // Error
    private static final String DUPLICATE_ERROR_MESSAGE = "중복되지 않는 숫자를 입력해주세요.";
    private static final String TYPE_ERROR_MESSAGE = "정수를 입력해주세요.";
    private static final String OUT_OF_RANGE_ERROR_MESSAGE = "1~9까지의 정수를 입력해주세요.";

    public static void printBallStrikeMessage() {
        System.out.print(ball + " ");
    }

    public static void printBallMessage() {
        System.out.println(ball);
    }
    
    public static void printStrikeMessage() {
        System.out.println(strike);
    }

    public static void printNothingMessage() {
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

}
