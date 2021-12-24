import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(x.contains(a)){
				x.remove(x.indexOf(a));
			} else {
				x.add(a);
			}
			if(y.contains(b)){
				y.remove(y.indexOf(b));
			} else {
				y.add(b);
			}
		}
		System.out.println(x.get(0) + " " + y.get(0));
		br.close();
	}
}
