import java.util.Scanner;

public class M2T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0;
        while (n != -999) {
            if (n > 0) {
                a++;
            } else if (n == 0) {
                b++;
            } else {
                c++;
            }
            n = sc.nextInt();
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
