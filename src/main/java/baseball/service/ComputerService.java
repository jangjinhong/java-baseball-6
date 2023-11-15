package baseball.service;

import baseball.entity.Computer;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;

import static baseball.contorller.GameController.MAX_NUMBER_SIZE;

public class ComputerService {
    static Computer computer = new Computer();

    public static List<Integer> makeRandomNumber() {
        List<Integer> computerNumber = computer.getComputerNumber();

        while(computerNumber.size() < MAX_NUMBER_SIZE) {
            computerNumber.add(Randoms.pickNumberInRange(1, 9));
            if(!hasDuplicate(computerNumber))
                computerNumber.remove(computerNumber.size()-1);
        }
        return computerNumber;
    }

    public static boolean hasDuplicate(List<Integer> computerNumber) {
        Set<Integer> numberSet = new HashSet<>(computerNumber);
        if(numberSet.size() != computerNumber.size())
            return false;
        return true;
    }
}