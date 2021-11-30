package project;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class CleverStir {
	public void stir() {
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
					CleverWait cleverWait = new CleverWait();
					cleverWait.waitting();
				}
			}
		};
		System.out.println("뚜껑을 열고 스푼으로 원두를 저어주세요. ");
		timer.schedule(timerTask, 1000, 1000);
	}
}