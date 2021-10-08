public class Hienthicacsonguyentonhohon100 {
    public static void main(String[] args) {
        System.out.println("Các số nt nhỏ hơn 100 :" );
        for (int i = 0;i<=100;i++ ){
            if (check(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean check(int n ){
        if(n <2 )return false;
        for (int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }

}
