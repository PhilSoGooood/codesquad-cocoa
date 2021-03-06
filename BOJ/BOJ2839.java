import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		result += (N / 5);
		N -= result * 5;
		while(N >0){
			if(N < 3){
				result--;
				N += 5;
			}
			if(result == 0 && N % 3 > 0){
				result = -1;
				break;
			}
			N-=3;
			result++;
		}
		System.out.println(result);
		br.close();
	}
}
