import java.util.Scanner;

public class M2Q2 {
    public static class Main {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int a = scn.nextInt();
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*\t");
                }
                System.out.println(" ");
            }
        }
    }
}
