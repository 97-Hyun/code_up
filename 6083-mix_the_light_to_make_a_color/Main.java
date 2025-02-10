import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int r = Integer.parseInt(input[0]);
        int g = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int ret = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.printf("%d %d %d\n", i, j, k);
                    ret++;
                }
            }
        }

        System.out.println(ret);

        br.close();
    }
}