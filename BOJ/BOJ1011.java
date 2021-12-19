import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=0; tc<T; tc++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int result = 0;
			int move = 1;
			double distance = (double)(y-x);
			int root = (int)Math.sqrt(y-x);
			while(move < root){
				result+=2;
				distance -= (move)*2;
				move++;
			}
			while(distance > 0){
				if(distance >= root){
					distance -= root;
					result++;
				} else if(distance < root){
					distance -= move;
					result++;
				} else if(distance < move){
					distance -= --move;
					result++;
				}
			}
			System.out.println(result);
		}
		br.close();
	}
}
