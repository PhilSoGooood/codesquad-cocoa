package mission2.randommember;
import java.util.*;

// main 메소드를 간소화 하기 위해 기능을 더 나누어야 할듯
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