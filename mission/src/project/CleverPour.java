package project;

import java.awt.Toolkit;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class CleverPour {
	Scanner scanner = new Scanner(System.in);
	public void pour() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			int count = 10;

			@Override
			public void run() {
				if (count > 0) {
					System.out.printf("남은 시간 %d초%n", count);
					count--;
				} else {
					timer.cancel();
					toolkit.beep();
					System.out.println("시간 종료.");
					System.out.println();
					CleverBlooming cleverBlooming = new CleverBlooming();
					cleverBlooming.blooming();
				}
			}
		};
		System.out.println("준비가 완료되었다면 엔터키를 눌러주세요.");
		String enter = scanner.nextLine();

		System.out.println("물을 10초동안 전부 부어주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
