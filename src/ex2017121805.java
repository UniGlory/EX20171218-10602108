import java.util.Scanner;

public class ex2017121805 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(),m=scn.nextInt();
        System.out.println(fun(n)/fun(m)*fun(n-m));
    }
    public static int fun(int n){
        int sum1=1;
        for (int i=n;i>1;i--){
            sum1=sum1*i;
        }
        return sum1;
    }
}

