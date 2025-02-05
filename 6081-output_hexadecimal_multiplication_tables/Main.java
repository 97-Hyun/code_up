import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초-종합] 16진수 구구단 출력하기
 * A, B, C, D, E, F 중 하나가 입력될 때,
 * 1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
 * (단, A ~ F 까지만 입력된다.)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str, 16);

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n", num, i, num*i);
        }

        br.close();
    }
}