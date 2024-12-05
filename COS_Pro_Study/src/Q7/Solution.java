package Q7;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[][] arr, int N) {
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int a = arr[i][0];
            int b = arr[i][1];


            int c = gcd(a, b);

            if (c > answer) {
                answer = c;
            }

        }

        return answer;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] arr1 = {{15,20},{36,48},{12,7},{121,44},{39,65}};
        int N1 = 5;
        int ret1 = sol.solution(arr1, N1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] arr2 = {{356,78},{154,122},{38,190},{44,188},{365,245}};
        int N2 = 5;
        int ret2 = sol.solution(arr2, N2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}

