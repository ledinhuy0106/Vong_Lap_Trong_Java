import java.util.Scanner;
public class Kientrasonguyento {
   public static void main(String[] args) {
      int n ;
      Scanner Check = new Scanner(System.in);
       System.out.println("nhập vào n : ");
      n = Check.nextInt();
      if (snt(n)==true) System.out.println("snt");
      else System.out.println("Do not is prime");
   }
   public static boolean snt (int n){
       if (n==0||n==1)return false;
       for (int i=2;i<=n-1;i++){
           if(n%i==0)return false;
       }
       return true;
    }

}

