import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String chrs = scanner.nextLine().strip();
		if (chrs.length() == 0) {
			System.out.println(0);
		} else {
			String[] splited = chrs.split("\\s+");
			System.out.println(splited.length);
		}
	}
}
