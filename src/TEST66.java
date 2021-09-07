import java.util.Scanner;
public class TEST66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double unit = in.nextDouble();
        double price = 0;
        if(unit < 0){
            System.out.println("Total : 0 ");
        }
        else if(unit > 0 && unit <= 35){
            System.out.println("Total : 85 ");
        }
        else if(unit > 35 && unit <= 150){
            price = 85 + (unit - 35)*1.12;
            System.out.println("Total : " +price);
        }
        else if(unit > 150){
            price = 85 + (115*1.12) + (unit - 35 - 115)*2.13;
            System.out.println("Total : " +price);
        }
    }
}
