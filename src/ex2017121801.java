import java.util.Scanner;

public class ex2017121801 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int line[]=new int[3];
        line[0]=scn.nextInt();
        line[1]=scn.nextInt();
        line[2]=scn.nextInt();
        int max=0;
        int min=0;
        for (int i=0;i<3;i++){
            if (line[0]>line[i]){
                min=line[i];
            }
            if (line[0]<line[i]){
                max=line[i];
            }
        }
        System.out.println(max+"\n"+min);
    }
}
