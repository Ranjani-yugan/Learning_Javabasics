package Forloop;

public class palindrome {
    public static void main(String[] args) {
        String str="madam";
        String revstr= "";
        for( int i=0;i<str.length();i++)
        {
            revstr=str.charAt(i)+revstr;
        }

            System.out.println(revstr);

        if(str.equals(revstr)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

}
