package Ex_011_ifelse;

import java.util.Scanner;

public class checkfor_vowel {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner scanner=new Scanner(System.in);
         char ch=scanner.next().toLowerCase().charAt(0);

        if((ch=='a')||(ch=='e')||(ch=='o')||(ch=='i')||(ch=='u')) {
            System.out.println("vowel");
        }
        else if(ch>='a'&&ch<='z')
    {
            System.out.println("consonant");
        }
        else{
            System.out.println("invalid input");
        }

    }
}
