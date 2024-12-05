package Q2;

public class My_Solution {
    public int solution(int[][] watering_can, int N, int M) {
        int answer = 0;
        for (int i = 0; i < M; i++) {
            int[] temp_can = watering_can[i];
            for (int j = 1; j <= temp_can[2]; j++) {
                if (temp_can[0] + j < N) {
                    answer++;
                }
                if (temp_can[0] - j >= 0) {
                    answer++;
                }
                if (temp_can[1] + j < N) {
                    answer++;
                }
                if (temp_can[1] - j >= 0) {
                    answer++;
                }
            }
        }
        return (N * N) - answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] watering_can1 = {{2,2,2},{0,0,1}};
        int N1 = 5;
        int M1 = 2;
        int ret1 = sol.solution(watering_can1, N1, M1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    }
}
