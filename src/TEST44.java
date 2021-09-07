import java.util.Scanner;
public class TEST44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your value : ");
        int val = in.nextInt();
        int total = evenSum1toN(val);
        System.out.println("evenSum = "+total);

    }
    public static int evenSum1toN(int val){
        int i;
        int sum = 0;
        for(i=0; i<val; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
