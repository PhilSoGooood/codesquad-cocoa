import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int num = Integer.valueOf(N);
		for(int i=1; i<10; i++){
			System.out.println(N +" * "+ i +" = "+ i*num);
		}
	}
}

