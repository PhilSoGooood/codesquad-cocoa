package project;

import java.util.Scanner;

public class CleverReady {
	Scanner scanner = new Scanner(System.in);
	static int feedback = 0;
	public void inputBean(){
		int bean;
		System.out.println("Scott Rao 추천 레시피: 원두 18g, 물 250ml");
		System.out.print("원두량을 입력해주세요.>>> ");
		bean = scanner.nextInt();

		if(bean == 18){
			System.out.printf("뜨거운 물 %d ml를 준비해주세요.%n", 250 + feedback);
		}

		if(!(bean == 18)){
			System.out.printf("뜨거운 물 %d ml를 준비해주세요.%n", (bean * 16) + feedback);
		}

		CleverPour cleverPour = new CleverPour();
		cleverPour.pour();
	}
}
