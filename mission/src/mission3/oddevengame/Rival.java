package mission3.oddevengame;
import java.util.Random;

// 라이벌 생성 및 랜덤 숫자 생성 기능 구현
class Rival {
	// 라이벌 생성자(소지금 * pow(1.2, stage))
	int money; int pickNum;
	public Rival(int m) {
		money = m;
	}
	public int RandomNumber() {
		Random random = new Random();
		pickNum = random.nextInt(20)+1;
		return pickNum;
	}
}