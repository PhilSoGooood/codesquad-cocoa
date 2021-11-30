package project;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;

public class V60Stir {
	public void stir(){
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
					System.out.println();
					V60Finish finish = new V60Finish();
					finish.spin();
				}
			}
		};
		System.out.println("스푼으로 원두를 저어줍니다.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
