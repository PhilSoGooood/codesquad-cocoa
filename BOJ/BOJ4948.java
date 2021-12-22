import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;
		while ((N = Integer.parseInt(br.readLine())) != 0) {
			boolean[] Arr = new boolean[N * 2 + 1];
			for (int i = N+1; i < N * 2 + 1; i++) {
				Arr[i] = true;
			}
			for (int i = 2; i * i < N * 2 + 1; i++) {
				for (int j = i * i; j < N * 2 + 1; j += i) {
					Arr[j] = false;
				}
			}
			int result = 0;
			Arr[0] = Arr[1] = false;
			for (int i = N+1; i < Arr.length; i++) {
				if (Arr[i] == true) {
					result++;
				}
			}
			System.out.println(result);
		}
		br.close();
	}
}
