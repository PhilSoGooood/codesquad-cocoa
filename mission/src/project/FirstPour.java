package project;
import java.util.Timer;
import java.util.TimerTask;

class FirstPour {
	public void firstPour(){
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
					System.out.println("시간 종료.");
					Blooming blooming = new Blooming();
					blooming.degassing();
				}
			}
		};
		System.out.println("물 66ml를 평평하게 부어주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
