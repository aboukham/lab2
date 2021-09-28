import java.util.Scanner;

public class Question1 {
    public static void main(String [] args){
        Scanner     input;
        String      fName;
        String      lName;
        String      mName;

        input = new Scanner(System.in);
        System.out.println("Enter first name");
        fName = input.next();
        System.out.println("Enter middle name");
        mName = input.next();
        System.out.println("Enter last name");
        lName = input.next();
        System.out.println(fName + " " + mName.charAt(0) + ". " + lName);
    }
}
