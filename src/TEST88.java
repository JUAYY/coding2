import java.util.Scanner;
public class TEST88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num > 1 && num % 2 != 0 && num % 3 != 0 && num %5 != 0 && num % 7 != 0 || num == 2 || num == 3 || num == 5 || num == 7){
            System.out.println("It's a prime number.");
        }
        else{
            System.out.println("It's not a prime number !!!");
        }
    }
}
