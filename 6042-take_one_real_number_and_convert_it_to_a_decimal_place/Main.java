import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초 값 변환] 실수 1개 입력받아 소수점이하 자리 변환하기
 * 실수1개를 입력받아 소수점 이하 두 번째 자리에서 반올림하여 값 출력하기
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(Math.round(Float.parseFloat(br.readLine()) * 100) / 100.0);

        br.close();
    }
}