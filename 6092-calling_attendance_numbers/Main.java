import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        // 자바는 배열을 생성할 때 0으로 초기화되므로 따로 초기화하지 않아도 된다.
        int[] arr = new int[23];

        for (int i = 0; i < num; i++) {
            arr[Integer.parseInt(input[i]) - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        br.close();
    }
}