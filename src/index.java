import java.util.Scanner;

    public class index {
        public static float celsiusToFahrenheit(float Celsius) {
            Scanner in = new Scanner(System.in);
            float celsius = in.nextFloat();
            System.out.println("Enter you temp: " +celsius);
            float Fahrenheit = (celsius * 9/5) +32;
            return Fahrenheit;
            
        }
     public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(52)); // Expected result?
        System.out.println(celsiusToFahrenheit(0)); // Expected result?
     }

        // - - - - - - - - - - - - - -  - - - - - //
       /* point 2 .) public static void main(String[] args) throws Exception {
            Scanner in = new Scanner(System.in);
            float passGrade = in.nextFloat();
            System.out.println("Enter your passGrade : " + passGrade);
            if (passGrade >= 2.0 && passGrade <= 4.0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }*/ 
    }
