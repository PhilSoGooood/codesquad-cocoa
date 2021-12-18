import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=0; tc<T; tc++){
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] apartment = new int[k+1][n+1];
			if(n==0){
				System.out.println(n);
			}else{
				for(int i=0; i<apartment.length; i++){
					apartment[i][0] = 1;
				}
				for(int i=1; i<apartment[0].length; i++){
					apartment[0][i] = i+1;
				}
				for(int i=1; i<apartment.length; i++){
					for(int j=1; j<apartment[i].length; j++){
						apartment[i][j] = apartment[i-1][j] + apartment[i][j-1];
					}
				}
				System.out.println(apartment[k][n-1]);
			}
		}
		br.close();
	}
}
