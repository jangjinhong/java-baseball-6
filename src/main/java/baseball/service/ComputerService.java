package baseball.service;

import baseball.entity.Computer;

import java.util.*;

public class ComputerService {
    private Computer computer;

    public List<Integer> makeRandom() {
        List<Integer> computerNum = computer.getComputerNum();
        for(int i = 0; i < 3; i++) {
            computerNum.add(i, (int)(Math.random()*9 +1));
            for(int j = 0; j < i; j++) {
                if(computerNum.get(i) == computerNum.get(j)) {
                    computerNum.remove(i);
                    i--;
                    break;
                }
            }
        }
        return computerNum;
    }
}
