package 프로그래머스.Lv0;

public class PRO_문자열겹쳐쓰기 {
    class Solution {
        public String solution(String my_string, String overwrite_string, int s) {
            String answer = "";
            char[] origin = my_string.toCharArray();

            // s 전까지 원래 문자 유지하고 overwrite 붙이기
            for(int i = 0; i<s; i++){
                answer += origin[i];
            }

            answer += overwrite_string;

            for(int i = s + overwrite_string.length(); i<origin.length; i++)
                answer += origin[i];

            return answer;
        }
    }
}
