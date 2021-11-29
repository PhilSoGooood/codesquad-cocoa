package project;

import java.util.Timer;
import java.util.TimerTask;

public class V60Blooming {
	public void degassing() {
		Timer timer = new Timer();
		TimerTask degassing = new TimerTask() {
			int count = 50;
			@Override
			public void run() {
				if(count > 0){
					System.out.printf("남은 시간 %d초%n", count);
					count--;
				}
				else {
					timer.cancel();
					System.out.println("시간 종료.");
					V60LastPour lastpour = new V60LastPour();
					lastpour.lastPour();
				}
			}
		};
		System.out.println("스푼으로 원두를 한번 저어준 후 50초간 뜸을 들입니다. ");
		timer.schedule(degassing, 1000, 1000);
	}
}
