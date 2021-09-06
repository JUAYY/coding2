import java.util.Scanner;
public class test1 {
    
    public static float celsiusToFahrenheit(float Celsius) {
        Scanner in = new Scanner(System.in);
        float celsius = in.nextFloat();
        float Fahrenheit = (celsius*9) + 27;
        return Fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(52));
        System.out.println(celsiusToFahrenheit(0));
    }
}
