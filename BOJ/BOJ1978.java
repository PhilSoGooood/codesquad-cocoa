import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		sosu:
		for(int n = 0; n < N; n++){
			int x = Integer.parseInt(st.nextToken());
			if(x == 1) continue sosu;
			for(int i=2; i<x; i++){
				if(x % i == 0 ) continue sosu;
			}
			result++;
		}
		System.out.println(result);
		br.close();
	}
}
