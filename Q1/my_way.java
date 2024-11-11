package Q1;

import java.util.*;

public class my_way {
    public static void main(String[] args) {
        solution Q1 = new solution();

        int[] arr1 = {4, 2, 3, 9, 5, 6};
        int N1 = 7;
        int M1 = 3;
        System.out.println(Q1.solution(arr1, N1, M1));
    }
}

class solution {
    public int solution(int[] arr, int M, int N) {
        int answer = 0;

        Arrays.sort(arr);

        for (int i = 0; i<N; i++) {
            if (i % M == 0) {
                answer += arr[i];
            }
        }

        return answer;
    }
}
