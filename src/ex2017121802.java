import java.util.Scanner;

public class ex2017121802 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int line[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
                line[0][i] = scn.nextInt();
                line[1][i] = scn.nextInt();
                line[2][i] = scn.nextInt();
        }
        if (line[0][0] == line[0][1] && line[0][0] == line[0][2]) {
            System.out.println("True");
        } else if (line[1][0] == line[1][1] && line[1][0] == line[1][2]) {
            System.out.println("True");
        }else if (line[2][0] == line[2][1] && line[2][0] == line[2][2]) {
            System.out.println("True");
        }else if (line[0][0] == line[1][0] && line[0][0] == line[2][0]) {
            System.out.println("True");
        }else if (line[0][1] == line[1][1] && line[0][1] == line[2][1]) {
            System.out.println("True");
        }else if (line[0][2] == line[1][2] && line[0][2] == line[2][2]) {
            System.out.println("True");
        }else if (line[0][0] == line[1][1] && line[0][0] == line[2][2]) {
            System.out.println("True");
        }else if (line[0][2] == line[1][1] && line[0][2] == line[2][0]) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}