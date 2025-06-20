package Ex_06_User_Input;

import java.util.Scanner;

public class Lab0023_CLI_input {
    public static void main(String[] args) {
        System.out.println("Enter your age");

        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        String CanIvote=age>=18? "yes":"No";
        System.out.println(CanIvote);
    }
}
