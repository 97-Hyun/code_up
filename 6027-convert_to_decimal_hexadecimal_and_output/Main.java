import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초 출력 변환] 10진 정수 입력받아 16진수 대문자로 출력하기 
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int decimal = Integer.parseInt(st.nextToken());
        // System.out.printf("%X", decimal);
        // System.out.print(Integer.toString(Integer.parseInt(st.nextToken()), 16).toUpperCase());
        System.out.print(Integer.toHexString(Integer.parseInt(st.nextToken())).toUpperCase());
        br.close();
    }
}