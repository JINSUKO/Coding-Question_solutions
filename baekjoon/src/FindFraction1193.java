import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    https://www.acmicpc.net/problem/1193

             0   1  2  3  4  5  6           0 2  4  6  8
         0   1   2  6  7 15 16 28 29 45     1 5 13 25 41
         1   3   5  8 14 17 27 30 44        4 8  12 16    1 + (4*x) + (4*(x-1))
         2   4   9 13 18 26 31 43
         3   10 12 19 25 32 42
         4   11 20 24 33 41
         5   21 23 34 40
         6   22 35 39
             36 38
             37

    1. 2차원 배열이라고 했을 때, x와 y가 같은 위치의 숫자가 나오는 패턴을 찾아서 숫자를 구하는 함수를 작성하였다.
    2. 입력 값으로 들어오는 값(위치)가 x와 y가 같은 위치의 숫자보다 작을 때의 x, y를 구하고, 이 직전의 최대 값을 구해서 pre_x, pre_y 할당했다.
    3. 위 두 값 사이의 구간에 구하고자하는 값이 있으므로 경계값을 기준으로 작은 쪽에서는 올라가고, 높은 쪽에서는 내려가면서 해당 위치를 찾았다.

*/

public class FindFraction1193 {
    public static void main(String[] args) {
        System.out.println(FindFraction());
    }

    public static String FindFraction() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
        String answer = "";

        try {
//            int num = Integer.parseInt(reader.readLine());
            int num = Integer.parseInt("14");

            answer = findFaction(num);



        } catch (Exception e) {
            System.err.println(e);
        }


        return answer;

    }

    public static String findFaction(int num) {
        int i = 0;
        while (true) {
            int x = i + 1;
            int y = i + 1;

            int point = recur2(i);

            if (point > num) {

                int pre_point = recur2(i-1);
                int pre_x = i;
                int pre_y = i;

                while (true) {
                    point--;

                    if ((x + y) == 2*(i + 1)) {
                        if (y != 1) {
                            x++;
                            y--;

                            if (point == num) {
                                return String.format("%d/%d", x, y);
                            }
                        } else {
                            x--;

                            if (point == num) {
                                return String.format("%d/%d", x, y);
                            }
                        }

                    } else {
                        if (x != 1) {
                            x--;
                            y++;

                            if (point == num) {
                                return String.format("%d/%d", x, y);
                            }
                        }
                    }


                    pre_point++;

                    if ((pre_x + pre_y) == 2*i) {
                        if (pre_x != 1) {
                            pre_x--;
                            pre_y++;

                            if (pre_point == num) {
                                return String.format("%d/%d", pre_x, pre_y);
                            }
                        } else {
                            pre_y++;

                            if (pre_point == num) {
                                return String.format("%d/%d", pre_x, pre_y);
                            }
                        }

                    } else {
                        if (pre_y != 1) {
                            pre_x++;
                            pre_y--;

                            if (pre_point == num) {
                                return String.format("%d/%d", pre_x, pre_y);
                            }
                        }
                    }

                }

            } else if (point == num) {
                return String.format("%d/%d", x, y);
            }

            i++;
        }
    }

    public static int recur2(int x) {


        if (x != 0) {
            return 4 * x + recur2(x - 1);
        } else {
            return 1;
        }

    }

}
