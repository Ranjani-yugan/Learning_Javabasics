package Ex_06_User_Input;

import java.util.Scanner;

public class Lab0021_Userinfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        String voting=age>=18 ? "yes":"No";
        System.out.println(voting);





    }
}
