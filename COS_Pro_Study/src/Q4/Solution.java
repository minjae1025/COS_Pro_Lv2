package Q4;

import java.util.*;

class Solution {
    public int solution(int[] arr, int N, int M) {
        int min_sum = 50000;
        int max_sum = 0;

        for (int i = 0; i < N - M + 1; i++) {
            int temp_max = 0;
            for (int j = i; j < i + M; j++) {
                temp_max += arr[j];
            }
            if (temp_max > max_sum) {
				max_sum = temp_max;
            }
            if (temp_max < min_sum) {
				min_sum = temp_max;
            }
        }

        return max_sum - min_sum;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {3,1,1,4,5,9};
        int N1 = 6;
        int M1 = 3;
        int ret1 = sol.solution(arr1, N1, M1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] arr2 = {3,1,1,4,5,9};
        int N2 = 6;
        int M2 = 2;
        int ret2 = sol.solution(arr2, N2, M2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int[] arr3 = {1,2,3,4,5,6};
        int N3 = 6;
        int M3 = 4;
        int ret3 = sol.solution(arr3, N3, M3);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");

    }
}

