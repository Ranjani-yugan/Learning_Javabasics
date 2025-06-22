package Ex_04_TypeCasting;

public class Lab0041 {
    public static void main(String[] args) {
        int course=500;
        float Gst=3.56f;
        int total=course+(int)Gst;
        System.out.println(total);
        float total1=(float)course+Gst;
        System.out.println(total1);

    }
}
