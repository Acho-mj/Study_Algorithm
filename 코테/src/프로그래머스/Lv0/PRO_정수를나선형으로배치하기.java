package 프로그래머스.Lv0;

public class PRO_정수를나선형으로배치하기 {
    class Solution {
        public int[][] solution(int n) {
            // 배열 선언 및 생성
            int[][] answer = new int[n][n];

            int num = 1;
            // 방향 설정 (나선형태 구현)
            // 열
            int left = 0;
            int right = n-1;
            // 행
            int top = 0;
            int bottom = n-1;

            // 배열 전체 (교차하기 전까지)
            while(left <= right && top <= bottom){

                // 오른쪽 이동(행 고정 top)
                for(int i=left; i<=right; i++){
                    answer[top][i] = num++;
                }
                top ++;

                // 아래로 이동(열 고정 right)
                for(int i=top; i<=bottom; i++){
                    answer[i][right] = num++;
                }
                right --;

                // 왼쪽 이동(행 고정 bottom)
                for(int i=right; i>=left; i--){
                    answer[bottom][i] = num++;
                }
                bottom --;

                // 위로 이동(열 고정 left)
                for(int i=bottom; i>=top; i--){
                    answer[i][left] = num++;
                }
                left ++;
            }

            return answer;
        }
    }
}
