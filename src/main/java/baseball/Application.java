package baseball;
import baseball.contorller.GameController;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println(gameController.makeRandomNumber());


/*
        makeRandom(computerNum);

        System.out.println("숫자 야구 게임을 시작합니다.");

        while(true) {
            System.out.println("computerNum: " + computerNum.toString());
            System.out.print("숫자를 입력해주세요 : ");
            for (int i = 0; i < 3; i++) {
                userNum.add(i, sc.nextInt());
                if(userNum.get(i) == 0) {
                    throw new IllegalArgumentException("입력에러");
                }
                for (int j = 0; j < i; j++) {
                    if (userNum.get(i) == userNum.get(j)) {
                        throw new IllegalArgumentException("중복값 입력에러");
                    }
                }
            }
            System.out.println("userNum: " + userNum.toString());

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (userNum.get(i) == computerNum.get(j) && i == j)
                        strike++;
                    else if (userNum.get(i) == computerNum.get(j) && i != j)
                        ball++;
                }
            }



            if(strike == 0 && ball == 0) {
                System.out.println("낫싱");
            }
            if(strike == 3) {
                strike = 0;
                ball = 0;
                userNum.clear();
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                if(sc.nextInt() == 1) {
                    makeRandom(computerNum);
                    continue;
                }
                else return;
            }
            if(strike != 0 && ball == 0) {
                System.out.println(strike + "스트라이크");
            }
            if(strike == 0 && ball != 0) {
                System.out.println(ball + "볼");
            }
            if(strike != 0 && ball != 0) {
                System.out.println(ball + "볼 " + strike + "스트라이크");
            }
            strike = 0;
            ball = 0;
            userNum.clear();
        }
        */
    }
}
