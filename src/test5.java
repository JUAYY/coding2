import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(); // Input 1 time ; user decalre number
        System.out.println("INPUT : " +number);
        // int a = largestNum(number); --> if it return value back
        // System.out.println(a);
        int large = largestNum(number);
        System.out.println("Max is "+large);
    }
    public static int largestNum(int number){
        Scanner in = new Scanner(System.in);
        // int a = 0;
        // System.out.println(number);
        //return a;
        int i;
        int max = 0;
        for(i = 0; i < number ;i++){
            System.out.println("Input number : ");
            int input = in.nextInt(); // 1 2 3
            if(i == 0){
                max = input; // max = 1
            }
            if(i > 0){ // 1 2
                if(input > max){ // 2 > 1 ?
                    max = input; // max = 2
                }
            }
        }
        return max;
    }
}
