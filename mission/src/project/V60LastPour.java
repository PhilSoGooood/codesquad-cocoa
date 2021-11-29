package project;

import java.util.Timer;
import java.util.TimerTask;

public class V60LastPour {
	public void lastPour(){
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
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
					V60Stir stirring = new V60Stir();
					stirring.stir();
				}
			}
		};
		System.out.println("남은 물을 50초동안 전부 부어주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
