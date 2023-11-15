package baseball.entity;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> playerNumber = new ArrayList<>();

    public List<Integer> getplayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(List<Integer> playerNumber) {
        this.playerNumber = playerNumber;
    }

}
