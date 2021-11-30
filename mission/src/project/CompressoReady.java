package project;

import java.awt.Toolkit;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class CompressoReady {
	static int feedback = 0;
	Scanner scanner = new Scanner(System.in);
	public void inputBean(){
		System.out.printf("원두 %dg을 바스켓에 넣고 60ml의 물을 부어주세요.%n", 15+feedback);
		System.out.println("준비가 완료되었다면 엔터키를 눌러주세요.");
		String enter = scanner.nextLine();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
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
					toolkit.beep();
					System.out.println("시간 종료.");
					System.out.println();
					CompressoFinish compressoFinish = new CompressoFinish();
					compressoFinish.finish();
				}
			}
		};
		System.out.println("10초간 약한 압력을 가해 뜸을 들여주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
