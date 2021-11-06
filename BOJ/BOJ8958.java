import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for(int tc=0; tc<T; tc++){
			int total = 0;
			int score = 0;
			String quiz = scanner.next();
			for(int i=0; i<quiz.length();i++){
				char chr = quiz.charAt(i);
				if(chr == 'O') {
					score += 1;
					total += score;
				} else{
					score = 0;
				}
			}
			System.out.println(total);
		}
		scanner.close();
	}
}
