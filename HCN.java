import java.util.Scanner;
public class HCN {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhập Chiều Rộng : ");
        int a = SC.nextInt();
        System.out.println("Nhập chiều dài : ");
        int b = SC.nextInt();
        for (int i =0; i <=a;i++){
            for(int j =0 ;j<=b;j++){
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
    }
}
