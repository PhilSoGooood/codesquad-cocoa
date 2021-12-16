import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static int dial(String input){
		int result = 0;
		for(int i=0; i<input.length(); i++){
			if(65 <= (int)input.charAt(i) && (int)input.charAt(i) < 68){result += 3; continue;}
			if(68 <= (int)input.charAt(i) && (int)input.charAt(i) < 71){result += 4; continue;}
			if(71 <= (int)input.charAt(i) && (int)input.charAt(i) < 74){result += 5; continue;}
			if(74 <= (int)input.charAt(i) && (int)input.charAt(i) < 77){result += 6; continue;}
			if(77 <= (int)input.charAt(i) && (int)input.charAt(i) < 80){result += 7; continue;}
			if(80 <= (int)input.charAt(i) && (int)input.charAt(i) < 84){result += 8; continue;}
			if(84 <= (int)input.charAt(i) && (int)input.charAt(i) < 87){result += 9; continue;}
			if(87 <= (int)input.charAt(i) && (int)input.charAt(i) < 91){result += 10;}
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		System.out.println(dial(input));
		br.close();
	}
}


