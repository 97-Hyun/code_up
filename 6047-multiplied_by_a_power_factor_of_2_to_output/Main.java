import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초 비트시프트연산] 2의 거듭제곱 배로 곱해 출력하기
 * 정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        System.out.print(Integer.parseInt(str[0]) << Integer.parseInt(str[1]));

        br.close();
    }
}