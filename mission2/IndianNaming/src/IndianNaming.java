import java.util.Scanner;

class Naming {
	String[] indianYear = {"시끄러운", "푸른", "적색", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운", "욕심많은"};
	String[] indianMonth = {"늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛", "말", "돼지", "하늘", "바람"};
	String[] indianDay = {"와(과) 함께 춤을", "의 기상", "은(는) 그림자속에", "", "", "", "의 환생", "의 죽음", "아래에서", "를(을) 보라", "이(가) 노래하다", "그림자", "의 일격", "에게 쫒기는 남자", "의 행진",
	"의 왕", "의 유령", "을 죽인자", "은(는) 맨날 잠잔다", "처럼", "의 고향", "의 전사", "은(는) 나의 친구", "의 노래", "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "을(를) 쓰러뜨린 자", "의 혼", "은(는) 말이 없다"};
	public void makeIndianName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("생년월일을 입력해주세요(공백 구분): ");
		String year = scanner.next();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		scanner.close();
		System.out.println("당신의 이름은 " + indianYear[year.length()] + indianMonth[month-1] + indianDay[day-1] + "입니다.");
	}

}


public class IndianNaming {
	public static void main(String[] args) {
		Naming naming = new Naming();
		naming.makeIndianName();
	}
}
