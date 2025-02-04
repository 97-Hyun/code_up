import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [기초 입출력] 연월일 입력받아 순서 바꿔 출력하기
 * "연도.월.일"을 입력받아 "일-월-연도" 순서로 바꿔 출력해보자.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] date = st.nextToken().split("\\.");
        System.out.println(date[2] + "-" + date[1] + "-" + date[0]);
    }
}