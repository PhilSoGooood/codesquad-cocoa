package project;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;

class V60FirstPour {
	public void firstPour(){
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
					V60Blooming blooming = new V60Blooming();
					blooming.degassing();
				}
			}
		};
		System.out.println("물 66ml를 10초동안 평평하게 부어주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
