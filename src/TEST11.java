public class TEST11 {
    public static void main(String[] args) {
        float celsius;
        float Fahrenheit;
        System.out.println(celsiusToFahrenheit(52));
        System.out.println(celsiusToFahrenheit(0));
    }
    public static float celsiusToFahrenheit(float celsius) {
        float Fahrenheit = ((celsius*9)/5)+32;
        return Fahrenheit;
    }
    
}