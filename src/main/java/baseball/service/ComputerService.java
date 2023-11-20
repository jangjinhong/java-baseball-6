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
}