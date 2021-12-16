import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	static int groupWordChecker(String input) {
		int result = 0;
		if(input.length() == 0){return result;}
		HashSet<Character> characters = new HashSet<>();
		characters.add(input.charAt(0));
		for(int i=1; i<input.length(); i++){
			if((input.charAt(i) != input.charAt(i-1)) && characters.contains(input.charAt(i))){
				return result;
			}
			characters.add(input.charAt(i));
		}
		result = 1;
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int result = 0;
		for(int tc=0; tc<T; tc++){
			String input = br.readLine();
			result += groupWordChecker(input);
		}
		System.out.println(result);
		br.close();
	}
}


