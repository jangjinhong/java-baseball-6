package baseball.service;

import baseball.entity.Computer;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;

import static baseball.contorller.GameController.MAX_NUMBER_SIZE;

public class ComputerService {
    static Computer computer = new Computer();

    public static List<Integer> makeRandomNumbers() {
        List<Integer> computerNumbers = computer.getcomputerNumbers();

        while(computerNumbers.size() < MAX_NUMBER_SIZE) {
            computerNumbers.add(Randoms.pickNumberInRange(1, 9));
            if(computerNumbersHasDuplicate(computerNumbers))
                computerNumbers.remove(computerNumbers.size()-1);
        }
        return computerNumbers;
    }

    public static boolean computerNumbersHasDuplicate(List<Integer> computerNumbers) {
        Set<Integer> numberSet = new HashSet<>(computerNumbers);
        if(numberSet.size() != computerNumbers.size())
            return true;
        return false;
    }
}