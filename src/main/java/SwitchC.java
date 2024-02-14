import java.util.Scanner;

public class SwitchC {
    public static Scanner keyboard;
    public static void main(String[] args) {


        //liceNaPravougulnik();
        //positiveOrNegative();
        //whichOneIsGreater();


        keyboard = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7:");
        int dayNumber = keyboard.nextInt();

        String dayName;

        switch (dayNumber){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input";
                break;
        }

        System.out.println("You entered " + dayNumber + " . So weekday is " + dayName + ".");


    }
    public static void liceNaPravougulnik () {

        keyboard = new Scanner(System.in);
        System.out.println("Въведи дължина на правоъгълник:");
        double duljina = keyboard.nextDouble();

        while (duljina <= 0) {
            System.out.println("Въведи положително число");
            duljina = keyboard.nextDouble();
        }

        keyboard = new Scanner(System.in);
        System.out.println("Въведи височина на правоъгълник:");
        double visochina = keyboard.nextDouble();

        while (visochina <= 0) {
            System.out.println("Въведи положително число");
            visochina = keyboard.nextDouble();
        }

        double lice = duljina * visochina;
        System.out.println("Лицето на правоъгълника е: " + lice + "!");

        double perimetur = (2 * duljina) + (2 * visochina);   //Обиколка
        System.out.println("Периметъра на правоъгълника е: " + perimetur + "!");
    }
    public static void positiveOrNegative() {

        keyboard = new Scanner(System.in);
        System.out.println("Въведи число: ");
        int number = keyboard.nextInt();

        if (number >= 0) {
            System.out.println(number + " е положително число.");
        }else
            System.out.println(number + " е негативно число");


    }
    public static void whichOneIsGreater() {

        keyboard = new Scanner(System.in);
        System.out.println("Число 1: ");
        double number1 = keyboard.nextDouble();

        keyboard = new Scanner(System.in);
        System.out.println("Число 2: ");
        double number2 = keyboard.nextDouble();

        keyboard = new Scanner(System.in);
        System.out.println("Число 3: ");
        double number3 = keyboard.nextDouble();

        double largest;
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >=number3) {
            largest = number2;
        }else {
            largest = number3;
        }
        System.out.println("Най-голямото число е: " + largest);
    }
}
