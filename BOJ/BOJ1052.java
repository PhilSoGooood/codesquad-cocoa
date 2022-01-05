import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int buyBottle = 0;
		while (true){
			// 물병의 수
			int bottleCount = 0;
			// 2진수로 변환하여 1의 숫자만큼 더해준다.
			String binaryBottle = Integer.toBinaryString(N);
			for(int i=0; i<binaryBottle.length(); i++){
				if(binaryBottle.charAt(i) == '1'){ bottleCount++;}
			}
			if(bottleCount <= K){
				bw.write(buyBottle+"");
				break;
			}
			N++;
			buyBottle++;
		}
		bw.close();
		br.close();
	}
}