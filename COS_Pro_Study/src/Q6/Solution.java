package Q6;//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[] arr, int N) {
        int[] frequency = new int[101];

        for (int i = 0; i < N; i++) {
			frequency[arr[i]] += 1;
        }

        int best = 0;
        int num = 0;

        for (int i = 0; i<frequency.length; i++) {
            if (best <= frequency[i]) {
                best = frequency[i];
                if (num < i) {
					num = i;
                }
            }
        }

        return num;

    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1,2,3,4,4,5,6,7,7,8,9,9,9,9,10};
        int N1 = 15;
        int ret1 = sol.solution(arr1, N1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] arr2 = {1,1,4,4,8,8,8,8,9,9,9,9,1,4,4,4,5,3,2,2,1,4,8,7};
        int N2 = 24;
        int ret2 = sol.solution(arr2, N2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int[] arr3 = {3,3,3,3,3,5,5,5,5,5,9,9,9,9,9,11,11,11,11,11};
        int N3 = 20;
        int ret3 = sol.solution(arr3, N3);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");

    }
}
