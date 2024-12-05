package Q9;

//다음과 같이 import를 사용할 수 있습니다.

//실제 정답
//class Solution {
//    public int solution(int[] arr, int N, int J) {
//        int now = 0;
//
//        Queue<Integer> q = new LinkedList<>();
//
//        for (int i = 0; i < N; i++) {
//            q.add(arr[i]);
//        }
//
//        while (J > 0) {
//            int eat = q.poll();
//            J -= eat;
//            q.add(eat);
//            now += 1;
//
//            if (now > N) {
//                now = 1;
//            }
//        }
//
//        return now;
//    }
//}


//내 풀이
class My_Solution {
    public int solution(int[] arr, int N, int J) {
        int answer = 1;
        int i = 0;
        while (true) {
            J -= arr[i];
            if (J <= 0 ) {
                answer = i+1;
                break;
            }
            else {
                i++;
            }

            i %= N;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        My_Solution sol = new My_Solution();

        int[] arr1 = {7, 5, 2, 9, 3, 4};
        int N1 = 6;
        int J1 = 80;
        int ret1 = sol.solution(arr1, N1, J1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] arr2 = {4, 11, 6, 5, 7, 1, 2, 9, 15};
        int N2 = 9;
        int J2 = 444;
        int ret2 = sol.solution(arr2, N2, J2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int[] arr3 = {1, 3, 1, 3, 1};
        int N3 = 5;
        int J3 = 131;
        int ret3 = sol.solution(arr3, N3, J3);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");

    }
}

