import java.util.Scanner;

public class ex2017121804 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        char line[]=scn.nextLine().toCharArray();
        int n=line.length;
        int n1=n/2;
        boolean flag=true;
        for (int i=0;i<n1;i++){
            if (line[i]-line[n-1-i]!=0){
                flag=false;
            }
        }
        if (flag=true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
