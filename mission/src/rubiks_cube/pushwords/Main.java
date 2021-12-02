package rubiks_cube.pushwords;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String command;
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int N = scanner.nextInt();

		while(true){
			command = scanner.nextLine();
			if(command.equalsIgnoreCase("L") || command.equalsIgnoreCase("R")){
				break;
			}
		}

		char[] word = input.toCharArray();
		if(command.equals("L")){
			char tmp;
			for(int i=0; i<N; i++){

			}
		}


	}
}
