package 프로그래머스.Lv0;

public class PRO_문자열섞기 {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] str_1 = str1.split("");
        String[] str_2 = str2.split("");

        for(int i=0; i<str_1.length; i++){
            answer += str_1[i] + str_2[i];
        }
        return answer;
    }
}
