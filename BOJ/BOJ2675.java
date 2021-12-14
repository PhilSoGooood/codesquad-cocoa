import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static void repeat(int N, char c) {
		for (int i = 0; i < N; i++) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			String S = input[1];
			for(int i=0; i<S.length(); i++){
				repeat(N, S.charAt(i));
			}
			System.out.println();
		}
		br.close();
	}
}

