import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static int solution(int N) {
		for(int i=0; i<N; i++){
			int tmp = i;
			String number = Integer.toString(i);
			for(int j=0; j<number.length(); j++){
				tmp += number.charAt(j) - '0';
			}
			if(tmp == N) return i;
		}
		return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(solution(N));

		br.close();
	}
}
