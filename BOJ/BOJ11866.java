import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> numbers = new LinkedList<>();
		for(int i=1; i<N+1; i++){
			numbers.offer(i);
		}
		bw.write("<");

		while(numbers.size() > 1){
			for(int i=0; i<K-1; i++){
				int tmp = numbers.poll();
				numbers.offer(tmp);
			}
			int tmp = numbers.poll();
			bw.write(tmp+", ");
		}
		int tmp = numbers.poll();
		bw.write(tmp+">");
		bw.flush();
		bw.close();
		br.close();
	}
}