import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int pass=0,total=0,m=0;
            for (int j=1;j<=3;j++) {
                int n1 = sc.nextInt();
                if (n1>=60){
                    pass++;
                }
                total+=n1;
                m=Math.max(m,n1);

            }if (pass==3){
                System.out.println("P");
            }else if (pass==2&&total>=220){
                System.out.println("P");
            }else if (pass==2){
                System.out.println("M");
            }else if (m>=80){
                System.out.println("M");
            }else{
                System.out.println("F");
            }
        }
    }
}



