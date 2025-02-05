import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초-조건/선택실행구조] 정수 1개 입력받아 분류하기
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long val = Long.parseLong(br.readLine().trim());

        if (val > 0) {
            if (val % 2 == 0) {
                System.out.println("C\n");
            } else {
                System.out.println("D\n");
            }
        } else {
            if (val % 2 == 0) {
                System.out.println("A\n");
            } else {
                System.out.println("B\n");
            }
        }

        br.close();
    }
}