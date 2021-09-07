import java.util.Scanner;
public class TEST33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your Temperature: ");
        double temp = in.nextDouble();
        String output = printWeather(temp);
        System.out.println("Your weather today : " +output);

    }
    public static String printWeather(double temp) {
        String out = "";
        if(temp < 0){
            out = "Freezing weather";
        }
        else if(temp >= 0 && temp < 10){
            out = "Very cold weather";
        }
        else if(temp >= 10 && temp < 20){
            out = "Cold weather";
        }
        else if(temp >= 20 && temp < 30){
            out = "Normal in Temp";
        }
        else if(temp >= 30 && temp < 40){
            out = "Its hot !!!";
        }
        else{
            out = "Very hot";
        }
        return out;
    }
}
