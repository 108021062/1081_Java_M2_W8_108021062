import java.util.Scanner;

public class M2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int a;
String str="";
while (n>1){
    a=n%2;
    str=Integer.toString(n%2)+str;
    n=n/2;
}
str=1+str;
        System.out.printf("%08d\n",Integer.parseInt(str));
}
}

