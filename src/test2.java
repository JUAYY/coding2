import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float grade = in.nextFloat();
        String output = passGrade(grade);
        System.out.println("Output : " +output );
    }

    public static String passGrade(float grade) {
        String out="";
        if(grade >= 2.0 && grade <= 4.0){
            out = "True";
        }
        else{
            out = "False";
        }
        return out;
    }
}
