package mission3.oddevengame;
public class Player {
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