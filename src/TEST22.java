import java.util.Scanner;
public class TEST22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grade = in.nextDouble();
        String output = passGrade(grade);
        System.out.println("Your result : " +output);

    }
    public static String passGrade(double grade) {
        String out = "";
        if(grade >= 2 && grade <= 4){
            out = "True";
        }
        else{
            out = "False";
        }
        return out;
    }
}
