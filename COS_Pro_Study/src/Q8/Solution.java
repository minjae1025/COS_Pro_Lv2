package Q8;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[][] arr) {
        int N = 10;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    int length = 0;

                    for (int w = 2; w < 11; w++) {
                        boolean is_square = true;

                        for (int di = i; di < i+w; di++) {
                            for (int dj = j; dj < j+w; dj++) {
                                if (di >= N || dj >= N || arr[di][dj] == 0) {
                                    is_square = false;
                                    break;
                                }
                            }
                            if (!is_square) {
                                break;
                            }
                        }

                        if (is_square) {
                            length = w;
                        } else {
                            break;
                        }
                    }

                    if (length > 1) {
                        for (int di = i; di < i+length; di++) {
                            for (int dj = j; dj < j+length; dj++) {
                                arr[di][dj] = 0;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    return 0;
                }
            }
        }

        return 1;

    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] arr1 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},  {0, 0, 0, 0, 0, 0, 1, 1, 1, 1},  {0, 0, 1, 1, 1, 0, 1, 1, 1, 1},  {0, 0, 1, 1, 1, 0, 1, 1, 1, 1},  {0, 0, 1, 1, 1, 0, 1, 1, 1, 1},  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},  {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},  {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},  {0, 0, 0, 1, 1, 1, 1, 0, 0, 0}};
        int ret1 = sol.solution(arr1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] arr2 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},  {0, 0, 0, 0, 0, 0, 0, 1, 1, 1},  {0, 1, 1, 1, 1, 1, 0, 1, 1, 1},  {0, 1, 1, 1, 1, 1, 0, 1, 1, 1},  {0, 1, 1, 1, 1, 1, 0, 1, 1, 1},  {0, 1, 1, 1, 1, 1, 0, 1, 1, 1},  {0, 1, 1, 1, 1, 1, 0, 1, 1, 1},  {0, 1, 1, 1, 1, 0, 0, 0, 0, 0},  {0, 1, 1, 1, 1, 0, 0, 0, 0, 0},  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        int ret2 = sol.solution(arr2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int[][] arr3 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 0, 0, 1, 1}, {0, 1, 1, 1, 1, 1, 0, 0, 1, 1}, {0, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 0, 0, 0, 0, 0, 0}};
        int ret3 = sol.solution(arr3);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");

    }
}

