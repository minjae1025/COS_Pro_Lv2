package Q5;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[][] board) {

        int min_avg = 100;
        int max_avg = 0;

        for (int i = 0; i < 5; i++) {
            int sum_x = 0;
            int sum_y = 0;
            for (int j = 0; j < 5; j++) {
                sum_x += board[i][j];
                sum_y += board[j][i];
            }

            sum_x /= 5;
            sum_y /= 5;

            if (max_avg < sum_x) {
                max_avg = sum_x;
            }
            if (max_avg < sum_y) {
                max_avg = sum_y;
            }
            if (min_avg > sum_x) {
                min_avg = sum_x;
            }
            if (min_avg > sum_y) {
                min_avg = sum_y;
            }

        }

        int sum_d1 = 0;
        int sum_d2 = 0;

        for (int i = 0; i < 5; i++) {
            sum_d1 += board[i][i];
            sum_d2 += board[i][4-1];
        }

        sum_d1 /= 5;
        sum_d2 /= 5;

        if (max_avg < sum_d1) {
            max_avg = sum_d1;
        }
        if (max_avg < sum_d2) {
            max_avg = sum_d2;
        }
        if (min_avg > sum_d1) {
            min_avg = sum_d1;
        }
        if (min_avg > sum_d2) {
            min_avg = sum_d2;
        }

        return min_avg + max_avg;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] board1 = {{25,11,82,61,34},{87,98,91,76,95},{44,2,39,57,65},{69,32,51,16,41},{94,27,74,37,9}};
        int ret1 = sol.solution(board1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    }
}

