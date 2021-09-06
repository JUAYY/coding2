import java.util.Scanner;
public class test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int i;
        int[] value = new int[number];
        System.out.println("Please enter number : ");
        for(i=0;i<number;i++){
            value[i] = in.nextInt();
        }
        System.out.println("--------------------");
        for(i=0;i<number;i++){
            System.out.println(value[number-1-i]);
        }
    }
}
