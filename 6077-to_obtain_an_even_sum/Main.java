import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초-종합] 짝수 합 구하기
 * 정수 (1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= val; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

        br.close();
    }
}