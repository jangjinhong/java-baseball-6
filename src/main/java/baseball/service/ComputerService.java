package baseball.service;

import baseball.entity.Computer;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;

import static baseball.utils.Constant.*;

public class ComputerService {
    static Computer computer = new Computer();

    // 난수 3자리 생성
    public static List<Integer> generateRandomNumbers() {
        List<Integer> computerNumbers = new ArrayList<>();
        while(computerNumbers.size() < MAX_NUMBER_SIZE) {
            computerNumbersHasDuplicate(Randoms.pickNumberInRange(MIN_NUMBER_LENGTH, MAX_NUMBER_LENGTH), computerNumbers);
        }
        computer.setComputerNumbers(computerNumbers);
        return computer.getcomputerNumbers();
    }

    public static List<Integer> getRandomNumbers() {
        return computer.getcomputerNumbers();
    }

    public static void computerNumbersHasDuplicate(int number, List<Integer> list) {
        if(!list.contains(number)) {
            list.add(number);
        }
    }

    /* ------- Compare 연산 ------- */
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
        System.out.println("ballCount: "+ballCount+"\t strikeCount: "+strikeCount);
        return new int[]{ballCount, strikeCount};
    }
}