import java.util.Scanner;

public class BOJ_25314_코딩은체육과목입니다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String total = "";
        int N = sc.nextInt();
        int count = N / 4;
        for (int i = 0; i < count; i++) {
            total += "long ";
        }

        total += "int";
        System.out.println(total);
    }
}
