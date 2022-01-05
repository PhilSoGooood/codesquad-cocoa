import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int solve(int a, int b){
		// a의 b 거듭제곱의 일의 자릿수를 구함.
		int answer = a%10;
		for(int i=1; i < b; i++){
			answer = (answer * a) % 10;
		}
		// 일의 자릿수가 0일 경우 10번 컴퓨터이므로 10으로 변환.
		answer = (answer == 0)?10:answer;
		return answer;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc<T; tc++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(solve(a, b)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}