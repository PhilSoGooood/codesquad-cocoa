import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int solution(int x, int y, char[][] board){
	char[][] newBoard = new char[8][8];
	for(int i=x; i<x+8; i++) {
		for (int j = y; j < y + 8; j++) {
			newBoard[i-x][j-y] = board[i][j];
		}
	}
	int result1 = 0;
	int[] row = {-1, 0};
	int[] col = {0, -1};
	// 첫 시작이 W인 경우
	if(newBoard[0][0] == 'B'){
		newBoard[0][0] = 'W';
		result1++;
	}
	for(int i=0; i<8; i++){
		for(int j=0; j<8; j++){
			if(i == 0 && j == 0) continue;
			for(int k=0; k<2; k++){
				if(i+row[k] < 0 || j+col[k] < 0) continue;
				if(newBoard[i][j] == newBoard[i+row[k]][j+col[k]]){
					if(newBoard[i][j] == 'W'){
						newBoard[i][j] = 'B';
						result1++;
					} else if(newBoard[i][j] == 'B'){
						newBoard[i][j] = 'W';
						result1++;
					}
				}
			}
		}
	}

	for(int i=x; i<x+8; i++) {
		for (int j = y; j < y + 8; j++) {
			newBoard[i-x][j-y] = board[i][j];
		}
	}
	// 첫 시작이 B인 경우
	int result2 = 0;
	if(newBoard[0][0] == 'W'){
		newBoard[0][0] = 'B';
		result2++;
	}
	for(int i=0; i<8; i++){
		for(int j=0; j<8; j++){
			if(i == 0 && j == 0) continue;
			for(int k=0; k<2; k++){
				if(i+row[k] < 0 || j+col[k] < 0) continue;
				if(newBoard[i][j] == newBoard[i+row[k]][j+col[k]]){
					if(newBoard[i][j] == 'W'){
						newBoard[i][j] = 'B';
						result2++;
					} else if(newBoard[i][j] == 'B'){
						newBoard[i][j] = 'W';
						result2++;
					}
				}
			}
		}
	}
	if(result1 < result2) return result1;
	else return result2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 64;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] board = new char[N][M];
		for(int i=0; i<N; i++){
			String tmp = br.readLine();
			for(int j=0; j<M; j++){
				board[i][j] = tmp.charAt(j);
			}
		}
		for(int i=0; i< board.length-8+1; i++){
			for(int j=0; j<board[0].length-8+1; j++){
				solution(i, j, board);
				int tmp = solution(i, j, board);
				if(result > tmp) result = tmp;
			}
		}
		System.out.println(result);
		br.close();
	}
}
