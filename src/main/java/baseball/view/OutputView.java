package baseball.view;

// Console에서 Player에게 보여줄 메세지
public class OutputView {
    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static String ball = "볼";
    private static String strike = "스트라이크";
    private static String nothing = "낫싱";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public static void printStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static void printHintMessage(int[] hint) {   // ball, strike
        if(hint[0] != 0)
            System.out.print(hint[0] + ball + " ");
        if(hint[1] != 0)
            System.out.print(hint[1] + strike);
        if(hint[0] == 0 && hint[1] == 0)
            System.out.print(nothing);
        System.out.println();
    }
    public static void gameEndMessage() {
        System.out.println(GAME_END_MESSAGE);
    }

}
