import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [기초-조건/선택실행구조] 평가 입력받아 다르게 출력하기
 * 평가를 문자(A, B, C, D)로 입력받아 내용을 다르게 출력해보자.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char val = (char) br.read();

        switch (val) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;    
            default:
                System.out.println("what?");
                break;
        }

        br.close();
    }
}