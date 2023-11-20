package baseball.service;

import java.util.List;

public class Compare {
    private static int countBall(List<Integer> computerNumbers, String playerNumbers) {
        int ball = 0;

        for(int i = 0; i < playerNumbers.length(); i++) {
            if(computerNumbers.contains(Character.getNumericValue(playerNumbers.charAt(i)))) {
                ball++;
            }
        }
        ball -= countStrike(computerNumbers, playerNumbers);
        return ball;
    }

    public static int countStrike(List<Integer> computerNumbers, String playerNumbers) {
        int strike = 0;
        for(char playerNum : playerNumbers.toCharArray()) {
            if(computerNumbers.indexOf(Character.getNumericValue(playerNum)) == playerNumbers.indexOf(playerNum))
                strike++;
        }
        return strike;
    }

    public static int[] getHint(List<Integer> computerNumbers, String playerNumbers) {
        int strikeCount = countStrike(computerNumbers, playerNumbers);
        int ballCount = countBall(computerNumbers, playerNumbers);

        return new int[]{ballCount, strikeCount};
    }
}
