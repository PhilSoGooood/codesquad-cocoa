import java.util.Scanner;
public class gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작단을 입력해주세요: ");
        int a = sc.nextInt(); // 구구단 시작단
        System.out.println("끝단을 입력해주세요: ");
        int b = sc.nextInt(); // 구구단 끝단
        for(int i=a; i<=b; i++) {
            for(int j=1; j<=9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
