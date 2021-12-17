import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int result = 1;
		int cnt = 1;
		while(result < N){
			result += 6*cnt;
			cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
}
