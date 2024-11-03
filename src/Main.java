import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);

        //User input code
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        //Celcius to Farenheit Conversion
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        //Show results
        System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit. ");
    }

}
