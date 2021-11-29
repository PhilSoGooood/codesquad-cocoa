package project;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;

public class V60Finish {
	public void spin() {
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
					V60Feedback v60Feedback = new V60Feedback();
					v60Feedback.feedback();
				}
			}
		};
		System.out.println("드리퍼를 잡고 원을 그리며 가볍게 흔들어 주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
