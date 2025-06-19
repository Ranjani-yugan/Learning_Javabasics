package Ex_09_Switch;

import java.util.Scanner;

public class grade_Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner scanner=new Scanner(System.in);
        int mark= scanner.nextInt();

                if(mark>=90){
                System.out.println("A Grade");
                }
            else if(mark>=80) {
                    System.out.println(" b grade");
                }
            else if (mark>=70){
                System.out.println("C grade");
            }
            else if (mark>=60){
                System.out.println("D Grade");
            }
            else {
                    System.out.println("E grade");
                }

    }

}
