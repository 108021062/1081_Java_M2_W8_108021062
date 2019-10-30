import java.util.Scanner;

public class M2T44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == -999) {
                break;
            }
            if (n > 0) {
                a+=1;
            } else if (n == 0) {
                b+=1;
            } else {
                c+=1;
            }


        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
