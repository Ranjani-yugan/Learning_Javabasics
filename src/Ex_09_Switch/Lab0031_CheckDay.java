package Ex_09_Switch;

import java.util.Scanner;

public class Lab0031_CheckDay {
    public static void main(String[] args) {
        System.out.println("Enter the days");
        Scanner scanner=new Scanner(System.in);
        String day=scanner.next();
        switch (day){
            case "Monday":
                System.out.println("This is day1");
                break;
                case "Tuesday":
                    System.out.println("This is day2");
                    break;
            default:
                System.out.println("invalid statement");
                break;


        }
    }
}
