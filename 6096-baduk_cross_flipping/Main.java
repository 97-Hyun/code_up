import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int board[][] = new int[19][19];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 19; i++) {
            String[] input = br.readLine().split(" ");

            for (int j = 0; j < 19; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]) - 1;
            int y = Integer.parseInt(input[1]) - 1;

            flip(x, y);
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }

    public static void flip(int x, int y) {
        int tmp = board[x][y];

        for (int i = 0; i < 19; i++) {
            board[x][i] = board[x][i] == 0 ? 1 : 0;
            board[i][y] = board[i][y] == 0 ? 1 : 0;
        }

        board[x][y] = tmp;
    }
}