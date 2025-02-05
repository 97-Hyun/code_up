import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초-반복실행구조] 문자 1개 입력받아 알파벳 출력하기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char val = (char) br.read();
        char ch = 'a';

        while (true) {
            System.out.printf("%c ", ch);

            if (ch == val) break;

            ch = (char)(ch + 1);
        }

        System.out.println();

        br.close();
    }
}