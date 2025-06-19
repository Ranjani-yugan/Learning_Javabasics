package Ex_09_Switch;


public class check_Vowel {
    public static void main(String[] args) {
        char ch='i';
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println(ch+ "is a vowel");
                break;
            default:

                System.out.println(ch+"is a consonant");
        }
    }
}
