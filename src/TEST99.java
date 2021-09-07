import java.util.Scanner;
public class TEST99 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number of value : ");
        int num = in.nextInt();
        int[] arr = new int[num];
        int i;
        System.out.println("Input your value: ");
        for(i=0; i<num; i++){
            arr[i] = in.nextInt(); // i = 0 , i = 1 , i = 2
        }
        for(i=0; i<num; i++){
            System.out.println("Output : " +arr[num-1-i]); // 3 - 1 - 0 = 2 , 3 - 1 - 1 = 1 , 3 - 1 - 2 = 0;
        }
    }
}
