import java.util.*;
class Member {
    String members[] = {"BC", "호두마루", "DAVE", "Barney", "meatsby", "mong", "Jun", "Phil", "Dike", "Jhin"};
    int memberNumber = members.length;
    int inputNumber;

    // 몇명을 뽑을지 input을 받는 method
    public int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명인가요?(1 ~ " + memberNumber + "): ");
        inputNumber = scanner.nextInt();
        while (inputNumber == 0 || inputNumber > memberNumber) {
            System.out.print("멤버 숫자 이내로 입력해주세요: ");
            inputNumber = scanner.nextInt();
        }
        scanner.close();
        return inputNumber;
    }

    // 뽑을 인원만큼의 랜덤숫자(0 ~ 멤버숫자)를 리턴하는 method
    public int[] getRandomNumber(int inputNumber) {
        this.inputNumber = inputNumber;
        Random random = new Random();
        int array[] = new int[inputNumber];

        for(int i=0; i < inputNumber; i++) {
            array[i] = random.nextInt(memberNumber);
            for(int j=0; j < i; j++){
                if(array[i] == array[j]) {
                    i--;
                }
            }
        }
        return array;
    }
}


public class RandomMember {
    public static void main(String[] args) {
        Member member = new Member();
        int n = member.getInputNumber();
        int randomNumber[];
        randomNumber = member.getRandomNumber(n);
        for (int i = 0; i < member.inputNumber; i++) {
            System.out.print(member.members[randomNumber[i]] + " ");
        }
    }
}