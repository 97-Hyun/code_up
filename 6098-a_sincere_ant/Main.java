import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int board[][] = new int[10][10];
        int x = 1;
        int y = 1;

        for (int i = 0; i < 10; i++) {
            String[] input = br.readLine().split(" ");

            for (int j = 0; j < 10; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }

        while (true) {
            board[x][y] = 9;

            if (board[x][y + 1] == 0) {
                y++;
            } else if (board[x][y + 1] == 2) {
                board[x][y + 1] = 9;
                break;
            } else if (board[x][y + 1] == 1) {
                if (board[x + 1][y] == 0) {
                    x++;
                } else if (board[x + 1][y] == 2) {
                    board[x + 1][y] = 9;
                    break;
                } else if (board[x + 1][y] == 1) {
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}