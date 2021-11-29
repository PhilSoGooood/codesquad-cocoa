package project;

import java.util.Scanner;

public class V60Feedback {
	public void feedback() {
		Scanner scanner = new Scanner(System.in);
		int result;
		while (true){
			System.out.println();
			System.out.println("------------------ 커피의 맛이 어땠나요? ------------------");
			System.out.println(" 		      [1]맛있다 [2]연하다 [3]진하다      ");
			System.out.println("------------------------------------------------------");

			result = scanner.nextInt();

			if(1 > result || result > 3){
				System.out.println("1 ~ 3 사이의 번호를 입력해주세요.");
				continue;
			}
			break;
		}
		if(result == 1){
			System.out.println("커피와 함께 즐거운 시간 되세요.");
		}

		if(result == 2){
			V60Ready.feedback -= 10;
		}

		if(result == 3){
			V60Ready.feedback += 10;
		}
	}
}
