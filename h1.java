import java.util.*;
public class h1 {
    public static double  volumeSphere(int r){
    //  int r=sc.nextInt();
     return (4.0/3.0)*Math.PI*r*r*r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of r");
        int r=sc.nextInt();
        System.out.println(volumeSphere(r));

 }
}
