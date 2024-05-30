import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1018
// 체스판 다시 칠하기
//8 8
//WBWBWBWB
//BWBWBWBW
//WBWBWBWB
//BWBBBWBW
//WBWBWBWB
//BWBWBWBW
//WBWBWWWB
//BWBWBWBW
public class ChessboardReDrawing1018 {

    public static void main(String[] args) {
        System.out.println(ChessboardReDrawing());
    }

    public static int ChessboardReDrawing() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            String[] nums = reader.readLine().split(" ");

            int row = Integer.parseInt(nums[0]);
            int col = Integer.parseInt(nums[1]);

            int[][] chessboard = new int[row][col];

            int cell = 0;

            // W == 87, B == 66

            int i = 0;
            int j = 0;

            while (true) {
                cell = reader.read();

                if (cell == -1) {
                    break;
                }

                if (cell == 10) {
                    j = 0;
                    i++;
                    continue;
                }

                chessboard[i][j] = cell;

                j++;
            } // done

            i = 0; // row
            j = 0; // col
            int k = 0;
            int h = 0;

            int result = row * col;

            int[][] chessboard_M = new int[8][8];
            while (true) {

                int type_diff_A = 0;
                int type_diff_B = 0;

                for (i = (0 + k); i < (8 + k); i++) {
                    for (j = (0 + h); j < (8 + h); j++) {
                        if (chessboard[0][0] == 87) {

                            if (((i + j) % 2 == 0) && (chessboard[i][j] != 87)) {
                                type_diff_A++;
                            } else if (((i + j) % 2 != 0) && (chessboard[i][j] != 66)) {
                                type_diff_B++;
                            }

                        } else {
                            if (((i + j) % 2 == 0) && (chessboard[i][j] != 66)) {
                                type_diff_A++;
                            } else if (((i + j) % 2 != 0) && (chessboard[i][j] != 87)){
                                type_diff_B++;
                            }
                        }
                    }
                }

                // System.out.print("type_diff_A");
                // System.out.println(type_diff_A);
                // System.out.print("type_diff_B");
                // System.out.println(type_diff_B);


                int type_diff = ((type_diff_A + type_diff_B) > (64 - (type_diff_A + type_diff_B))) ? (64 - (type_diff_A + type_diff_B)) : (type_diff_A + type_diff_B);
                result = (type_diff > result) ? result : type_diff;

                h++;

                if ((h + 8) > col) {
                    h = 0;

                    k++;

                    if ((k + 8) > row) {
                        break;
                    }
                }
            }

            return result;

        } catch (Exception e) {
            System.out.println(e);
        }

        return 0;
    }

}





