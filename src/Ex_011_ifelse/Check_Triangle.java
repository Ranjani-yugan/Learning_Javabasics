package Ex_011_ifelse;

import java.util.Scanner;

public class Check_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter sideA");
        Scanner scanner=new Scanner(System.in);
        int sideA=scanner.nextInt();
        System.out.println("Enter SideB");
        int sideB=scanner.nextInt();
        System.out.println("Enter sidec");
        int sideC=scanner.nextInt();
        if((sideA==sideB)&&(sideB==sideC)){
            System.out.println("Equilateral Triangle");

        } else if ((sideA==sideB)||(sideB==sideC)||(sideA==sideC)){
            System.out.println("Isoceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }

    }
}
