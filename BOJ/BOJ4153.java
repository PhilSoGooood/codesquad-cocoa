import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boj:
		while(true){
			int[] input = new int[3];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i< input.length; i++){
				input[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(input);
			int tmp = 0;

			for(int i = 0; i< input.length; i++){
				tmp += input[i];
			}
			if(tmp == 0) break boj;
			else tmp = 0;

			for(int i=0; i<2; i++){
				tmp += Math.pow(input[i], 2);
			}
			if(tmp == Math.pow(input[2], 2)){
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		br.close();
	}
}
