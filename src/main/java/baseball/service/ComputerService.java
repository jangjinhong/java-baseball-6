package baseball.service;

import baseball.entity.Computer;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;

import static baseball.contorller.GameController.MAX_NUMBER_SIZE;

public class ComputerService {
    static Computer computer = new Computer();

    public ComputerService() {
        getRandomNumbers();
    }
    
    // 난수 3자리 가져오기
    public static List<Integer> getRandomNumbers() {
        List<Integer> computerNumbers = computer.getcomputerNumbers();

        while(computerNumbers.size() < MAX_NUMBER_SIZE) {
            computerNumbersHasDuplicate(Randoms.pickNumberInRange(1, 9), computerNumbers);
        }
        return computerNumbers;
    }

    public static void computerNumbersHasDuplicate(int number, List<Integer> list) {
        if(!list.contains(number)) {
            list.add(number);
        }
        /*
        Set<Integer> numberSet = new HashSet<>(computerNumbers);
        if(numberSet.size() != computerNumbers.size())
            return true;
        return false;
         */
    }
}