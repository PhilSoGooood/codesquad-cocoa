import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int croAlpha(String input) {
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'c') {
				if (i != input.length() - 1) {
					if (input.charAt(i + 1) == '=') {
						result++;
						i++;
						continue;
					}
					if (input.charAt(i + 1) == '-') {
						result++;
						i++;
						continue;
					}
				}
				result++;
				continue;
			}
			if (input.charAt(i) == 'd') {
				if (i != input.length() - 1) {
					if (i != input.length()-2 && input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=' ) {
						result++;
						i += 2;
						continue;
					}
					if (input.charAt(i + 1) == '-') {
						result++;
						i++;
						continue;
					}
				}
				result++;
				continue;
			}
			if (input.charAt(i) == 'l') {
				if (i != input.length() - 1) {
					if (input.charAt(i + 1) == 'j') {
						result++;
						i++;
						continue;
					}
				}
				result++;
				continue;
			}
			if (input.charAt(i) == 'n') {
				if (i != input.length() - 1) {
					if (input.charAt(i + 1) == 'j') {
						result++;
						i++;
						continue;
					}
				}
				result++;
				continue;
			}
			if (input.charAt(i) == 's') {
				if(i != input.length()-1) {
					if (input.charAt(i + 1) == '=') {
						result++;
						i++;
						continue;
					}
				}
				result++;
				continue;
			}
			if (input.charAt(i) == 'z') {
				if(i != input.length()-1) {
					if (input.charAt(i + 1) == '=') {
						result++;
						i++;
						continue;
					}
				}
				result++;
				continue;
			}
			result++;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(croAlpha(input));
		br.close();
	}
}


