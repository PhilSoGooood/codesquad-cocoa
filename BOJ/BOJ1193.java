import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//타겟 번호
		int X = Integer.parseInt(st.nextToken());
		//숫자 갯수
		int N = 0;
		// 단계 카윤트
		int cnt = 0;

		while(N < X){
			cnt++;
			N += cnt;
		}
		// 전단계까지 숫자갯수
		int preNum = N-cnt;
		if(cnt%2 == 1){
			System.out.printf("%d/%d%n",cnt+1-(X-preNum), X-preNum);
		} else {
			System.out.printf("%d/%d%n",X-preNum,cnt+1-X+preNum);
		}

		br.close();
	}
}
