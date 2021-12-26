import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static String solution(String N) {
		String reverseNum = "";
		for(int i=N.length()-1; i>=0; i--) reverseNum += N.charAt(i);
		if(reverseNum.equals(N)) return "yes";
		return "no";
		}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String N = br.readLine();
			if(N.equals("0")) break;
			System.out.println(solution(N));
		}
		br.close();
	}
}
