import java.util.Scanner;
public class TEST55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number : ");
        int num = in.nextInt();
        int i;
        int[] val = new int[num]; 
        System.out.println("Input your value : ");
        for(i=0; i<num; i++){
            val[i] = in.nextInt();
        }
        int largest = largestNum(num, val);
        double average = averageNum(num, val);
        System.out.println("The largest number : " +largest);
        System.out.println("Average of number : " +average);
        
    }
    public static int largestNum(int num, int[] val) {
        int i;
        int max = 0;
        for(i=0; i<num; i++){
            if(i == 0){
                max = val[i];
            }
            if (i > 0){
                if(val[i] > max){
                    max = val[i];
                }
            }
        }
        return max;
    }
    public static double averageNum(int num, int[] val){
        int i;
        int sum = 0;
        for(i=0; i<num; i++){
                sum = sum + val[i];
        }
        double avg = sum / num;
        
        return avg;
    }
}
