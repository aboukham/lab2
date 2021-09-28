import java.util.Scanner;

public class Question2 {
    public static  void main(String [] args){
        Scanner     input;
        String      str;
        int         len;

        input = new Scanner(System.in);
        System.out.println("Enter a string");
        str = input.nextLine();
        len = str.length();
        System.out.println(len);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(len - 1));
    }
}
