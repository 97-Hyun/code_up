import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초-반복실행구조] 0 입력될 때까지 무한 출력하기
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int val = Integer.parseInt(br.readLine());

            if (val == 0) {
                break;
            }

            System.out.println(val);
        }

        br.close();
    }
}