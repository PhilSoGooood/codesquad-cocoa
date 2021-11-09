package mission3.oddevengame;
import java.util.Scanner;

public class Game {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Gamble gamble = new Gamble();
		gamble.betting();
		scanner.close();
	}
}

