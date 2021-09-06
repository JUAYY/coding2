import java.util.Scanner;
public class test10 {
    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        int[] input1 = new int[val];
        int[] input2 = new int[val];
        for(i=0;i<val;i++){
            System.out.println("input 1 : ");
            input1[i] =in.nextInt();
        } 
        for(i=0;i<val;i++){
            System.out.println("input 2 : ");
            input2[i] =in.nextInt();
        }
        int output1 = numCommonIntegers(input1, input2);
        System.out.println("Output : " +output1);

        int[] output2 = commonIntegers(input1, input2, output1);
        for(i=0; i < output1; i++){
            System.out.print(" "+output2[i]+" ");
        }        
    }
    public static int numCommonIntegers(int[] input1,  int[] input2) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int sum = 0;
        for(i=0; i < input1.length; i++){
            for(j=0;j < input2.length; j++){
                if(input1[i] == input2[j]){
                    sum = sum+1;
                }
            }
        }
        return sum;
    }

    public static int[] commonIntegers(int[] input1, int[] input2, int output1) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;
        int[] out = new int[output1];
        for(i=0; i < input1.length; i++){
            for(j=0; j < input2.length; j++){
                if(input1[i] == input2[j]){
                    sum++;
                    out[count] = input1[i];
                    count++;
                }
            }
        }
        return out;
    }
}
