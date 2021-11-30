package project;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

class CompressoReady {
	public void inputBean(){
		System.out.println("원두 15g을 바스켓에 넣고 60ml의 물을 부어주세요.");
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
					CompressoFinish compressoFinish = new CompressoFinish();
					compressoFinish.finish();
				}
			}
		};
		System.out.println("10초간 약한 압력을 가해주세요.");
		timer.schedule(timerTask, 1000, 1000);
	}
}
