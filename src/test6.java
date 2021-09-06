import java.util.Scanner;
public class test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();
        double total;
        if(unit < 0){
            total = 0;
        }
        else if(unit > 0 && unit <= 35){
            total = 85;
        }
        else if(unit > 35 && unit <= 150){
            total = 85 + (unit-35)*1.12;
        }
        else {
            total = 85 + (115*1.12) + ((unit - 150)*2.13);
        }
        System.out.println("Total is " +total);
    }
}
