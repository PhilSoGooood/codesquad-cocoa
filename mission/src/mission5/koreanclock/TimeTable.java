package mission5.koreanclock;
import java.time.LocalTime;
//시간 테이블 클래스 및 출력 메소드
class TimeTable {
	String[][] table = {{"한", "두", "세", "네", "다", "섯"}, {"여", "섯", "일", "곱", "여", "덟"},
		{"아", "홉", "열", "한", "두", "시"}, {"자", "이", "삼", "사", "오", "십"}, {"정", "일", "이", "삼", "사", "육"},
		{"오", "오", "칠", "팔", "구", "분"}};

	void printTable() {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
	// 현재 시간 출력
	LocalTime localTime = LocalTime.now();
	void print() {
		System.out.println(localTime);
	}
}