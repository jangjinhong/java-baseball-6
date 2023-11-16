package baseball.service;
import baseball.entity.Player;

import java.util.*;

public class Compare {
    private static int strike;
    private static int ball;

    public void compareTo(List<Integer> computerNumbers, Player player) {
        List<Integer> playerNumbers = player.getplayerNumber();

        if(!win(computerNumbers, playerNumbers))
            StrikeOrBallCount(computerNumbers, playerNumbers);
    }

    public static void StrikeOrBallCount(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        System.out.println(playerNumbers.toString());
        System.out.println(computerNumbers.toString());

        System.out.println("strike: " + countStrike(computerNumbers, playerNumbers));
        System.out.println("ball: " + countBall(computerNumbers, playerNumbers));
    }

    private static int countStrike(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        strike = 0;
        for(int i = 0; i < computerNumbers.size(); i++) {
            int value1 = computerNumbers.get(i);

            if(i < playerNumbers.size()) {
                int value2 = playerNumbers.get(i);

                if(valueEqual(value1, value2))
                    strike++;
            }
        }
        return strike;
    }

    private static int countBall(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        ball = 0;
        for(int i = 0; i < computerNumbers.size(); i++) {
            int value1 = computerNumbers.get(i);

            if(i < playerNumbers.size()) {
                int value2 = playerNumbers.get(i);

                if(!valueEqual(value1, value2) && computerNumbers.contains(value2))
                    ball++;
            }
        }
        return ball;
    }

    private static boolean valueEqual(int value1, int value2) {
        return value1 == value2;
    }

    public static boolean win(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        if(computerNumbers.containsAll(playerNumbers))
            return true;
        return false;
    }

}

