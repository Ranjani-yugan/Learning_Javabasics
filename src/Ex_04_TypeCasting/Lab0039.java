package Ex_04_TypeCasting;

public class Lab0039 {
    public static void main(String[] args) {
        byte b=23;
        int a=(int)b;//Widening impicit
        System.out.println(a);

         int c=10;
         byte d=(byte)c;//Narrowing explicit
        System.out.println(d);

    }

}
