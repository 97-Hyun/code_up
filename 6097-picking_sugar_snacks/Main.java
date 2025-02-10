import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] board_size = br.readLine().split(" ");
        int board[][] = new int[Integer.parseInt(board_size[0])][Integer.parseInt(board_size[1])];
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int l = Integer.parseInt(input[0]);
            int d = Integer.parseInt(input[1]);
            int x = Integer.parseInt(input[2]) - 1;
            int y = Integer.parseInt(input[3]) - 1;

            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    board[x][y + j] = 1;
                } else {
                    board[x + j][y] = 1;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}