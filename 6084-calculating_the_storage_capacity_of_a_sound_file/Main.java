import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// h(1초 동안 소리 강약 체크 횟수 헤르츠), b(한 번 체크한 결과를 저장하는 비트), c(채널 개수), s(녹음할 시간 초)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int h = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int s = Integer.parseInt(input[3]);

        double result = (double)h * b * c * s / 8 / 1024 / 1024;

        System.out.printf("%.1f MB\n", result);

        br.close();
    }
}