package project;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class CleverBrewing {
	public void brewing() {
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
					CleverFeedback cleverFeedback = new CleverFeedback();
					cleverFeedback.feedback();
				}
			}
		};
		System.out.println("클레버를 서버 위에 올리고 1분간 추출합니다. ");
		timer.schedule(timerTask, 1000, 1000);
	}
}