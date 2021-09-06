import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("input : ");
        Scanner in = new Scanner(System.in);
        int Temp = in.nextInt();
        printWeather(Temp);
        String output = printWeather(Temp);
        System.out.println("Output: " + output);
    }

    public static String printWeather(int Temp) {
        String out ="";
        if (Temp >= 0 && Temp < 10) {
            out = "Too cold";
        } else if (Temp >= 10 && Temp < 20) {
            out = "Cold";
        } else if (Temp >= 20 && Temp < 30) {
            out = "Normal";
        } else if (Temp >= 30 && Temp < 40) {
            out = "Hot";
        } else if (Temp > 40) {
            out = "Very hot";
        }
        return out;
    }
}
