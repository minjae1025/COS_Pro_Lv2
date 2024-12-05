package Q1;

public class Solution {
    public int solution(int[] arr, int N, int M) {
        int answer = 0;

        for (int i = 0; i < N - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        for (int i = 1; i < N; i++) {
            if (i % M == 0) {
                answer += arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {4,2,1,3,9,5,6};
        int N1 = 7;
        int M1 = 3;
        int ret1 = sol.solution(arr1, N1, M1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] arr2 = {7,6,5,4,3,2,1};
        int N2 = 7;
        int M2 = 3;
        int ret2 = sol.solution(arr2, N2, M2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int[] arr3 = {8,6,3,3,4,1,5,7}; // 1, 3, 3, 4, 5, 6, 7, 8
        int N3 = 8;
        int M3 = 2;
        int ret3 = sol.solution(arr3, N3, M3);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");

    }
}
