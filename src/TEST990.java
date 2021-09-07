import java.util.Scanner;
public class TEST990 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number: ");
        int num = in.nextInt();
        System.out.println("Input your value: ");
        int[] arr = new int[num];
        int i;
        for(i=0; i<num; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Reverse order : ");
        for(i=0; i<num; i++){
            System.out.println("" +arr[num-1-i]);
        }
    }
}
