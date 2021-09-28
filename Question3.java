import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner     input;
        String      word;

        input = new Scanner(System.in);
        System.out.println("Enter a word which has odd number of characters");
        word = input.next();
        System.out.println(word.charAt(word.length() / 2));
    }
}
