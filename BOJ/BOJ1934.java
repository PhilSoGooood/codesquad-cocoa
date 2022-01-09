import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static long solution(int x, int y){
		long answer = 1;
		loop:
		while(true){
			for(int i=2; i<Math.min(x, y)+1; i++){
				if(x % i == 0 && y % i == 0){
					x /= i;
					y /= i;
					answer *= i;
					continue loop;
				}
			}
			answer = answer * x * y;
			break;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=0; tc<T; tc++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			bw.write(solution(x, y)+ "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}