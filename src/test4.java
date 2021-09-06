import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Enter your number: "+num);
        int total = evenSum1toN(num);
        System.out.println("total even : "+total);
    }
    public static int evenSum1toN(int num){
        //System.out.println(num);
        int i;
        int sum = 0;
        for(i=0; i<num; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
