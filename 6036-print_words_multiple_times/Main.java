import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초 산술연산] 단어 여러 번 출력하기
 * 단어와 반복 횟수를 입력받아 여러 번 출력하기
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        System.out.print(str[0].repeat(Integer.parseInt(str[1])));

        br.close();
    }
}