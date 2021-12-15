import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().trim().split(" ");
		String a = input[0];
		String b = input[1];
		for(int i=2; i>=0; i--){
			if(a.charAt(i) > b.charAt(i)){
				for(int j=2; j>=0; j--){
					System.out.print(a.charAt(j));
				}
				break;
			}
			if(a.charAt(i) < b.charAt(i)){
				for(int j=2; j>=0; j--){
					System.out.print(b.charAt(j));
				}
				break;
			}
			if(a.charAt(i) > b.charAt(i)){
				continue;
			}
		}
		br.close();
	}
}


