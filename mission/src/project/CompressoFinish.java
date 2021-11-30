package project;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class CompressoFinish {
	public void finish() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			int count = 30;
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
				}
			}
		};
		System.out.println("30초동안 압력을 가해 에스프레소를 추출해주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
