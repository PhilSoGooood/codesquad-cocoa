import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int result = -A;
		int cnt = 0;
		while(result <= 0){
			if(B >= C){
				cnt = -1;
				break;
			}
			result += (C-B);
			cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
}
