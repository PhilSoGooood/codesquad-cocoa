import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] arrN = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		int[] arrM = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arrM[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrN);
		next:
		for (int num : arrM) {
			int start = 0;
			int end = N - 1;
			while (start <= end) {
				int mid = (end + start) / 2 ;
				if (num == arrN[mid]) {
					bw.write(1 + "\n");
					continue next;
				} else if(num < arrN[mid]){
					end = mid - 1;
				} else if(arrN[mid] < num){
					start = mid + 1;
				}
			}
			bw.write(0 + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}