import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초 산술연산] 정수 2개 입력받아 거듭제곱 계산하기
 * 정수 2개(a, b)를 입력받아 a를 b번 곱한 거듭제곱을 출력해보자.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        System.out.print(Math.round(Math.pow(Integer.parseInt(str[0]), Integer.parseInt(str[1]))));

        br.close();
    }
}