import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static int factorial(int x) {
		int result = 1;
		for (int i = 1; i < x + 1; i++) {
			result = result * i;
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int denominator = factorial(N);
		int numerator = factorial(N-K) * factorial(K);
		bw.write(Integer.toString(denominator/numerator));
		bw.flush();
		bw.close();
		br.close();
	}
}