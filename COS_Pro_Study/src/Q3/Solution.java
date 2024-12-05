package Q3;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    static final int RED = 1;
    static final int BLUE = 2;
    static final int GRAY = 3;

    public int solution(int N, int M, int[][] area, int C) {
        int answer = 0;

        int[][] paper = new int[N][N];

        for (int i = 0; i < M; i++) {
            int[] target = area[i];

            int from_r = target[0];
            int from_c = target[1];
            int to_r = target[2];
            int to_c = target[3];
            int color = target[4];

            for (int r = from_r; r <= to_r; r++) {
                for (int c = from_c; c <= to_c; c++) {
                    if (paper[r][c] == 0 ) {
                        paper[r][c] = color;
                    } else if (paper[r][c] != color) {
                        paper[r][c] = GRAY;
                    }
                }
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (C == paper[r][c]) {
                    answer += 1;
                }
            }
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int N1 = 10;
        int M1 = 2;
        int[][] area1 = {{1,1,5,4,1},{2,3,6,6,2}};
        int C1 = 3;
        int ret1 = sol.solution(N1, M1, area1, C1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int N2 = 10;
        int M2 = 2;
        int[][] area2 = {{1,1,5,4,1},{2,3,6,6,1}};
        int C2 = 3;
        int ret2 = sol.solution(N2, M2, area2, C2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}

