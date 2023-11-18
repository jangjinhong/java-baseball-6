package baseball.entity;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> playerNumbers = new ArrayList<>();

    public List<Integer> getplayerNumbers() {
        return playerNumbers;
    }
    public void setPlayerNumbers(List<Integer> playerNumber) {
        this.playerNumbers = playerNumber;
    }

}
