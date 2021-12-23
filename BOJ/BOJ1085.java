import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int result = h;
		if(Math.abs(x-0) < result) result = Math.abs(x-0);
		if(Math.abs(x-w) < result) result = Math.abs(x-w);
		if(Math.abs(y-0) < result) result = Math.abs(y-0);
		if(Math.abs(y-h) < result) result = Math.abs(y-h);
		System.out.println(result);
		br.close();
	}
}
