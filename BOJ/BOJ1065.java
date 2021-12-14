import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static int check(int N) {
		int result = 0;
		hansu:
		for(int i=1; i<N+1; i++){
			String num = Integer.toString(i);
			for(int j=num.length()-1; j> 1; j--){
				if(num.charAt(j) - num.charAt(j-1) != num.charAt(j-1) - num.charAt(j-2)){
					continue hansu;
				}
			}
			result++;
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(check(N));
	}
}

