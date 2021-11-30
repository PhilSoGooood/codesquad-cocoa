package project;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class CleverWait {
	public void waitting() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			int count = 60;

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
					CleverBrewing cleverBrewing = new CleverBrewing();
					cleverBrewing.brewing();
				}
			}
		};
		System.out.println("뚜껑을 닫고 1분간 기다려주세요. ");
		timer.schedule(timerTask, 1000, 1000);
	}
}