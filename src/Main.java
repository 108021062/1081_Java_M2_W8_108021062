import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int a = 1; a <= x; a++) {
            for (int b = 1; b <= x - a; b++) {
                System.out.print(' ');
            }
            for (int b = 1; b<= a; b++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    }

