package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String REQUEST_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String REQUEST_RETRY_NUMBER_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void run() {
        printStartMessage();
        NumberRequestMessage();
    }
    public static void printStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }
    public static void NumberRequestMessage() {
        System.out.print(REQUEST_NUMBER_MESSAGE);
    }

    public static String setRetryNumber() {
        System.out.println(REQUEST_RETRY_NUMBER_MESSAGE);

        return Console.readLine();
    }
}
