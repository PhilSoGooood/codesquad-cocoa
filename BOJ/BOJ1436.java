import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int num = 666;
		while (cnt < N) {
			String number = Integer.toString(num);
			for (int i = 0; i < number.length()-2; i++) {
				if (number.charAt(i) == '6' && number.charAt(i+1) == '6' && number.charAt(i+2) == '6'){
					cnt++;
					break;
				}
			}
			if(cnt == N){
				break;
			}
			num++;

		}
		System.out.println(num);
		br.close();
	}
}
