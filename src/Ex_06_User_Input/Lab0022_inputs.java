package Ex_06_User_Input;

import java.util.Scanner;

public class Lab0022_inputs {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner=new Scanner(System.in);
                int a=scanner.nextInt();
        System.out.println(a);
        System.out.println("Enter the Name");
        String name= scanner.next();
        System.out.println(name);
        System.out.println("enter the details");
        double d=scanner.nextDouble();
        System.out.println(d);
                
    }
}
