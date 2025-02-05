import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초-종합] 3 6 9 게임의 왕이 되자
 * 만약 3, 6, 9 가 들어간 수를 자신이 불러야 하는 상황이라면, 수를 부르는 대신 "박수(X)" 를 쳐야 한다.
 * 33과 같이 3,6,9가 두 번 들어간 수 일때, "짝짝"과 같이 박수를 두 번 치는 형태도 있다. 
 * 30 보다 작은 정수 1개가 입력된다. (1 ~ 29)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());

        for (int i = 1; i <= num; i++) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.print("X ");
            } else {
                System.out.printf("%d ", i);
            }
        }

        System.out.println();

        br.close();
    }
}