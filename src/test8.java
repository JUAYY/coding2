import java.util.Scanner;
public class test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number >2 && number %2 != 0 && number %3 != 0 && number %5 != 0 && number %7 != 0 || number == 2 || number == 3 ||
        number == 5 || number == 7){
            System.out.println("A prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }
}
