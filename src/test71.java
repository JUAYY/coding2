import java.util.Scanner;

public class test71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Input number: ");
        printN(num);
    }

    public static void printN(int num) {
        int i = 0;
        int j = 0;
        char[] row = {'*', '-', '-', '-', '-', '*'};
        for (i = 0; i <= num; i++) {
            System.out.println("");
            row[i] = '*';
            if (i > 0) {
                row[i - 1] = '-';
            }
            row[0] = '*';
            for (j = 0; j <= num; j++) {
                System.out.print(row[j]);
            }
        }
        System.out.println();
    }

}
