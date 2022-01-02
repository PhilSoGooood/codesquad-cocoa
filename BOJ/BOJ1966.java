import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int answer = 1;
			ArrayList<int[]> arr = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				int[] tmp = {Integer.parseInt(st.nextToken()), i};
				arr.add(tmp);
			}
			deque:
			while(true){
				for(int i=1; i<N; i++) {
					if (arr.get(i)[0] > arr.get(0)[0]) {
						int[] tmp = arr.get(0);
						arr.add(tmp);
						arr.remove(0);
						continue deque;
					}
				}
					if(arr.get(0)[1] == M){
						break;
					} else{
						arr.remove(0);
						N--;
						answer++;
					}
				}

			bw.write(answer+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}