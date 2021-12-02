import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		String tmp = input;
		String N;
		int a, b;
		int cnt = 0;

		while(true){
			if(tmp.length() == 1){
				tmp = "0" + tmp;
				a = tmp.charAt(0) - '0';
				b = tmp.charAt(1) - '0';
				N = Integer.toString(a+b);
				tmp = Integer.toString(b) + N.charAt(N.length()-1);
				cnt++;
			} else if(tmp.length() == 2){
				a = tmp.charAt(0) - '0';
				b = tmp.charAt(1) - '0';
				N = Integer.toString(a+b);
				tmp = Integer.toString(b) + N.charAt(N.length()-1);
				cnt++;
			}
			if(Integer.parseInt(tmp) == Integer.parseInt(input)){
				break;
			}
		}
		System.out.println(cnt);
	}
}