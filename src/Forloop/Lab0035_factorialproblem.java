package Forloop;

import java.util.Scanner;

public class Lab0035_factorialproblem {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int Factorial=1;
        for(int i=1;i<=n;i++){
            Factorial=Factorial*i;}

            System.out.println("Factorial of"+n + "is" +Factorial);


    }
}
