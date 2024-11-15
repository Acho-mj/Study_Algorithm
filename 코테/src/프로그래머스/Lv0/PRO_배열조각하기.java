package 프로그래머스.Lv0;
import java.util.*;
public class PRO_배열조각하기 {
    public int[] solution(int[] arr, int[] query) {

        // query 베열 순회
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // arr 배열의 query[i]번 인덱스 뒷부분 자름
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else {
                // arr 배열의 query[i]번 인덱스 앞부분 자름
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }

        return arr;
    }
}
