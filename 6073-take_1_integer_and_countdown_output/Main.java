import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초-반복실행구조] 정수 1개 입력ㅂ다아 카운트다운 출력하기2
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        while (val > 0) {
            val--;
            System.out.println(val);
        }

        br.close();
    }
}