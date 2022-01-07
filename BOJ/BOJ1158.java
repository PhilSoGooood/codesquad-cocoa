import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void solution(int N, int K) throws  IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> numbers = new ArrayList<>();
		for(int i=1; i<N+1; i++){
			numbers.add(i);
		}
		int idx = 0;
		String answer = "<";
		while (numbers.size() > 1){
			idx += K-1;
			if(idx > numbers.size()-1)
				while(idx > numbers.size()-1)
					idx -= numbers.size();
			answer += Integer.toString(numbers.get(idx)) + ", ";
			numbers.remove(idx);
		}
		answer += Integer.toString(numbers.get(0)) + ">";
		bw.write(answer);
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		solution(N, K);
		br.close();
	}
}