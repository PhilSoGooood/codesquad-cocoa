package project;
import java.util.Scanner;

public class V60Ready{
	Scanner scanner = new Scanner(System.in);
	FirstPour firstpour = new FirstPour();
	public void inputBean(){
		int bean;
		System.out.println("Scott Rao 추천 레시피: 원두 22g, 물 360ml");
		System.out.print("원두량을 입력해주세요.>>> ");
		bean = scanner.nextInt();
		System.out.printf("뜨거운 물 %d ml를 준비해주세요.", bean * 17);

		firstpour.firstPour();
	}
}
