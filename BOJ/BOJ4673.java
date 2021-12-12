import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int checkNum(int x) {
		String num = Integer.toString(x);
		int result = 0;
		for (int i = 0; i < num.length(); i++) {
			result += (num.charAt(i) - '0');
		}
		return result + x;
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> selfNumbers = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			selfNumbers.add(i + 1);
		}
		for (int i = 0; i < 10000; i++) {
			if (selfNumbers.contains(checkNum(i+1))) {
				selfNumbers.remove(selfNumbers.indexOf(checkNum(i+1)));
			}
		}
		for (int i = 0; i < selfNumbers.size(); i++) {
			System.out.println(selfNumbers.get(i));
		}
	}
}

