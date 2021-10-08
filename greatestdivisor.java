 import java.util.Scanner;
public class greatestdivisor {
    public static int UCLN ( int a, int b){
        while (a != b) {
            if (a>b){
                a -=b;
            }
            else {
                b-=a;
            }
        }return (a) ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập a");
        int a = input.nextInt();
        System.out.println("Nhập b");
        int b = input.nextInt();
        System.out.println("Uoc chung lon nhat cua " + a +" va " + b + " la " + UCLN(a,b));
    }

}

