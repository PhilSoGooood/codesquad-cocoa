package project;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class V60Finish {
	public void spin(){
		Scanner scanner = new Scanner(System.in);
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			int count = 10;
			@Override
			public void run() {
				if(count > 0){
					System.out.printf("남은 시간 %d초%n", count);
					count--;
				}
				else {
					timer.cancel();
					System.out.println("시간 종료.");
					System.out.print("만족스러운 커피가 추출되었나요?(y/n) >> ");
					String result = scanner.nextLine();

					if(result.equalsIgnoreCase("Y")){
						V60Feedback v60Feedback = new V60Feedback();
						v60Feedback.feedback();
					}
					if(result.equalsIgnoreCase("N")) {
						System.out.println("커피와 함께 즐거운 시간 보내세요.");
					}
				}
			}
		};
		System.out.println("드리퍼를 잡고 원을 그리며 가볍게 흔들어 주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
