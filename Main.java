// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter the unit : ");
        char userChar = scanner.next().charAt(0); // Read the first character entered by the user

        // Convert the character to lowercase
        char lowercaseChar = Character.toLowerCase(userChar);

        // Prompt the user to enter a double
        System.out.print("Enter  the temperature: ");
        double userDouble = scanner.nextDouble(); // Read the double entered by the user
        double c;
        double f;
        double k;
        switch (lowercaseChar){
            case 'k':
                c= userDouble-273.15;
                System.out.println("temperature in celsius : " + c);
                f=(userDouble-273.15)*1.8+32;
                System.out.println("temperature in fahrenheit : " + f);
                break;
            case 'c':
                k=userDouble+273.15;
                System.out.println("temperature in kelvin : " + k);
                 f=1.8*userDouble+32;
                System.out.println("temperature in fahrenheit : " + f);
                break;
            case 'f':
                c=(5.0/9)*(userDouble-32);
                System.out.println("temperature in celsius : " + c);
                k=(userDouble-32)*(5.0/9)+273.15;
                System.out.println("temperature in kelvin : " + k);
        }


    }
}