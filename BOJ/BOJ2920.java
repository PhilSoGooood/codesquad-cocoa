import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};
		Scanner scanner = new Scanner(System.in);
		int[] sounds = new int[8];
		for(int i=0; i<sounds.length; i++){
			sounds[i] = scanner.nextInt();
		}
		if(Arrays.equals(sounds, ascending)){
			System.out.println("ascending");
		}
		if(Arrays.equals(sounds, descending)){
			System.out.println("descending");
		}
		if(!Arrays.equals(sounds, ascending) && !Arrays.equals(sounds, descending)){
			System.out.println("mixed");
		}
	}
}
