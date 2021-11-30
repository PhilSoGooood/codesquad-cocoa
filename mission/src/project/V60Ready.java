package project;
import java.util.Scanner;

public class V60Ready{
	Scanner scanner = new Scanner(System.in);
	static int feedback = 0;
	public void inputBean(){
		int bean;
		System.out.println("Scott Rao 추천 레시피: 원두 22g, 물 360ml");
		System.out.print("원두량을 입력해주세요.>>> ");
		bean = scanner.nextInt();
		if(bean == 22){
			System.out.printf("뜨거운 물 %d ml를 준비해주세요.%n", 360 + feedback);
		}
		if(!(bean == 22)){
			System.out.printf("뜨거운 물 %d ml를 준비해주세요.%n", (bean * 17) + feedback);
		}

		V60FirstPour firstpour = new V60FirstPour();
		firstpour.firstPour();
	}
}
