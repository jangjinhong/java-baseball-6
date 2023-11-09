package baseball;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.print("숫자를 입력해주세요 : ");

        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i=0; i<num.length; i++) num[i] = sc.nextInt();

        System.out.println(Arrays.toString(num));
    }
}
