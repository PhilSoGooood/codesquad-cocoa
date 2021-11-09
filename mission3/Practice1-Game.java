import java.util.Random;
import java.util.Scanner;

// Player 클래스 생성 및 홀짝 입력 메소드 기능
class Player {
	public double money = 100;
	public String InputName() {

		System.out.print("이름을 입력해주세요: ");
		String name = Game.scanner.next();
		return name;
	}
	public String PickNumber() {
		System.out.print("홀 또는 짝을 입력해주세요: ");
		String pick = Game.scanner.next();
		return pick;
	}
}

// 라이벌 생성 및 랜덤 숫자 생성 기능 구현
class Rival {
	// 라이벌 생성자(소지금 * pow(1.2, stage))
	double money;
	public Rival(double m) {
		money = m;
	}
	public int RandomNumber() {
		Random random = new Random();
		int picknum = random.nextInt(20)+1;
		return picknum;
	}
}

// 게임 클래스 및 게임오버시까지 최대 8번 배팅
class Gamble {
	Player player = new Player();
	String name = player.InputName();
	String rivalNum; String playerNum;

	public void betting() {
		for (int i = 0; i < 8; i++) {
			System.out.println();
			System.out.println("Stage " + (i+1));
			Rival rival = new Rival(player.money * Math.pow(1.2, i+1));
			while((player.money > 0)&&(rival.money > 0)){
				double maxbetting = Math.min(player.money, rival.money);
				System.out.print("배팅금액을 입력해주세요(배팅한도: "+ (int)maxbetting+"): ");
				double bettingMoney = Game.scanner.nextDouble();
				while(bettingMoney > maxbetting){
					System.out.println("배팅한도를 초과하였습니다.");
					System.out.print("배팅금액을 다시 입력해주세요: ");
					bettingMoney = Game.scanner.nextDouble();
				}
				if (rival.RandomNumber() % 2 == 0) {
					rivalNum = "짝";
				} else {
					rivalNum = "홀";
				}
				playerNum = player.PickNumber();
				// 이긴 경우: 홀짝이 같은 경우
				if (rivalNum.equals(playerNum)) {
					player.money += bettingMoney;
					rival.money -= bettingMoney;
					System.out.println("승리!");
					System.out.println("현재 "+ name +"의 소지금은 "+ (int)player.money + ", 상대방의 소지금은 "+ (int)rival.money + "입니다.");
					System.out.println();
				} else {
					//	진 경우: 홀짝이 다른 경우
					player.money -= bettingMoney;
					rival.money += bettingMoney;
					System.out.println("패배!");
					System.out.println("현재 "+ name +"의 소지금은 "+ (int)player.money + ", 상대방의 소지금은 "+ (int)rival.money + "입니다.");
					System.out.println();
				}
			}
			// 플레이어의 소지금이 0원이 되면 게임 종료
			if(player.money <= 0) {
				System.out.println();
				System.out.println("Game Over");
				System.out.println(i+1 + "번째 스테이지에서 " + name +"의 소지금은 " + (int)player.money + "입니다.");
				return ;
			}
		}
		// 게임을 클리어하면 다음 문구 출력
		System.out.println("Clear!");
		System.out.println("최종 " + name +"의 소지금은 " + (int)player.money + "입니다.");
	}
}

public class Game {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Gamble gamble = new Gamble();
		gamble.betting();
		scanner.close();
	}

}

