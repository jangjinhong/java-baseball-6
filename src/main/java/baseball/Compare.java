package baseball;
import java.util.*;

public class Compare {
    public int countStrike(List<Integer> userNum, List<Integer> computerNum) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (userNum.get(i) == computerNum.get(j) && i == j)
                    strike++;
            }
        }
        return strike;
    }

    public int countBall(List<Integer> userNum, List<Integer> computerNum) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (userNum.get(i) == computerNum.get(j) && i != j)
                    ball++;
            }
        }
        return ball;
    }
}

