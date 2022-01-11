import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static String solution(String S) {
		StringBuilder sb = new StringBuilder();
		String tmp = "";
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '<') {
				sb.append(tmp);
				tmp = "";
				while (true) {
					sb.append(S.charAt(i));
					if (S.charAt(i) == '>') {
						break;
					}
					i++;
				}
			} else if (S.charAt(i) == ' ') {
				sb.append(tmp + " ");
				tmp = "";
			} else {
				tmp = S.charAt(i) + tmp;
			}
		}
		sb.append(tmp);

		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		System.out.println(solution(S));

	}
}
