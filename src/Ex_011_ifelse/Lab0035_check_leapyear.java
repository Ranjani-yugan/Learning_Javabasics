package Ex_011_ifelse;

import java.util.Scanner;

public class Lab0035_check_leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");}
    }
}
